public class checkEven {
    static void checkEven(int num){
        if(num % 2 == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static void main() {
        checkEven(16);
        checkEven(21);
    }
}
