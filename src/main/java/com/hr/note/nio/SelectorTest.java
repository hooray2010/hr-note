package com.hr.note.nio;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by hurui on 2018/5/10.
 */
public class SelectorTest {

  public static void main(String[] args) throws IOException {
    Selector selector = Selector.open();

    SelectableChannel channel = SocketChannel.open();

    SelectionKey selectionKey = channel.register(selector, SelectionKey.OP_ACCEPT);

    int interestOps = selectionKey.interestOps();
    int readyOps = selectionKey.readyOps();

    channel = selectionKey.channel();
    selector = selectionKey.selector();

    selectionKey.attach("test");
    Object obj = selectionKey.attachment();

    int readyChannels = selector.select();
    Set<SelectionKey> selectionKeys = selector.selectedKeys();

    Iterator<SelectionKey> keyIterator = selectionKeys.iterator();
    while (keyIterator.hasNext()) {
      SelectionKey key = keyIterator.next();
      if (key.isAcceptable()) {
        // a connection was accepted by a ServerSocketChannel.
      } else if (key.isConnectable()) {
        // a connection was established with a remote server.
      } else if (key.isReadable()) {
        // a channel is ready for reading
      } else if (key.isWritable()) {
        // a channel is ready for writing
      }
      keyIterator.remove();
    }
  }

}
