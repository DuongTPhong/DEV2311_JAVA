public class DaChieu {
    public static void main(String[] args) {
        int[] [] a= {{2,3}, {3,4}, {4,3}};

        for (int i= 0; i<3; i ++) {
            for (int j =0; j<2; j ++) {
                System.out.printf("a[%d][%d] = %d", i,j,a[i][j]);
            }
            System.out.println();
        }
    }
}
