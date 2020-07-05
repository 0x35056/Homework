import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");

        String S = scan.next();
        int X = Integer.parseInt(S);
        double Y = Double.parseDouble(String.valueOf(X));

        System.out.println("String: " + S);
        System.out.println("Integer: " + X);
        System.out.println("Double: " + Y);

    }
}
