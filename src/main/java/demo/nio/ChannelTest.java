package demo.nio;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by hurui on 2018/5/10.
 */
public class ChannelTest {

  public static void main(String[] args) throws IOException {
    String path = "data/nio-data.txt";
    RandomAccessFile randomAccessFile = new RandomAccessFile(path, "rw");
    FileChannel fileChannel = randomAccessFile.getChannel();

    ByteBuffer byteBuffer = ByteBuffer.allocate(48);

    int bytesRead = fileChannel.read(byteBuffer);
    while (bytesRead != -1) {
      System.out.println("Read: " + bytesRead);
      byteBuffer.flip();

      while (byteBuffer.hasRemaining()) {
        System.out.println((char) byteBuffer.get());
        System.out.println("position = " + byteBuffer.position());
      }

      byteBuffer.clear();
      System.out.println("Read: " + bytesRead);
      System.out.println("position = " + byteBuffer.position());

      bytesRead = fileChannel.read(byteBuffer);
      System.out.println("Read: " + bytesRead);
      System.out.println("position = " + byteBuffer.position());
    }

    randomAccessFile.close();
  }

  @Test
  public void testTransfer() throws IOException {
    RandomAccessFile fromFile = new RandomAccessFile("data/fromFile.txt", "rw");
    FileChannel fromChannel = fromFile.getChannel();

    RandomAccessFile toFile = new RandomAccessFile("data/toFile.txt", "rw");
    FileChannel toChannel = toFile.getChannel();

    long position = 0;
    long count = fromChannel.size();

    toChannel.transferFrom(fromChannel, position, count);

    fromChannel.transferTo(position, count, toChannel);
  }

}
