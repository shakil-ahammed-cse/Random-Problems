package shk.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(20);
        number.add(-5);
        number.add(90);
        number.add(45);
        number.add(20);
        number.add(-5);
        number.add(90);
        number.add(45);
      
        
        System.out.println("Before Sort : " + number);

        Collections.sort(number);

        System.out.println();

        System.out.println("After Sort : " + number);

        System.out.println("");

        Collections.sort(number, Collections.reverseOrder());

        System.out.println("After Reverse Sort : " + number);

    }
}
