import java.util.Scanner;
 public class Main{


        public static void main(String[]args) {
                double Fiyat,sonuc,lowtaxrate,hightaxrate,taxrate;
                String taxratepercent;
                Scanner input = new Scanner(System.in);
                System.out.println("ENTER PRICE :");
                Fiyat = input.nextDouble();
                lowtaxrate=0.08;
                hightaxrate=0.18;
                sonuc = (0 <= Fiyat && Fiyat<=1000) ? Fiyat+(Fiyat*hightaxrate) : Fiyat+(Fiyat*lowtaxrate);
                taxrate = ((sonuc-Fiyat)/Fiyat)*100;
                taxratepercent = taxrate + "%";
                System.out.println("Tax Rate :"+ taxratepercent);
                System.out.println("Tax Included Price :"+ sonuc);

        }
}