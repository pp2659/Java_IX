import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three unequal numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        
        int secondSmallest = num1 + num2 + num3 - max - min;
        
        System.out.println("Second smallest number: " + secondSmallest);
    }
}
