public class FakeChannel extends Channel {
  protected boolean waitMethodCalled = false;
  protected boolean notifyListenersMethodCalled = false;

  protected void callWaitMethod() {
    this.waitMethodCalled = true;
    throw new WaitMethodCalledException();
  }

  protected void notifyListenersAboutChangesInChannel() {
    this.notifyListenersMethodCalled = true;
  }
}


