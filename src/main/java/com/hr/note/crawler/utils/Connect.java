package com.hr.note.crawler.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Connect {

  public static String SendGET(String url) {
    String result = "";//访问返回结果
    BufferedReader read = null;//读取访问结果

    try {
      //创建url
      URL realurl = new URL(url);
      //打开连接
      URLConnection connection = realurl.openConnection();
      //设置通用的请求属性
      connection.setRequestProperty("accept", "*/*");
      connection.setRequestProperty("connection", "Keep-Alive");
      connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
      //建立连接
      connection.connect();
      //定义BufferedReader输入流来读取URL的响应
      read = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
      //循环读取
      String line;
      while ((line = read.readLine()) != null) {
        result += line;
      }
    } catch (IOException e) {
      //System.out.println("无法获取！");
    } finally {
      if (read != null) {//关闭流
        try {
          read.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    return result;
  }

}