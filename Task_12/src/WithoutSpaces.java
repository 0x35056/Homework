import java.util.Scanner;

public class WithoutSpaces {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scan.nextLine().replaceAll("\\s", "");
        System.out.print("Результат: " + str);
    }
}
