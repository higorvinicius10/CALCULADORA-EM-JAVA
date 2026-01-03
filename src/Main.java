import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner Prohibited = new Scanner(System.in);

        System.out.println("Informe o número: ");
        double num1 = Prohibited.nextDouble();

        System.out.println("Informe o número: ");
        double num2 = Prohibited.nextDouble();

        System.out.println("Informe a operação: ");
        String op = Prohibited.next();

        double RESULT = "+".equals(op) ? num1 + num2 : 0;

        RESULT = "-".equals(op) ? num1 - num2 : RESULT;
        RESULT = "*".equals(op) ? num1 * num2 : RESULT;
        RESULT = "/".equals(op) ? num1 / num2 : RESULT;
        RESULT = "%".equals(op) ? num1 % num2 : RESULT;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, RESULT);

        Prohibited.close();

    }
}
