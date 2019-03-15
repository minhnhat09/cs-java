package com.minhnhat.designpattern.behavioral.command.ex2;

public class SaveTextFileOperation implements TextFileOperation {

  public SaveTextFileOperation(TextFile textFile) {
    this.textFile = textFile;
  }

  // same field and constructor as above
  private TextFile textFile;

  @Override
  public String execute() {
    return textFile.save();
  }
}
