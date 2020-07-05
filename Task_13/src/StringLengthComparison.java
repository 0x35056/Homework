import java.util.Scanner;

public class StringLengthComparison {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = scan.next();
        System.out.print("Введите вторую строку: ");
        String str2 = scan.next();

        if (str1.length() > str2.length()){
            System.out.print("Строка с наибольшей длиной: " + str1);
        } else if (str1.length() < str2.length()){
            System.out.print("Строка с наибольшей длиной: " + str2);
        } else {
            System.out.print("Строки равны.");
        }
    }
}
