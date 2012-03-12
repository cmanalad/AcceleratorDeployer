package com.guidewire.accel.util;

import java.io.*;
import java.util.ArrayList;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 5:57 PM
 */
public class FileUtil {

  public static File[] listFiles(File dir) {
    ArrayList<File> fileList = new ArrayList<File>();
    if (!dir.isDirectory()) {
      fileList.add(dir);
    } else {
      File[] files = dir.listFiles();
      for (File f : files) {
        if (f.isDirectory()) {
          File[] innerFiles = FileUtil.listFiles(f);
          for (File f1 : innerFiles) {
            fileList.add(f1);
          }
        } else {
          fileList.add(f);
        }
      }
    }
    return fileList.toArray(new File[0]);
  }

  /**
   * CHMOD a file
   *
   * @param file - the file to chmod
   * @param perm - the unix permissions to apply i.e 777, or 644, etc
   * @return boolean if sucessful, otherwise false. if the os is windows always
   *         return success
   */
  public static boolean setFilePermission(File file, String perm) {
    if (isOSWindows()) {
      return true;
    }
    try {
      String fileName = file.getAbsolutePath();
      Runtime.getRuntime().exec("chmod " + perm + " " + fileName);
    }
    catch (Exception e) {
      return false;
    }
    return true;
  }

  /**
   * delete all the files in a directory recursively
   *
   * @param src
   * @throws IOException
   */
  public static void deleteFilesRecursive(File src) throws IOException {
    // Check to ensure that the source is valid...
    if (!src.exists()) {
      if (!src.mkdirs()) {
        throw new IOException("deleteFiles: Could not create direcotry: " + src.getAbsolutePath() + ".");
      }
    } else if (!src.canRead()) { // check to ensure we have rights to the source...
      throw new IOException("copyFiles: No right to source: " + src.getAbsolutePath() + ".");
    }
    // is this a directory copy?
    if (src.isDirectory()) {
      // get a listing of files...
      String list[] = src.list();
      // copy all the files in the list.
      for (int i = 0; i < list.length; i++) {
        File src1 = new File(src, list[i]);
        deleteFilesRecursive(src1);
      }
    } else {
      src.delete();
    }
  }

  /**
   * Copy all the files from one directory to somewhere else recursively
   *
   * @param src
   * @param dest
   * @throws IOException
   */
  public static void copyFilesRecursive(File src, File dest) throws IOException {
    // Check to ensure that the source is valid...
    if (!src.exists()) {
      throw new IOException("copyFiles: Can not find source: " + src.getAbsolutePath() + ".");
    } else if (!src.canRead()) { // check to ensure we have rights to the source...
      throw new IOException("copyFiles: No right to source: " + src.getAbsolutePath() + ".");
    }
    // is this a directory copy?
    if (src.isDirectory()) {
      if (!dest.exists()) { // does the destination already exist?
        // if not we need to make it exist if possible (note this is mkdirs not
        // mkdir)
        if (!dest.mkdirs()) {
          throw new IOException("copyFiles: Could not create direcotry: " + dest.getAbsolutePath() + ".");
        }
      }
      // get a listing of files...
      String list[] = src.list();
      // copy all the files in the list.
      for (int i = 0; i < list.length; i++) {
        File dest1 = new File(dest, list[i]);
        File src1 = new File(src, list[i]);
        if (dest1.exists()) {
          dest1.delete();
          dest1 = new File(dest, list[i]);
        }
        copyFilesRecursive(src1, dest1);
      }
    } else {
      // This was not a directory, so lets just copy the file
      FileInputStream fin = null;
      FileOutputStream fout = null;
      byte[] buffer = new byte[4096]; // Buffer 4K at a time (you can change
      // this).
      int bytesRead;
      try {
        // open the files for input and output
        fin = new FileInputStream(src);
        fout = new FileOutputStream(dest);
        // while bytesRead indicates a successful read, lets write...
        while ((bytesRead = fin.read(buffer)) >= 0) {
          fout.write(buffer, 0, bytesRead);
        }
      }
      catch (IOException e) { // Error copying file...
        IOException wrapper = new IOException("copyFiles: Unable to copy file: " + src.getAbsolutePath() + "to" + dest.getAbsolutePath() + ".");
        wrapper.initCause(e);
        wrapper.setStackTrace(e.getStackTrace());
        throw wrapper;
      }
      finally { // Ensure that the files are closed (if they were open).
        if (fin != null) {
          fin.close();
        }
        if (fout != null) {
          fout.close();
        }
      }
    }
  }

  public static String readFile(String filename) throws java.io.IOException {
    StringBuffer fileData = new StringBuffer(1000);
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    char[] buf = new char[1024];
    int numRead = 0;
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
    return fileData.toString();
  }

  public static void copyFileToFile(File file, File outFile) throws IOException, FileNotFoundException {
    FileInputStream in = new FileInputStream(file);
    FileOutputStream out = new FileOutputStream(outFile);
    byte[] buf = new byte[512];
    int l;
    try {
      while ((l = in.read(buf)) > 0) {
        out.write(buf, 0, l);
      }
      out.flush();
    }
    catch (IOException e) {
      throw e;
    }
    finally {
      try {
        out.close();
      }
      catch (Exception ignored) {
      }
      try {
        in.close();
      }
      catch (Exception ignored) {
      }
    }
  }

  public static void copyFileToStream(File file, OutputStream out) throws IOException, FileNotFoundException {
    FileInputStream in = new FileInputStream(file);
    byte[] buf = new byte[512];
    int l;
    try {
      while ((l = in.read(buf)) > 0) {
        out.write(buf, 0, l);
      }
    }
    catch (IOException e) {
      throw e;
    }
    finally {
      in.close();
    }
  }

  public static void copyStreamToStream(InputStream in, OutputStream out) throws IOException, FileNotFoundException {
    byte[] buf = new byte[512];
    int l;
    try {
      while ((l = in.read(buf)) > 0) {
        out.write(buf, 0, l);
      }
    }
    catch (IOException e) {
      throw e;
    }
  }

  /**
   * this is just here because we should not chmod on windows
   *
   * @return true if we are a windows os otherwise false.
   */
  private static boolean isOSWindows() {
    String name = System.getProperty("os.name");
    if (name.toLowerCase().contains("windows")) {
      return true;
    }
    return false;
  }
}
