import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OutputFromFile {
    public static void main(String[] args){

        String s;

        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch(IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}