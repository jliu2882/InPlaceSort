package jliu2882;

public class InPlaceSorts {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void swap(double arr[], int i, int j){
        double temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void swap(String arr[], int i, int j){
        String temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int randInt(int max){
        return (int)(Math.random()*(max+1));
    }
    public static int[] randIntArr(int count, int max){
        int[] arr;
        arr = new int[count];
        for(int i = 0; i < arr.length; i++){
            arr[i] = randInt(max);
        }
        return arr;
    }

    public static double randDoub(int max){
        return Math.random()*(max+1);
    }
    public static double[] randDoubArr(int count, int max){
        double[] arr;
        arr = new double[count];
        for(int i = 0; i < arr.length;i++){
            arr[i] = randDoub(max);
        }
        return arr;
    }

    public static String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static String randStr(){
        int wordLength = randInt(5)+3;
        String result = "";
        for(int i = 0; i < wordLength;i++){
            result+=alphabet[randInt(25)];
        }
        return result;
    }
    public static String[] randStrArr(int count){
        String[] arr;
        arr = new String[count];
        for(int i =0; i < arr.length;i++){
            arr[i] = randStr();
        }
        return arr;
    }


    public static void bubbleSort(String[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++) {
                if (arr[j + 1].compareTo(arr[j])<0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    public static void selectionSort(double[] arr){
        for(int i = 0; i < arr.length; i ++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i ++){
            int temp = arr[i];
            int j;
            for(j = i-1; j>=0 && temp  < arr[j]; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
}
