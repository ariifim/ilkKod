public class Main {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 2; i <= 20; i += 2) {
            toplam += i;
        }

        System.out.println("1'den 20'ye kadar olan çift sayıların toplamı: " + toplam);
    }
}
