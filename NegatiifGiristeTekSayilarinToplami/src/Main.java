import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        int n;
        int total = 0;
        Scanner girdi = new Scanner(System.in);

        // - girdi olunca geçmiş girdilerdeki tek sayilarin toplamını ekrana yazdır

        do {
            System.out.print("Sayi giriniz: ");
            n = girdi.nextInt();
            if ( n % 2 == 1) {
                total += n;
            }
        } while ( n > 0);

        System.out.println("Toplam: " + total);
    }
}
