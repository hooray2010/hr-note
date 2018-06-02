package com.hr.note.jvm;

/**
 * Created by hurui on 2018/1/17.
 */
public abstract class Book {

  static {
    name = "book1";
  }

  public static String name = "book";

  static {
    name = "book2";
  }

}
