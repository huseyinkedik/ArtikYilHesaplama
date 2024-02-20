import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        // Kullanıcı girişi
        Scanner inp = new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        yil = inp.nextInt();

        // Artık yıl 4'e kalansız bölünür
        //100'ün katıysa 400'e tam bölünür

        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
            System.out.println(yil + " artık yıldır");
        } else {
            System.out.println(yil + " artık yıl değildir");
        }
    }
}