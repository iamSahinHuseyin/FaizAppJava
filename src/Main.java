import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anaPara,vade,vadeSonuToplam;
        System.out.println("****************************");
        System.out.println("Hoşgeldiniz!");
        System.out.println("****************************");

        System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz: ");
        anaPara = sc.nextInt();
        System.out.println("Vade zamanını giriniz (1 yıl %30 faiz oranı): ");
        vade = sc.nextInt();
        // Vade sonunda toplam tutarı bulmak için gecici değişkeni oluşturup anapara miktarımızı içine gönderdim
        int gecici = anaPara;

        while(true) {
            if (vade == 0){
                System.out.println("Anaparanız = " + anaPara + " kazanılan miktar= " + (anaPara - gecici));
                break;
            }
            //İşlemimiz burada başlıyor anaparanın yüzde 30 ile hesaplanıp vade sonunda anaparımıza ekleniyor.
            anaPara = anaPara + (anaPara * 3/10);
            vadeSonuToplam = anaPara - gecici;
            System.out.println("Anapara = " + anaPara
                    + " vade kalan= " + vade
                    + " Kazanılan miktar = " + vadeSonuToplam);
            //vademizi her döngünün sonunda 1 azaltıp, sonsuz döngü olayından kaçınıyoruz.
            vade = vade - 1;
        }


    }
}