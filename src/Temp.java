import java.util.Scanner;
public class Temp {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double Fahrenheit=obj.nextDouble();
        double Celsius= (Fahrenheit-32)/1.8;
        System.out.println(Celsius);
    }
}