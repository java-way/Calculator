package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("I am not calculator, yet....");

        Scanner scan = new Scanner(System.in);

        System.out.println("Variable 1:");
        double x = scan.nextDouble();
        scan.nextLine();

        System.out.println("Variable 2:");
        double y = scan.nextDouble();
        scan.nextLine();

        System.out.println("Choose +,-,*,/");
        String choise = scan.nextLine();

        if (choise.equals("+")) {
            System.out.println(x + y);
        }
        if (choise.equals("-")) {
            System.out.println(x - y);
        }
        if (choise.equals("*")) {
            System.out.println(x * y);
        }
        if (choise.equals("/")) {
            System.out.println(x / y);
        }

    }
}
