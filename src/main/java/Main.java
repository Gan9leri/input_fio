import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\admin\\IdeaProjects\\input_fio\\src\\main\\resources\\fio.txt")) {
            int c;
            while ((c= reader.read()) != -1){
                System.out.println((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
