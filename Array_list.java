package shk.practice;

import java.util.ArrayList;

public class Array_list {

    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        number1.add(50);
        number1.add(60);

        number2.add(10);
        number2.add(20);
        number2.add(30);
        number2.add(40);
        number2.add(50);
        number2.add(60);

        number3.add(70);
        number3.add(80);
        number3.add(90);
        number3.add(100);
        number3.add(110);
        number3.add(120);

        System.out.println(" Size ====  " + number1.size());

        System.out.println(number1);
        System.out.println(" Size ====  " + number2.size());

        boolean result1 = number1.contains(40);
        System.out.println("It is " + result1);

        boolean result2 = number1.equals(number2);
        System.out.println("It is = " + result2);
        boolean result3 = number1.equals(number3);
        System.out.println("It is = " + result3);
        
        number1.add(5);
        System.out.println(number1);
    }
}
