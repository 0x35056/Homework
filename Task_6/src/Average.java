import java.util.Scanner;

    public class Average {

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.print("Введите x: ");
            double x = Integer.parseInt(scan.nextLine());
            System.out.print("Введите y: ");
            double y = Integer.parseInt(scan.nextLine());
            System.out.print("Введите z: ");
            double z = Integer.parseInt(scan.nextLine());

            double average = (x + y + z)/3;

            System.out.println("Среднее арифметическое: " + average);

            int devidedByTwo = (int) (average/2);

            System.out.println("Среднее арифметическое деленное на 2 без остатка: " + devidedByTwo);

            if (devidedByTwo > 3){
                System.out.println("Программа выполнена корректно.");
            }

        }

    }

