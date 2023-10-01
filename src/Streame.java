import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Streame {
    
    public static void main(String[] args) {
        Fio fio = new Fio();
        
        streamScan(fio);
       

    }

    public static void streamScan(Fio arg){
        boolean enter = true;
         try (Scanner scanner = new Scanner (System.in);
                FileWriter writer = new FileWriter("/Users/mypyw/OneDrive/Desktop/tryresource/src/resources/fileWrite.txt")) {
            while (enter && true){
                System.out.println("Введите фамилию: от 3 до 9 символов");
                arg.surname = scanner.next(); 
                System.out.println("Введите имя: от 3 до 9 символов");
                arg.name = scanner.next();
                System.out.println("Введите отчество: от 3 до 9 символов");
                arg.patronymic = scanner.next();
                System.out.println("Введите дату рождения: от 3 до 9 символов");
                arg.date = scanner.next();
                System.out.println("Введите номер телефона: от 3 до 8 символов");
                arg.phone = scanner.nextInt(); 
                System.out.println("Введите пол:");
                arg.sex = scanner.next().charAt(0);
                enter = false;            
            }

        } catch (RuntimeException | IOException e) {
            System.out.println("catching exception: " + e.getClass().getSimpleName());
        }
        System.out.println("copied");
        System.out.println(arg.argumentControl(arg));
    }

    
}
