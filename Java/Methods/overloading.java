public class overloading {
    static void display(int num){
        System.out.println("Num: " + num);
    }

    static void display(String text){
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        display(687);
        display("Ashutosh");
    }
}
