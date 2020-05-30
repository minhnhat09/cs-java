package com.minhnhat.java8;

import java.io.*;

public class FilesExample {
  public static void main(String[] args) {
    try (InputStream in = new FileInputStream("files/data.pdf")) {
      int b;
      // -1 indicates the end of the file
      while ((b = in.read()) != -1) {
        System.out.print(b);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void fileInfo() {
    String path = "./files";
    File file = new File(path);
    if (file.exists()) {
      // Name of the file/directory
      String name = file.getName();
      System.out.println(file);
      // Path of its parent
      String parent = file.getParent();
      // Returning the time the file/directory was modified
      // in milliseconds since 00:00:00 GMT, January 1, 1970
      long millis = file.lastModified();

      // If the object represents a file
      if (file.isFile()) {
        // Returning the size of the file in bytes
        long size = file.length();
      }
      // If the object represents a directory
      else if (file.isDirectory()) {
        // Returns true only if the directory was created
        boolean dirCreated = file.mkdir();
        // Returns true only if the directory was created,
        // along with all necessary parent directories
        boolean dirsCreated = file.mkdirs();

        // Get all the files/directories in a directory
        // Just the names
        String[] fileNames = file.list();
        // As File instances
        File[] files = file.listFiles();
      }
    }
  }
}
