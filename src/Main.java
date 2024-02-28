import java.util.Scanner;
//Kullanıcıdan veri alabilmek için Scanner sınıfını projeye dahil ediyoruz

public class Main {

    public static void main(String[] args) {


        //Kullanıcıdan hgelecek 2 değer için ayrı ayrı değişkenler oluşturuyoruz
        int sayi1,
                sayi2, ebob = 1,
                ekok = 1,
                i = 1;

        Scanner input = new Scanner(System.in);


        //Kullanıcıdan değerleri alıyoruz
        System.out.println("İlk  Sayiyi Giriniz: ");
        sayi1 = input.nextInt();


        System.out.println("İkinci Sayiyi Giriniz: ");
        sayi2 = input.nextInt();


        //aldığımız verilerin ebob değerini hesaplıyoruz
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }System.out.println("EBOB: " + ebob);


       //aldığımız verilerin ekok değerlerini hesaplıyoruz
        while (i <= (sayi1 * sayi2)) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }System.out.println("EKOK: " + ekok);


    }
}