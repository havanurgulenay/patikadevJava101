package daireAlaniHesaplama;

import java.util.Scanner;

public class daireAlaniHesaplama {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();

        System.out.print("Daire diliminin merkez açısını giriniz: ");
        a = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double daireDilimi = (alan * a) / 360;

        System.out.println("Dairenin çevresı: " + cevre);
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Daire diliminin alanı: " + daireDilimi );

    }
}
