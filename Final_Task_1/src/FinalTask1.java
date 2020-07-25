import java.io.*;

public class FinalTask1 {
    public static void main(String[] args) throws IOException {

        int binary = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите двоичное число: ");

        String s = reader.readLine();

        int length = s.length();

        int x = length;

        for (int i = 0; i < length; i++) {

            int num = Character.getNumericValue(s.charAt(i));

            if (num >= 2) {

                System.out.println("Двоичное число должно состоять из 1 и 0");

                System.exit(0);

            }

            binary += Math.pow(2, --x) * num;

        }

        System.out.println("Результат перевода из двоичного " + s + " в десятичное: " + binary);
    }
}
