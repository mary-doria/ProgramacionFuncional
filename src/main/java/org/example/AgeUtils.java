package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {
//SAM = Single adstract Method Una interface que tiene un solo metodo sin definir
    public static void main(String[] args) {

        Function <Integer,String> addCeros = x -> (x < 10) ? ("0" + x) : String.valueOf(x);
        TriFunction<Integer, Integer, Integer ,LocalDate> parseDate =
                (day,  month, year) -> LocalDate.parse(year + "-" + addCeros.apply(month) + "-" + addCeros.apply(day));

        TriFunction<Integer, Integer, Integer ,Integer> calculateAge =
                (day,  month, year) -> Period.between(
                        parseDate.apply(day,  month, year), LocalDate.now()
                ).getDays();

        System.out.println(calculateAge.apply(10,10,1995));

    }
  @FunctionalInterface
  interface TriFunction<T, U, V, R>{
      R apply(T t, U u , V v);
  }

}
