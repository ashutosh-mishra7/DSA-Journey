import java.util.*;



public class Input {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        /*System.out.println("What is your Name: ");
        String name = sc.next();

        System.out.println("My Name is: " + name); */


        /*System.out.println("What is your name: ");
        String name = sc.nextLine();
        System.out.println("What is your age: ");
        int age = sc.nextInt();

        // System.out.println("Hello "+ name + ", are you " + age + " years old");
        System.out.printf("Hello %s, you are %d years old", name, age);*/

        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        double div = (int) num1 / num2;


        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
    }
}
