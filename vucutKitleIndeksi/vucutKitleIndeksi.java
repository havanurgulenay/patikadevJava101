package vucutKitleIndeksi;

import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {
        double boy,kilo;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        System.out.print("Boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();

        double kitleIndeksi = kilo / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz: " + kitleIndeksi);

    }
}
