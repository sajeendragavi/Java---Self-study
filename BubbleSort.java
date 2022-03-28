//selection sort// finding  the minimum and bring it into the begining // same class name though it is selection sort
public class BubbleSort{
    void selectionSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int min_index = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }

            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
    }

    void printArray(int [] arr){
        int n = arr.length;
        for(int k = 0; k < n; k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String args []){
        BubbleSort b = new BubbleSort();
        int [] arr = {64, 25, 12, 22, 11};
        b.selectionSort(arr);
        System.out.println("after sorted");
        b.printArray(arr);
    }

}




/*
//bubble sort
public class BubbleSort {
    void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                 if (arr[j] > arr[j + 1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
            }
        }
    }

    void printArray(int [] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args []){
        BubbleSort b = new BubbleSort();
        int [] arr = {4, 6, 1, 9, 3, 7, 2};
        System.out.println("before Sorted array");
        b.printArray(arr);
        b.bubbleSort(arr);
        System.out.println("/nSorted array");
        b.printArray(arr);

     }
}
*/