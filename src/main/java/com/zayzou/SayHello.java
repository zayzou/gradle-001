package com.zayzou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SayHello {

    public static void main(String[] args) {
        try {
            var language = args[0];
            InputStream resource = SayHello.class.getClassLoader().getResourceAsStream(String.format("%s.txt", language));
            assert resource != null;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource, StandardCharsets.UTF_8));
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
