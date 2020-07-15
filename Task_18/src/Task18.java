import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {

            String lineR;

            while ((lineR = reader.readLine()) != null) {

                System.out.println(lineR);

                strings.add(lineR);

            }

        } catch (IOException exc) {

            System.out.println("Ошибка ввода " + exc);

        }

        Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());

        System.out.println("Для завершения записи нажмите Ctrl+D (Ctrl+Z) на новой строке");

        int i = 0;

        while (scan.hasNext()) {

            if (i >= strings.size()) {

                System.out.println("Превышена длина исходного файла");

                break;

            }

            String lineW = scan.nextLine();

            strings.set(i++, lineW + System.lineSeparator());

        }

        try (FileWriter fw = new FileWriter("file.txt")) {

            for (String line : strings) {

                fw.write(line);

            }

        } catch (IOException e) {

            System.out.println("Не удалось записать в файл" + e.getMessage());

        }

        System.out.println("Файл успешно записан");

    }

}