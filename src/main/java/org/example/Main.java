package org.example;

import java.util.List;
import java.util.function.Predicate;

public class Main {
        public static void main(String[] args) {

            List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
            Long result = numeros.stream().filter(num -> num > 10).count();
            System.out.println(result);
            //-------------------Ejercicio Prctico-----------------
            Predicate<Student> isApproved = student -> student.getCalificacion() > 6.0;
            Student Matt = new Student(5.0);
            System.out.println(isApproved.test(Matt));
        }



    }

    class Student {
        private double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }
        public double getCalificacion(){
            return calificacion;
        }


    }