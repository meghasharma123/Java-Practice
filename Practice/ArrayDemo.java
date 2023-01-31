public class ArrayDemo {
    public static void main(String args[]) {
        int nums[][] = new int[4][5];
        for(int i = 0;i<4;i++){
            for(int j = 0 ; j<5;j++){
                int r = (int)(Math.random()*100);
                nums[i][j] = r;
                System.out.print(r + "  ");
            }
            System.out.println(" ");
        }

        System.out.println("Other way for FOR loop or Enhanced for loop : ");

        for(int n[] : nums){
            for(int x : n){
                System.out.print(x+ "  ");
            }
            System.out.println(" ");
        }

        System.out.println("Jagged Array : ");

        int arr[][] = new int[3][];
        arr[0] = new int [2];
        arr[1] = new int [3];
        arr[2] = new int [4];
        for(int x[]: arr){
            for(int y : x){
                System.out.print(y+"  ");
            }
            System.out.println();
        }
    }
}
