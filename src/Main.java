import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sqrt().apply((double) number));
    }
    public static UnaryOperator<Double> sqrt(){
        UnaryOperator<Double>result = (number)->Math.sqrt(number);
        return result;
    }


}