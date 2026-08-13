public class matrix {
    public static void main(String[] args) {
        int[] [] arr ; 
        arr = new int[3][4];

        int[] [] brr = {
                        {1,2},
                        {2,3},
                        {3,4},
                        {4,5},


        };

        int rowLength = brr.length;
        int colLength = brr[0].length;

        for(int i = 0; i<=rowLength-1; i++){
            for(int j = 0; j <= colLength-1; j++){
                System.out.print(brr[i] [j] + " ");
            }
            System.out.println();
        }
    }
}
