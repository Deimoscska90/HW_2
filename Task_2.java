import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
public class Task_2 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("test.txt");
        Logger logger1 = Logger.getAnonymousLogger();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        logger1.info("Первое число");
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        logger1.info("Второе число");
        System.out.println("Введите операцию (+, -, *, /): ");
        
        char operation = sc.next().charAt(0);

        if(operation == '+') {
            int result = a + b;
            System.out.println(result);
            fileWriter.write(result);
            fileWriter.close();
            
        }
        if(operation == '-') {
            int result = a - b;
            System.out.println(result);
            fileWriter.write(result);
            fileWriter.close();
        }
        if(operation == '*') {
            int result = a * b;
            System.out.println(result);
            fileWriter.write(result);
            fileWriter.close();
        }
        if(operation == '/') {
            int result = a / b;
            System.out.println(result);
            fileWriter.write(result);
            fileWriter.close();
        }
       
    }
}
