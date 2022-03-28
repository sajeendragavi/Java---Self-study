public class FindMax {
    public static void main(String args []){
        int [] arr = {4, 23, 53, 1, 33, 98, 69};
        int n = 7;
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max is"+ max);
    }

}
