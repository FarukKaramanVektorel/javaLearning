//Bir dizideki aranan elemanı bulan program
public class BreakExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Değer bulundu, indeks: " + foundIndex);
        } else {
            System.out.println("Değer bulunamadı.");
        }

        //1 den başlayarak sayıları toplayan ve 100 ü geçince ekrana yazdıran program
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 100) {
                break;
            }
        }

        System.out.println("Toplamı 100'ü geçen sayı: " + sum);
    }
}
