package com.sistema_esportivo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOMethods {

    private static final BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

    public static void print(String output) {
        System.out.println(output);
    }

    public static void printLine(){
        System.out.println();
    }

    public static String readString() {
        try {
            return scanner.readLine();
        } catch (Exception e) {
            print("\nErro na leitura de entrada, digite novamente");
            return readString();
            // return "";
        }
    }

    public static int readInt() {
        try {
            return Integer.parseInt(readString());
        } catch (Exception e) {
            print("\nErro na leitura de entrada, digite novamente");
            return readInt();
        }
    }

}
