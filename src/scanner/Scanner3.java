package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main (String[]args) {
        int age=21;

        Scanner sc = new Scanner(System.in);

        System.out.println(" please enter your age");
        sc.nextInt();
        if(age>=18){
            if (age>18){
                System.out.println(" eligible for vote");
            }else {
                if (age>18){
                    System.out.println(" not eligible for vote");
                }

            }

        }



    }
}
