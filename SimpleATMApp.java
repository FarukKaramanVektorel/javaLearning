import java.util.Scanner;

public class SimpleATMApp {
    private static double bakiye = 1000; // Başlangıç bakiyesi
    private static int islem = 0;
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {       
        System.out.println("ATM'ye Hoş Geldiniz!");
        do {
            System.out.println("-----------------------------");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçin:");
            System.out.println("1. Bakiye Görüntüleme");
            System.out.println("2. Para Çekme");
            System.out.println("3. Para Yatırma");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminizi yapın (1-4): ");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    bakiyeGoruntuleme();
                    break;
                case 2:
                    paraCekme();
                    break;
                case 3:
                    paraYatirma();
                    break;
                case 4:
                    islem=0;
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    islem=0;
            }

        } while (islem > 0);
    }

    public static void bakiyeGoruntuleme() {
        islem=1;
        System.out.println("Bakiyeniz: " + bakiye + " TL");
    }

    public static void paraCekme() {
        islem=1;        
        System.out.print("Çekmek istediğiniz tutarı girin: ");
        double tutar = scanner.nextDouble();
        if (tutar > bakiye) {
            System.out.println("Yetersiz bakiye!");
        } else {
            bakiye -= tutar;
            System.out.println("Çekilen tutar: " + tutar + " TL");
            System.out.println("Güncel bakiyeniz: " + bakiye + " TL");
        }
    }

    public static void paraYatirma() {
        islem=1;
        System.out.print("Yatırmak istediğiniz tutarı girin: ");
        double tutar = scanner.nextDouble();
        if (tutar <= 0) {
            System.out.println("Geçersiz tutar!");
        } else {
            bakiye += tutar;
            System.out.println("Yatırılan tutar: " + tutar + " TL");
            System.out.println("Güncel bakiyeniz: " + bakiye + " TL");
        }
    }

}
