package com.minhnhat.designpattern.behavioral.command.ex1;

public class FileInvoker {

  public Command command;

  public FileInvoker(Command c){
    this.command=c;
  }

  public void execute(){
    this.command.execute();
  }
}
