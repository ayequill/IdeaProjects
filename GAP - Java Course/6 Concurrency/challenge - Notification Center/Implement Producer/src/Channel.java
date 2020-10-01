public class Channel {
  protected String message;
  protected boolean isChannelEmpty = true;

  public synchronized String take() {
    if (isChannelEmpty) {
      callWaitMethod();
    }
    isChannelEmpty = true;
    notifyListenersAboutChangesInChannel();
    return message;
  }

  public synchronized void put(String message) {
    if (!isChannelEmpty) {
      callWaitMethod();
    }
    this.message = message;
    isChannelEmpty = false;
    notifyListenersAboutChangesInChannel();
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