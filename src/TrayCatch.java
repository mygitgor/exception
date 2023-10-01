import java.util.Scanner;

public class TrayCatch {
    public static void main(String[] args) throws Exception {
        
        float result = getTypeFloat();
        System.out.println(result);
        resolve2();
        resolve3();

    }

    public static float getTypeFloat(){
        Scanner scaner = new Scanner(System.in);
        float result = 0;
        boolean isValid = false;
        do {
            System.out.println("Введите число:");
            if(scaner.hasNextFloat()){
                result = scaner.nextFloat();
                isValid = true;
            }else {
                System.out.println("Некорректный ввод");
                scaner.nextLine();
            }
        }while (!isValid);
        scaner.close();
        return result;
    }

    public static void resolve2(){
        try {
            int d = 0;
            int[] array = new int[8];
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e);
        }

    }
    
    public static void resolve3(){
        try {
            int a = 90;
            int b = 3;

            System.out.println(a / b);

            printSum(23, 234);

            int[] abc = { 1, 2 };
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
 
    }
     
    public static void printSum(Integer a, Integer b) throws RuntimeException {
        System.out.println(a + b);
    }

}



