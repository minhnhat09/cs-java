package com.minhnhat.designpattern.behavioral.command.ex1;

public class CloseFileCommand implements Command {

  private FileSystemReceiver fileSystem;

  public CloseFileCommand(FileSystemReceiver fs){
    this.fileSystem=fs;
  }
  @Override
  public void execute() {
    this.fileSystem.closeFile();
  }

}
