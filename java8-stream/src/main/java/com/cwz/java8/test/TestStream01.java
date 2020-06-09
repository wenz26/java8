package com.cwz.java8.test;

import com.alibaba.fastjson.JSON;
import com.cwz.java8.pojo.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.function.Function;

public class TestStream01 {

    public static void main(String[] args) throws Exception {

        TestInter testInter = () -> System.out.println("aaa");
        testInter.a();
        testInter.b(2);
        //Integer.sum()

        Optional<User> s = Optional.of(new User());
        System.out.println(s.get());
        //s.map(a -> a.getPassword());
        //s.flatMap();
        //Optional<User> s1 = Optional.empty();
        //System.out.println(s1.get());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2020-05-19");
        System.out.println(JSON.toJSONString(parse));
        String format = simpleDateFormat.format(parse);
        System.out.println(format);

    }
}
