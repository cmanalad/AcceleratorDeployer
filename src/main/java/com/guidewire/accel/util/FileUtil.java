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
   * Read a file into a string
   * @param filename
   * @return
   * @throws java.io.IOException
   */
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

  /**
   * Copy a file to a location given by another file.
   * @param file
   * @param outFile
   * @throws IOException
   * @throws FileNotFoundException
   */
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
}
