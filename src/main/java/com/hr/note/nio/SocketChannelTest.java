package com.hr.note.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by hurui on 2018/5/10.
 */
public class SocketChannelTest {

  public static void main(String[] args) throws IOException {
    SocketChannel socketChannel = SocketChannel.open();
    socketChannel.connect(new InetSocketAddress("127.0.0.1", 80));

    while (!socketChannel.finishConnect()) {
      //wait, or do something else...
    }

    ByteBuffer buf = ByteBuffer.allocate(48);

    //read()，非阻塞模式下,read()方法在尚未读取到任何数据时可能就返回了。所以需要关注它的int返回值，它会告诉你读取了多少字节。
    int bytesRead = socketChannel.read(buf);

    String newData = "New String to write to file..." + System.currentTimeMillis();
    buf.clear();
    buf.put(newData.getBytes());

    buf.flip();

    //write()，非阻塞模式下，write()方法在尚未写出任何内容时可能就返回了。所以需要在循环中调用write()。
    while (buf.hasRemaining()) {
      socketChannel.write(buf);
    }

    socketChannel.close();
  }

}
