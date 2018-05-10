package demo.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by hurui on 2018/5/10.
 */
public class FileChannelTest {

  public static void main(String[] args) throws IOException {
    RandomAccessFile file = new RandomAccessFile("data/nio-data.txt", "rw");
    FileChannel channel = file.getChannel();

    ByteBuffer buf = ByteBuffer.allocate(48);
    int bytesRead = channel.read(buf);

    String newData = "New String to write to file..." + System.currentTimeMillis();
    buf.clear();
    buf.put(newData.getBytes());

    buf.flip();

    while (buf.hasRemaining()) {
      channel.write(buf);
    }

    channel.close();
  }

}
