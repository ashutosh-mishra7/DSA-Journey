public class getMaximum {
    static int getMaximum(int a, int b) {
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main() {
      int max = getMaximum(10,55);
             System.out.println("Maximum: " + max);
        }
    

}
