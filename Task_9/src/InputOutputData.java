import java.util.Scanner;

    public class InputOutputData {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Задайте размер массива: ");
            int size = Integer.parseInt(scan.nextLine());

            if (size <= 0){
                System.out.print("Размер массива должен быть больше нуля");
                return;
            }

            int[] array = new int[size];

            System.out.println("Введите элементы массива: ");

            for (int i = 0; i < size; i++){
                array[i] = scan.nextInt();
            }

            for (int i = 0; i < size; i++){
                array[i] *= 2;
            }

            for (int i = 0; i < size; i++){
                System.out.print(array[i] + " ");
            }
        }
    }
