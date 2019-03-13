package com.minhnhat.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Flatmap {
  public static void main(String[] args) throws IOException, ParseException {
    /*Stream<String> stream1 = Files.lines(Paths.get("files/TomSawyer_01.txt"));
    Stream<String> stream2 = Files.lines(Paths.get("files/TomSawyer_02.txt"));
    Stream<String> stream3 = Files.lines(Paths.get("files/TomSawyer_03.txt"));
    Stream<String> stream4 = Files.lines(Paths.get("files/TomSawyer_04.txt"));

    Stream<Stream<String>> streamStream = Stream.of(stream1, stream2, stream3, stream4);

    Stream<String> streamOfLines = streamStream.flatMap(Function.identity());

    Function<String, Stream<String>> lineSplitter = line -> Pattern.compile(" ").splitAsStream(line);*/
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
    Date date1 = dateFormat.parse("2018-11-15 02:35:11.081");
    Timestamp timestamp1 = new java.sql.Timestamp(date1.getTime());
    Date date2 = dateFormat.parse("2018-11-15 02:35:11.081");
    Timestamp timestamp2 = new java.sql.Timestamp(date1.getTime());
    System.out.println(timestamp1.equals(timestamp2));

  }
}
