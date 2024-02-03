package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        int n1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        int n2 = input.nextInt();

        System.out.println("1 >> Toplama İşlemi \n" +
                            "2 >> Çıkarma İşlemi \n"+
                            "3 >> Bölme İşlemi \n" +
                            "4 >> Çarpma İşlemi");

        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        int choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                if(n2 != 0)
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                else 
                    System.out.println("Bir sayı sıfıra bölünemez.");
                break;
            case 4:
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            default:
                System.out.println("Geçersiz Giriş");
                break;
        }
    

    }
}
