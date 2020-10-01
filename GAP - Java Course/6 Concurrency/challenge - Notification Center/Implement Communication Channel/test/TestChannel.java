import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestChannel {

  @Test(expected = WaitMethodCalledException.class)
  public void whenChannelIsEmptyAndWeTryToTake_waitMethodShouldBeCalled() {
    FakeChannel channel = new FakeChannel();
    channel.isChannelEmpty = true;

    channel.take();
  }

  @Test
  public void whenChannelIsNotEmptyAndWeTryToTake_channelShouldGetEmpty() {
    FakeChannel channel = new FakeChannel();
    channel.message = "msg";
    channel.isChannelEmpty = false;

    String msgFromChannel = channel.take();
    Assert.assertTrue("message received is not the one from the channel", msgFromChannel.equals(channel.message));
    Assert.assertTrue("after take() call, the channel should be empty", channel.isChannelEmpty);
    Assert.assertTrue("notifyAll() method not called if a change was made in the Channel", channel.notifyListenersMethodCalled);
  }

  @Test
  public void takeMethodShouldBeSynchronized() throws NoSuchMethodException {
    Method method = Channel.class.getMethod("take");
    Assert.assertTrue("take() is not synchronized", Modifier.isSynchronized(method.getModifiers()));
  }

  @Test(expected = WaitMethodCalledException.class)
  public void whenChannelIsFullAndWeTryToPut_waitMethodShouldBeCalled() {
    FakeChannel channel = new FakeChannel();
    channel.isChannelEmpty = false;

    channel.put("msg");
  }

  @Test
  public void whenChannelIsEmptyAndWeTryToPut_channelShouldGetFull() {
    FakeChannel channel = new FakeChannel();
    channel.isChannelEmpty = true;

    String msgToPut = "msg";
    channel.put(msgToPut);
    Assert.assertTrue("message not received correctly in the channel", msgToPut.equals(channel.message));
    Assert.assertFalse("after put(message) call, the channel should be full", channel.isChannelEmpty);
    Assert.assertTrue("notifyAll() method not called if a change was made in the Channel", channel.notifyListenersMethodCalled);
  }

  @Test
  public void putMethodShouldBeSynchronized() throws NoSuchMethodException {
    Method method = Channel.class.getMethod("put", String.class);
    Assert.assertTrue("put(message) is not synchronized", Modifier.isSynchronized(method.getModifiers()));
  }
}