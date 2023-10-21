package kdvHesaplama;

import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvliTutar, kdvTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün fiyatını giriniz: ");
        tutar = input.nextDouble();

        kdvOran = (tutar > 1000) ? 0.08 : 0.18;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }
}
