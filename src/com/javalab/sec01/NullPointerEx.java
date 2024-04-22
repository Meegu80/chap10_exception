package com.Meegu80.sec01;

/**
 * NullPointerException 예외 발생
 * null 참조 변수를 사용하면 NullPointerException 예외가 발생한다.
 */
public class NullPointerEx {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length());

    }
}
