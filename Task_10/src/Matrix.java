import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Введите количество строк: ");
        int row = scan.nextInt();
        System.out.print("Введите количество столбцов: ");
        int column = scan.nextInt();

        if(column < 0 || row < 0){
            System.out.print("Введен неверный размер матрицы");
            return;
        }

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++){
            System.out.printf("Введите значение %d строки через пробел \n", i);
            String[] str = scan.next().split(" ");

            if(str.length != column){
                System.out.println("Error");
                i--;
                continue;
            }

            for(int k = 0; k < column; k++){
                array[i][k] = Integer.parseInt(str[k]);
            }
        }

        for (int i = 0; i < column; i++){
            System.out.print(array[0][i] * 3 + " ");
        }
    }
}
