

public class DhondtSystem {
    public static void main(String[] args) {
        int[] oylar = {60000, 25000, 14000, 5000};
        int[] sandalye = new int[oylar.length];
        int mvSayisi = 7;
        for (int i = 1; i <= mvSayisi; i++) {
            int enYuksekIndex = enYuksekIndexBul(oylar, sandalye);
            sandalye[enYuksekIndex]++;
        }
        for(int i=0;i<sandalye.length;i++) {
            System.out.println((char) ('A' + i) + " Partisi : " +sandalye[i]);
        }
    }
    private static int enYuksekIndexBul(int[] oylar, int[] sandalye) {
        int enYuksekIndex = -1;
        double yuksekkOy = 0;
        for (int i = 0; i < oylar.length; i++) {
            double enYuksekOy = (double)oylar[i] / (sandalye[i] + 1);
            if (enYuksekOy > yuksekkOy) {
                yuksekkOy = enYuksekOy;
                enYuksekIndex = i;
            }
        }
        return enYuksekIndex;
    }
}