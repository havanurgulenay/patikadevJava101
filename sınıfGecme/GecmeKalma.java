package sınıfGecme;

import java.util.Scanner;

public class GecmeKalma {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int dersSayisi = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
            

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();    

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();    

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();   

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if(mat < 0 || mat > 100) {
            mat = 0;
            dersSayisi--;
        }

        if(fizik < 0 || fizik > 100) {
            fizik = 0;
            dersSayisi--;
        }

        if(turkce < 0 || turkce > 100) {
            turkce = 0;
            dersSayisi--;
        }

        if(kimya < 0 || kimya > 100) {
            kimya = 0;
            dersSayisi--;
        }

        if(muzik < 0 || muzik > 100) {
            muzik = 0;
            dersSayisi--;
        }
           


        double average = (double)(mat + fizik + turkce + kimya + muzik) / dersSayisi;

        if(average >= 55)
            System.out.println("Sınıfı geçtiniz. Ortalamanız: " + average);
        else
            if(dersSayisi == 0)
                average = 0;
            
            System.out.println("Sınıfta kaldınız. Ortalamanız: " + average);
    }
}
