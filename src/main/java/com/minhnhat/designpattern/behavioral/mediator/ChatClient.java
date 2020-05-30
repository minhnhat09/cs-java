package com.minhnhat.designpattern.behavioral.mediator;

public class ChatClient {

  public static void main(String[] args) {
    ChatMediator mediator = new ChatMediatorImpl();
    User minh = new UserImpl(mediator, "Minh");
    User user2 = new UserImpl(mediator, "Lisa");
    User user3 = new UserImpl(mediator, "Saurabh");
    User user4 = new UserImpl(mediator, "David");
    mediator.addUser(minh);
    mediator.addUser(user2);
    mediator.addUser(user3);
    mediator.addUser(user4);

    minh.send("Hi All");
  }
}
