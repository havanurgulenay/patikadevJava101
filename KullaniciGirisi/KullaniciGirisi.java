package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, newPassword;

        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş yaptınız !");
        }
        else if(userName.equals("patika") && !password.equals("java101")) {
            System.out.print("Şifreniz yanlış. Şifrenizi değiştirmek istiyorsanız 1 e, istemiyorsanız 2 ye basın. ");
            int choice = input.nextInt();
            input.nextLine();
            if(choice == 1) {
                System.out.print("Yeni şifrenizi giriniz : ");
                newPassword = input.nextLine();
                if(newPassword.equals("java101") || newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı. Başka şifre oluşturunuz.");
                    System.out.print("Şifre : ");
                    newPassword = input.nextLine();
                }
                else 
                    System.out.println("Şifre oluşturuldu.");
            }


        }

    }
}
