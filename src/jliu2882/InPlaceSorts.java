package jliu2882;

public class InPlaceSorts {
    public static void swap(int list1[], int i, int j){
        int temp = list1[i];
        list1[i]=list1[j];
        list1[j]=temp;
    }
    public static void swap(double list1[], int i, int j){
        double temp = list1[i];
        list1[i]=list1[j];
        list1[j]=temp;
    }
    public static void swap(String list1[], int i, int j){
        String temp = list1[i];
        list1[i]=list1[j];
        list1[j]=temp;
    }

    public static int randInt(int max){
        return (int)(Math.random()*(max+1));
    }
    public static int[] randIntArr(int count, int max){
        int[] list1;
        list1 = new int[count];
        for(int i = 0; i < list1.length; i++){
            list1[i] = randInt(max);
        }
        return list1;
    }

    public static double randDoub(int max){
        return Math.random()*(max+1);
    }
    public static double[] randDoubArr(int count, int max){
        double[] list1;
        list1 = new double[count];
        for(int i = 0; i < list1.length;i++){
            list1[i] = randDoub(max);
        }
        return list1;
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
        String[] list1;
        list1 = new String[count];
        for(int i =0; i < list1.length;i++){
            list1[i] = randStr();
        }
        return list1;
    }


    public static void bubbleSort(String[] list1){
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list1.length-1; j++) {
                if (list1[j + 1].compareTo(list1[j])<0) {
                    swap(list1, j, j + 1);
                }
            }
        }
    }
    public static void selectionSort(double[] list1){
        for(int i = 0; i < list1.length; i ++){
            for(int j = i + 1; j < list1.length; j++){
                if(list1[i]>list1[j]){
                    swap(list1,i,j);
                }
            }
        }
    }
    public static void insertionSort(int[] list1){
        for(int i = 1; i < list1.length; i ++){
            int temp = list1[i];
            int j;
            for(j = i-1; j>=0 && temp  < list1[j]; j--){
                list1[j+1] = list1[j];
            }
            list1[j+1] = temp;
        }
    }
}
