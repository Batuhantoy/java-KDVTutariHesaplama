import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Gerekli değişkenleri tanımla
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz : ");
        double para = input.nextDouble();

        //KDV tutarını hesapla
        double kdvTutari = ((para > 0) && (para < 1000)) ? para * 0.18 : para * 0.08;

        double toplamTutar = para+kdvTutari;

        System.out.println("KDV'siz Tutar : "+para);
        System.out.println("KDV Tutarı : "+kdvTutari);
        System.out.println("KDV'li Tutar : "+toplamTutar);
    }
}