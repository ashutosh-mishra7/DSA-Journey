import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];

        System.out.println("Enter names:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.print("Names are:");
        for(String name : arr) {
            System.out.println(name);
        }
    }
}