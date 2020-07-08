import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        for(int i = arr.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]<arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
