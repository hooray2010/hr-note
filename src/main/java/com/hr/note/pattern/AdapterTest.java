package com.hr.note.pattern;

import com.hr.note.model.insurance.Insurer;

import java.lang.reflect.Type;

/**
 * Created by hurui on 2017/6/25.
 */
public class AdapterTest {

  public static void main(String[] args) {

    Insurer insurer = new Insurer();

    Type[] genericInterfaces = insurer.getClass().getGenericInterfaces();
    System.out.println(genericInterfaces.toString());

  }

}
