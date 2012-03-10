package com.guidewire.accel.gui;

import com.guidewire.accel.util.AccleratorHelper;
import com.guidewire.accel.util.SpringUtilities;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by IntelliJ IDEA.
 * User: tp23161
 * Date: 08/03/12
 * Time: 07:40
 * To change this template use File | Settings | File Templates.
 */
public class AppGui extends JFrame {

  // Variables declaration
  private AccleratorHelper helper = AccleratorHelper.getInstance();

  private JPanel inputPanel;
  private JLabel rootLabel;
  private JButton rootBrowseButton;
  private JTextField rootDirectory;
  private JLabel accelLabel;
  private JButton accelBrowseButton;
  private JTextField accelDirectory;
  private JTextArea logArea;
  private StatusBar statusBar;
  private JScrollPane logPane;

  private JFileChooser fileChooser;
  private FileFilter zipFilter;
  private FileFilter dirFilter;

  public AppGui() {
    init();
  }

  private void init() {
    rootDirectory = new JTextField();
    rootLabel = new JLabel();
    rootBrowseButton = new JButton();
    accelDirectory = new JTextField();
    accelLabel = new JLabel();
    accelBrowseButton = new JButton();
    logArea = new JTextArea();
    logPane = new JScrollPane(logArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    statusBar = new StatusBar();
    inputPanel = new JPanel(new SpringLayout());

    zipFilter = new FileFilter() {
      @Override
      public boolean accept(File f) {
        if (f != null && (f.getAbsolutePath().toLowerCase().endsWith(".zip") || f.getAbsolutePath().toLowerCase().endsWith(".jar"))) {
          return true;
        }
        return false;
      }

      @Override
      public String getDescription() {
        return "Accelerator Files";
      }
    };

    dirFilter = new FileFilter() {
      @Override
      public boolean accept(File f) {
        if (f != null && f.isDirectory()) {
          return true;
        }
        return false;
      }

      @Override
      public String getDescription() {
        return "Directories";
      }
    };

    this.getContentPane().setLayout(new BorderLayout());
    getContentPane().add(inputPanel, BorderLayout.NORTH);
    getContentPane().add(logPane, BorderLayout.CENTER);
    getContentPane().add(statusBar, BorderLayout.SOUTH);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Accelerator Deployment and Undeployment");

    //Create the menu
    JMenuBar menuBar;
    JMenu menu, submenu;
    JMenuItem menuItem;

    menuBar = new JMenuBar();

    //Build the first menu.
    menu = new JMenu("File");
    menu.setMnemonic(KeyEvent.VK_F);
    menu.getAccessibleContext().setAccessibleDescription("The File Menu");
    menuBar.add(menu);

    menuItem = new JMenuItem("Open", KeyEvent.VK_O);
    menuItem.getAccessibleContext().setAccessibleDescription("Open An Accelerator");
    menuItem.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Opening an accelerator");
        selectAccelerator();
      }
    });
    menu.add(menuItem);

    menuItem = new JMenuItem("Setup", KeyEvent.VK_S);
    menuItem.getAccessibleContext().setAccessibleDescription("Set up Default Values");
    menuItem.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Opening Setup Dialog");
      }
    });
    menu.add(menuItem);


    menuItem = new JMenuItem("Install", KeyEvent.VK_I);
    menuItem.getAccessibleContext().setAccessibleDescription("Install An Accelerator");
    menuItem.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Installing accelerator");
        if (helper.getAccelerator() != null && !isValidAccelerator(helper.getAccelerator())) {
          selectAccelerator();
        }
        //If it is now, or still is valid
        if (helper.getAccelerator() != null && isValidAccelerator(helper.getAccelerator())) {
          //install it
          installAccelerator();
        } else {
          //Print an error to the statusbar
          statusBar.setText("Cannot install the selected accelerator");
        }
      }
    });
    menu.add(menuItem);


    menu.addSeparator();

    menuItem = new JMenuItem("eXit", KeyEvent.VK_X);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
    menuItem.getAccessibleContext().setAccessibleDescription("Exit The Application");
    menuItem.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Exiting Application");
        System.exit(0);
      }
    });
    menu.add(menuItem);


    setJMenuBar(menuBar);


    rootLabel.setText("Product Root");
    rootDirectory.setText("G:\\repos\\ClaimCenter\\ClaimCenter\\");
    rootDirectory.addFocusListener(new FocusListener() {
      @Override
      public void focusGained(FocusEvent e) {
      }

      @Override
      public void focusLost(FocusEvent e) {
        File file = new File(rootDirectory.getText());
        if (isValidProductDir(file)) {
          setupProductDir(file);
        } else {
          rootLabel.setForeground(Color.RED);
          statusBar.setText("Invalid Product Directory");
        }
      }
    });
    rootBrowseButton.setText("Browse");
    rootBrowseButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fileChooser = new JFileChooser(rootDirectory.getText());
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setCurrentDirectory(new File(rootDirectory.getText()));
        int returnVal = fileChooser.showOpenDialog(AppGui.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
          File file = fileChooser.getSelectedFile();
          //This is where a real application would open the file.
          rootDirectory.setText(file.getAbsolutePath());
          if (isValidProductDir(file)) {
            setupProductDir(file);
          } else {
            rootLabel.setForeground(Color.RED);
            statusBar.setText("Invalid Product Directory");
          }
        }
        fileChooser = null;
      }
    });

    accelLabel.setText("Accelerator:");
    accelDirectory.setText("G:\\");
    accelDirectory.addFocusListener(new FocusListener() {
      @Override
      public void focusGained(FocusEvent e) {
      }

      @Override
      public void focusLost(FocusEvent e) {
        File file = new File(rootDirectory.getText());
        if (isValidAccelerator(file)) {
          setupAccellerator(file);
        } else {
          setupAccellerator(file);
          statusBar.setText(file.getAbsolutePath() + " is not a valid accelerator, or the deployment descriptor was not found.");
          accelLabel.setForeground(Color.RED);
        }
      }
    });
    accelBrowseButton.setText("Browse");
    accelBrowseButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        selectAccelerator();
      }
    });

    //Handle the layout stuff
    inputPanel.add(rootLabel);
    inputPanel.add(rootDirectory);
    inputPanel.add(rootBrowseButton);
    inputPanel.add(accelLabel);
    inputPanel.add(accelDirectory);
    inputPanel.add(accelBrowseButton);

    SpringUtilities.makeCompactGrid(inputPanel,
            2, 3, //rows, cols
            5, 5, //initialX, initialY
            5, 5);//xPad, yPad


    pack();

    this.addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentResized(ComponentEvent event) {
        setSize(Math.max(1024, getWidth()),
                Math.max(768, getHeight()));
      }
    });
    this.setSize(1024, 768);
  }

  private void setupAccellerator(File file) {
    statusBar.setText("Loading XSD " + file.getAbsolutePath());
    accelDirectory.setText(file.getAbsolutePath());
    accelLabel.setForeground(Color.BLACK);
    helper.setAccelerator(file);
  }

  private void setupProductDir(File file) {
    helper.setProductRoot(file);
    statusBar.setText("Setting product directory to " + file.getAbsolutePath());
    rootLabel.setForeground(Color.BLACK);
  }

  private boolean isValidAccelerator(File file) {
    boolean hasDescriptor = false;
    if (file.exists()) {
      //Attempt to load to see if it is really an zip
      FileInputStream fis = null;
      ZipInputStream zin = null;
      try {
        File f = new File("/tmp/accel/");
        if (f.exists()) {
          File[] fileList = f.listFiles();
          for (File del : fileList) {
            del.delete();
          }
        } else {
          f.mkdirs();
        }
        fis = new FileInputStream(file);
        zin = new ZipInputStream(fis);
        ZipEntry entry;
        do {
          entry = zin.getNextEntry();
          if (entry != null) {
            int BUFFER = 2048;
            FileOutputStream fos = new FileOutputStream(f.getAbsolutePath() + File.separator + entry.getName());
            BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER);
            int count;
            byte data[] = new byte[BUFFER];
            // write the files to the disk
            while ((count = zin.read(data, 0, BUFFER)) != -1) {
              dest.write(data, 0, count);
            }
            dest.flush();
            dest.close();
            if (entry.getName().equals("deployment.xml")) {
              hasDescriptor = true;
            }
          }
        }
        while (entry != null);
      }
      catch (Throwable t) {
        t.printStackTrace();
      }
      finally {
        try {
          fis.close();
        }
        catch (Throwable t) {
        }
        try {
          zin.close();
        }
        catch (Throwable t) {
        }
      }
    }
    return hasDescriptor;
  }

  private boolean isValidProductDir(File f) {
    File modules = new File(f.getAbsolutePath() + File.separator + "modules");
    if (f.exists() && f.isDirectory() && modules.exists() && modules.isDirectory()) {
      return true;
    }
    return false;
  }

  private void selectAccelerator() {
    fileChooser = new JFileChooser(accelDirectory.getText());
    fileChooser.addChoosableFileFilter(zipFilter);
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    fileChooser.setFileFilter(zipFilter);
    int returnVal = fileChooser.showOpenDialog(AppGui.this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File file = fileChooser.getSelectedFile();
      //see if this is really an xsd file.
      if (isValidAccelerator(file)) {
        setupAccellerator(file);
      } else {
        setupAccellerator(file);
        statusBar.setText(file.getAbsolutePath() + " is not a valid accelerator, or the deployment descriptor was not found.");
        accelLabel.setForeground(Color.RED);
      }
    }
    fileChooser = null;
  }

  public void installAccelerator() {
    File accelerator = helper.getAccelerator();
    File root = helper.getProductRoot();
    //now lets call our installer.


  }
}
