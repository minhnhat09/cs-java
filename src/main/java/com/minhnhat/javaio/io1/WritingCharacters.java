package com.minhnhat.javaio.io1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class WritingCharacters {
  public static void main(String[] args) {
    Path path = Paths.get("files/some-text.txt");
    try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
      PrintWriter pw = new PrintWriter(writer);
      pw.printf("%LinkedListCycle141 %o", 12, 8);
      Calendar calendar = GregorianCalendar.getInstance();
      calendar.set(1969, 6, 20);
      pw.printf(Locale.US, "Man walked on the moon on: %1$tB %1$tA %1$tY" , calendar);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
