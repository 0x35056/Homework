import java.io.*;

public class InputToFile {
    public static void main(String[] args){

        String s;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для остановки записи в файл нажмите 'stop' ");

        try (FileWriter fw = new FileWriter("file.txt", true)){
            do{
                System.out.print("> ");
                s = br.readLine();

                if(s.compareTo("stop") == 0) break;

                s = s + "\r\n";
                fw.write(s);
            } while (s.compareTo("stop") != 0);
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}