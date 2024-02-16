import java.util.Scanner;

public class zodiacSignFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sign = " ";

        System.out.print("Doğduğunuz ay : ");
        int month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        int day = input.nextInt();

        switch(month) {
            case 1: 
                if(day < 22) 
                    sign = "Oğlak";
                else if(day >= 22)
                    sign = "Kova";
                break;

            case 2:
                if(day < 20)
                    sign = "Kova";
                else if(day >= 20)
                    sign = "Balık";
                break;

            case 3:
                if(day < 21)
                    sign = "Balık";
                else if(day >= 21)
                    sign = "Koç";
                break;

            case 4:
                if(day < 21)
                    sign = "Koç";
                else if(day >= 21)
                    sign = "Boğa";
                break;

            case 5:
                if(day < 22)
                    sign = "Boğa";
                else if(day >= 22)
                    sign = "İkizler";
                break;

            case 6:
                if(day < 23)
                    sign = "İkizler";
                else if(day >= 23)
                    sign = "Yengeç";
                break;

            case 7:
                if(day < 23)
                    sign = "Yengeç";
                else if(day >= 23)
                    sign = "Aslan";
                break;

            case 8:
                if(day < 23)
                    sign = "Aslan";
                else if(day >= 23)
                    sign = "Başak";
                break;

            case 9:
                if(day < 23)
                    sign = "Başak";
                else if(day >= 23)
                    sign = "Terazi";
                break;

            case 10:
                if(day < 23)
                    sign = "Terazi";
                else if(day >= 23)
                    sign = "Akrep";
                break;

            case 11:
                if(day < 22)
                    sign = "Akrep";
                else if(day >= 22)
                    sign = "Yay";
                break;

            case 12:
                if(day < 22)
                    sign = "Yay";
                else if(day >= 22)
                    sign = "Oğlak";
                break;

            default:
                System.out.println("Hatalı giriş yaptınız.");

        }

        System.out.println("Burcunuz: " + sign);
    }
}
