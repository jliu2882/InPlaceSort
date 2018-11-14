package jliu2882;

public class Main {

    public static void main(String[] args) {
        int[] num = randIntArr(4);
        selectionSort(num);
        for(int i = 0; i < num.length ; i++){
            System.out.println(num[i]);
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int randInt(int max){
        return (int)(Math.random()*(max+1));
    }

    public static int[] randIntArr(int count){
        int[] arr;
        arr = new int[count];
        for(int i = 0; i < arr.length; i++){
            arr[i] = randInt(10000);
        }
        return arr;
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

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i ++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
}
