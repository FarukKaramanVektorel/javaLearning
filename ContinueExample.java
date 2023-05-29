// Bir dizide bulunan çift sayıların toplamını bulan program
public class ContinueExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                continue;
            }
            sum += number;
        }

        System.out.println("Toplam: " + sum);
    }
}
