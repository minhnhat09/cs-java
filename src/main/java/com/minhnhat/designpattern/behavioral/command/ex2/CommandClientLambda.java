package com.minhnhat.designpattern.behavioral.command.ex2;

public class CommandClientLambda {
  public static void main(String[] args) {
    TextFileOperationExecutor textFileOperationExecutort = new TextFileOperationExecutor();
    System.out.println(textFileOperationExecutort.executeOperation(() -> "open file"));
  }
}
