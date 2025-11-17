import java.util.Scanner;

public class LabActivity2 {
public class NameAgeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int limit = sc.nextInt();
        // Input name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        int sum = 0;
        int i = 1;    
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        while (i <= limit) {
            sum = sum + i;  
            i = i + 1;     
        }

        System.out.println("The sum of natural numbers up to " + limit + " is: " + sum);

        sc.close();
        input.close();
    }
}
