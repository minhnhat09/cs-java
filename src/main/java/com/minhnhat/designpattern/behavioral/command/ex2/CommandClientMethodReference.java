package com.minhnhat.designpattern.behavioral.command.ex2;

public class CommandClientMethodReference {
  public static void main(String[] args) {
    TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
    TextFile textFile = new TextFile("file1.txt");
    textFileOperationExecutor.executeOperation(textFile::open);
    textFileOperationExecutor.executeOperation(textFile::save);
  }
}
