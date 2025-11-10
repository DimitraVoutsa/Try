import java.util.Scanner;

public class Esoda {     
    public static int getExit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number");
        int num = new scanner.nextInt();
        System.out.println("The number you have inserted is: ");
        return num;
    }
}