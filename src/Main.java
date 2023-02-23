import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOranı = 0.18, kdvOranı2 = 0.08, kdvliTutar1, kdvliTutar2, kdvliTutar, kdvTutarı1, kdvTutarı2;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz :");
        tutar = input.nextDouble();

        kdvTutarı1 = tutar * kdvOranı;
        kdvTutarı2 = tutar * kdvOranı2;
        double tutar1=tutar+kdvTutarı1;
        double tutar2=tutar+kdvTutarı2;


        if (tutar<1000){
            System.out.println("KDV'li Tutar :"+tutar1);
            System.out.println("KDV'siz Tutar :"+tutar);
            System.out.println("KDV oranı :"+kdvOranı);
            System.out.println("KDV tutarı :"+kdvTutarı1);


        }
        if (tutar>1000){
            System.out.println("KDV'li Tutar :"+tutar2);
            System.out.println("KDV'siz Tutar :"+tutar);
            System.out.println("KDV oranı :"+kdvOranı2);
            System.out.println("KDV tutarı :"+kdvTutarı2);

        }



    }
}