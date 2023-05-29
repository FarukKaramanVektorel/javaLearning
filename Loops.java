public class Loops {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();
        //while
        int j = 0;
        while (j < 10) {
            System.out.print(j);
            j++;
        }
        System.out.println();

        //do while
        int k = 0;
        do {
            System.out.print(k);
            k++;
        } while (k < 10);

        System.out.println();

        //foreach
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();

        //nested loops
        for (int i = 1; i <= 5; i++) {
            for (int l = 1; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
