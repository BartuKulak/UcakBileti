import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int km,yas,tip;
        double ucret=0.10,tutar,indirim;
        System.out.print("Mesafeyi km türünden giriniz: ");
        km= input.nextInt();
        System.out.print("Yaşınızı Girin: ");
        yas=input.nextInt();
        System.out.print("Yolculuk tipini seçin (1=>Tek Yön, 2=>Gidiş Dönüş ): ");
        tip=input.nextInt();
        tutar=km*ucret;
        if(yas<12)
        {
            indirim=tutar*0.5;
            tutar-=indirim;
        }
        else if(yas>12 && yas<24)
        {
            indirim=tutar*0.1;
            tutar-=indirim;
        }
        else if(yas>65)
        {
            indirim=tutar*0.3;
            tutar-=indirim;
        }
        if(tip==2)
        {
            indirim=tutar*0.2;
            tutar-=indirim;
            tutar*=2;
        }
        if(km>0 && yas>0 && (tip==1 || tip==2))
        {
            System.out.println("\nToplam Tutar="+tutar);
        }
        else
        {
            System.out.println("\nHatali Veri Girdiniz!");
        }
    }
}
