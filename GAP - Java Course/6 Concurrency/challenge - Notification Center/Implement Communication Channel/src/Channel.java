public class Channel {
  protected String message;
  protected boolean isChannelEmpty = true;

  public /*TODO_TAKE_1*/ String take() {
    /*TODO_TAKE_2*/
    /*TODO_TAKE_3*/ return null;
  }

  public /*TODO_PUT_1*/ void put(String message) {
    /*TODO_PUT_2*/
    /*TODO_PUT_3*/
  }

  protected void notifyListenersAboutChangesInChannel() {
    notifyAll();
  }

  protected void callWaitMethod() {
    try {
      wait();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}