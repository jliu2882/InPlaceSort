package jliu2882;

public class Main {

    public static void main(String[] args) {
        int[] num = {1,2,4,2,6,1,2,4,6,3,1,78,3,2,9,2,4};
        bubbleSort(num);
        for(int i = 0; i < num.length ; i++){
            System.out.println(num[i]);
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}
