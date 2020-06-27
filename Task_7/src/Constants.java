import java.util.Scanner;

public class Constants {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");

        int number = scan.nextInt();

        final int X = 1;
        final int Y = 2;
        final int Z = 3;

        switch (number) {
            case 1:
                System.out.print("Данное значение имеется в константах");
                break;

            case 2:
                System.out.print("Данное значение имеется в константах");
                break;

            case 3:
                System.out.print("Данное значение имеется в константах");
                break;

            default:
                System.out.print("Такой константы нет!");
                break;
        }
    }
}
