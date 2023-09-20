package org.example;

import java.util.function.Function;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora =
            Integer -> "Al doble:" +( 2 * 2) ;


    System.out.println(funcionConvertidora);

    }


}
