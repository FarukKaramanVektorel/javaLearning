public class ifElseElseIf {
    public static void main(String[] args) {
        // if
        int sayi = 5;

        if (sayi > 0) {
            System.out.println("Sayı pozitiftir.");
        }
        //if else
        int sayiTwo = 10;

        if (sayiTwo % 2 == 0) {
            System.out.println("Sayı çifttir.");
        } else {
            System.out.println("Sayı tektir.");
        }
        //if else if else
        int not = 80;

        if (not >= 90) {
            System.out.println("Notunuz A");
        } else if (not >= 80) {
            System.out.println("Notunuz B");
        } else if (not >= 70) {
            System.out.println("Notunuz C");
        } else {
            System.out.println("Notunuz D");
        }
    }
}
