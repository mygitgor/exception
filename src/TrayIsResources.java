import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TrayIsResources {
    public static void main(String[] args) {
        

        try (FileReader reader = new FileReader ("/Users/mypyw/OneDrive/Desktop/tryresource/src/resources/fileread.txt");
            FileWriter writer = new FileWriter("/Users/mypyw/OneDrive/Desktop/tryresource/src/resources/fileWrite.txt")) {
            reader.read();
            while (reader.ready()){
                writer.write(reader.read());
            }

        } catch (RuntimeException | IOException e) {
            System.out.println("catching exception: " + e.getClass().getSimpleName());
        }
        System.out.println("copied");
    }
}
