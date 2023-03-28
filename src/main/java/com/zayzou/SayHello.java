package com.zayzou;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SayHello {

    public static void main(String[] args) throws IOException {
        var language = args[0];
        InputStream ressource = SayHello.class.getResourceAsStream(language);
        assert ressource != null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ressource, StandardCharsets.UTF_8));
        System.out.println(bufferedReader.readLine());
    }
}
