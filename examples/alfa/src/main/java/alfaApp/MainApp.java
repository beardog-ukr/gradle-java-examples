package alfaApp;

import conversation.ConversationWrapper;

class MainApp {
  public static void main(String[] args) {
    System.out.println("main: application started"); //

    // using class defined in another package
    ConversationWrapper cn = new ConversationWrapper();
    cn.sayHello();

    // using class from same package
    QuickFox qf = new QuickFox();
    qf.say();

    cn.sayBye();

    System.out.println("main: application finished"); //
  }
}
