import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> fio = new ArrayList<>();
        InputStream inputStream = Main.class.getResourceAsStream("/fio.txt");
        if (inputStream != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                fio.add(line);
            }
        }
        else {
            System.err.println("Файл fio.txt не найден в ресурсах");
        }
        for (String s : fio) {
            System.out.println(s);
        }
    }
}
