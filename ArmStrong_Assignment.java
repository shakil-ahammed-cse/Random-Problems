package shk.practice;

import java.util.Scanner;

public class ArmStrong_Assignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, temp, rem, sum = 0, count = 0;
        System.out.print("Enter Initial Number : ");
        m = input.nextInt();
        System.out.print("Enter End Number : ");
        n = input.nextInt();
        System.out.println("ArmStrong Number From " + m + " to " + n + " : ");

        for (int i = m; i <= n; i++) {
            temp = i;
            while (temp != 0) {
                rem = temp % 10;
                sum = sum + rem * rem * rem;
                temp = temp / 10;

            }
            if (i == sum) {
                System.out.print(i + " ");
                count++;
            }
            sum = 0;

        }
        System.out.println("\nTotal Arm Num : " + count);

    }
}
