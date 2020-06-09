package com.cwz.java8.test;

@FunctionalInterface
public interface TestInter {

    void a();

    default Integer b(int x){
        System.out.println(x);
        return x;
    }
}
