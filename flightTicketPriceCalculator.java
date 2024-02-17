import java.util.Scanner;

public class flightTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double yasIndirimi, yasIndirimiOrani, tutar, kmTutar ;

        System.out.print("Mesafe(km): ");
        mesafe = input.nextInt();

        System.out.print("Yaşınız: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipi (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        if(mesafe <= 0 || yas <= 0 || yolculukTipi != 1 && yolculukTipi != 2)
            System.out.println("Hatalı Veri Girdiniz !");


        if(yas <= 12) {
            yasIndirimiOrani = 0.5;
        } else if(yas > 12 && yas <= 24) {
            yasIndirimiOrani = 0.1;
        } else if(yas > 24 && yas < 65) {
            yasIndirimiOrani = 0;
        } else {
            yasIndirimiOrani = 0.3;
        }

        kmTutar = mesafe * 0.1;
        yasIndirimi = kmTutar * yasIndirimiOrani;

        if(yolculukTipi == 2) {
            tutar = (kmTutar - yasIndirimi) * 2;
            tutar = tutar - (tutar * 0.2);
        } else {
            tutar = kmTutar - yasIndirimi;
        }

        System.out.println("Toplam Tutar: " + tutar);


    }
}
