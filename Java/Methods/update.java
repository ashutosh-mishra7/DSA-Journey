public class update {

    static void updateValue(int x) {
        x = x + 10;
        System.out.println("Inside method: " + x);
    }

    public static void main(String[] args) {

        int num = 5;

        updateValue(num);

        System.out.println("In main: " + num);
    }

}
