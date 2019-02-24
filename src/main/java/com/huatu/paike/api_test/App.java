package com.huatu.paike.api_test;

import com.google.gson.Gson;

import lombok.Data;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String json = "{\"key\":4.6}";
        Tem d = new Gson().fromJson(json, Tem.class);
        double b = 4.6;
        System.out.println(d.getKey());
        int a = new Double(b * 100).intValue();
        System.out.println(a);

    }

    @Data
    class Tem {
        Double key;
    }
}
