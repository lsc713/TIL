package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloLombok {

    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok hl = new HelloLombok("헬로",5);

        System.out.println(hl.getHello());
        System.out.println(hl.getLombok());
    }
}
