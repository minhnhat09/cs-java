package com.minhnhat.ocpj8;

class Disk implements Monitorable {
  public void monitor() {
    System.out.println("Monitoring Disk");
  }
}

class Server implements Monitorable {
  public void monitor() {
    System.out.println("Monitoring Server");
  }
}

public class InterfaceExample {
  public static void main(String args[]) {
    Monitorable m = new Disk();
    m.monitor();
    m = new Server(); // Change implementation
    m.monitor();
  }
}
