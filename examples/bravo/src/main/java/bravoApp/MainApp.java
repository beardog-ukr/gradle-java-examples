package bravoApp;

import conversation.ConversationWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MainApp {

  private static final Logger logger = LoggerFactory.getLogger("bravo.main");

  public static void main(String[] args) {
    logger.debug("application started"); //

    // using class defined in another package
    ConversationWrapper cn = new ConversationWrapper();
    cn.sayHello();

    // using class from same package
    QuickFox qf = new QuickFox();
    qf.say();

    cn.sayBye();

    logger.debug("application finished"); //
  }
}
