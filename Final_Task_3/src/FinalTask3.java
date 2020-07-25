import java.io.*;

public class FinalTask3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите курс доллара к рублю: ");

        double course = Double.parseDouble(reader.readLine());

        System.out.print("Введите денежную сумму в рублях: ");

        double rub = Float.parseFloat(reader.readLine());

        double result = (rub * 100.0 / course) / 100.0;

        System.out.printf("%.0f рублей =  %.2f долларов", rub, result);

    }
}
