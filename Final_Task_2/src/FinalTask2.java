import java.io.*;

public class FinalTask2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите размер массива: ");

        int arraySize = Integer.parseInt(reader.readLine());


        if (arraySize < 0) {

            System.out.println("Введен неверный размер массива");

            return;

        }


        int[] array = new int[arraySize];

        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < arraySize; i++) {

            int array1 = Integer.parseInt(reader.readLine());

            array[i] = array1;

        }


        System.out.print("Вы ввели массив: ");

        for (int i = 0; i < arraySize; i++) {

            System.out.print(array[i] + " ");

        }


        for (int i = 0; i < arraySize; i++) {

            int minPosition = i;


            for (int j = i + 1; j < arraySize; j++) {

                if (array[j] < array[minPosition]) {

                    minPosition = j;

                    array[minPosition] = array[j];

                }

            }

            int temp = array[minPosition];

            array[minPosition] = array[i];

            array[i] = temp;

        }


        System.out.print("\nМассив отсортированный методом сортировки прямого выбора: ");

        for (int i = 0; i < arraySize; i++) {

            System.out.print(array[i] + " ");

        }
    }
}
