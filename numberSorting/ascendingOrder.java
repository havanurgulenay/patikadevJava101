package numberSorting;

import java.util.Scanner;

public class ascendingOrder {
    public static void main(String[] args) {
        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter first number : ");
        a = input.nextInt();

        System.out.print("Enter second number : ");
        b = input.nextInt();

        System.out.print("Enter third number : ");
        c = input.nextInt();

        if((a > b) && (a > c)) {
            if(b > c)
                System.out.println("c < b < a");
            else
                System.out.println("b < b < a");
        }
        else if((b > a) && (b > c)) {
            if(a > c)
                System.out.println("c < a < b");
            else
                System.out.println("a < c < b");
        }
        else if((c > a) && (c > b)) {
            if(a > b)
                System.out.println("b < a < c");
            else
                System.out.println("a < b < c");
        }
    }
}
