package com.minhnhat.javaio.io1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class ReadingBytes {
  public static void main(String[] args) {
    String fileName = "files/ints.bin.gz";
    try {
      Path path = Paths.get(fileName);
      long size = Files.size(path);
      System.out.println(path + " " + size);
    } catch (IOException e) {
    }
    try (InputStream is = new FileInputStream(new File(fileName));
         GZIPInputStream gzipInputStream = new GZIPInputStream(is);
         DataInputStream dataInputStream = new DataInputStream(gzipInputStream);) {

      List<Integer> integers = new ArrayList<>();
      try {
        while (true) {
          integers.add(dataInputStream.readInt());
        }
      } catch (EOFException e) {
      }
      System.out.println("integers: " + integers.size());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
