import java.util.Scanner;
public class Price {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double price;
        long amount;
        long rupee;
        long paise;
        System.out.println("Enter price in decimal form:");
        price=sc.nextDouble();
        amount= Math.round(price*100);
        //System.out.println(amount);
        rupee= amount / 100 ;
        paise=amount % 100;
        System.out.println(rupee + " Rupees " + paise +" Paise");

    }
}