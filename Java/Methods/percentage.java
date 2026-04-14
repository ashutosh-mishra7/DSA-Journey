public class percentage {
    static double getPercentage(int obtained, int total){
        return(obtained * 100.0) / total;
    }

    public static void main(String[] args) {
        double get = getPercentage(853,1800);
        System.out.println("Total: " + get + "%");
    }
}
