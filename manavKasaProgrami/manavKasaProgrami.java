package manavKasaProgrami;

import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        armutKg = inp.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elmaKg = inp.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domatesKg = inp.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muzKg = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlicanKg = inp.nextDouble();

        double tutar = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.print("Toplam Tutar: " + tutar + " TL");
    }
}

