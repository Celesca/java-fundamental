public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 5*(i+1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        int[][] arr2 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr2[i][j] = i+j;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}