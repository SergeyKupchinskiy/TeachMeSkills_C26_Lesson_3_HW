import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        System.out.println("Enter today's temperature");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if(t > -5){
            System.out.println("Warm");
        } else if (t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}
