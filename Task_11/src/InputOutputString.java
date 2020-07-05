import java.util.Scanner;

public class InputOutputString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scan.nextLine();
        System.out.print("Результат: " + str);
    }
}
