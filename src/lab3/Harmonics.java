package lab3;
import java.util.Scanner;
public class Harmonics {


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double sum=0,n,i;
        System.out.println("Enter the value of N upto which you want sum of Harmonic series:");
        n=sc.nextDouble();
        for(i=1;i<=n;i++) {
            sum=sum+(1/i);
            System.out.print(sum+",");

        }
        System.out.println();

        System.out.println("The sum of the series is:" +sum);


    }

}