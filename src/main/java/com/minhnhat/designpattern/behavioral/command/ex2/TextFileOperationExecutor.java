package com.minhnhat.designpattern.behavioral.command.ex2;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

  public final List<TextFileOperation> textFileOperations
          = new ArrayList<>();

  public String executeOperation(TextFileOperation textFileOperation) {
    textFileOperations.add(textFileOperation);
    return textFileOperation.execute();
  }
}
