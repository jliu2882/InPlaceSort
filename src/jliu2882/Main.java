package jliu2882;

public class Main {

    public static void main(String[] args) {
        int[] num = methods.randIntArr(10);
        for(int i = 0; i < num.length ; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        methods.insertionSort(num);
        for(int i = 0; i < num.length ; i++){
            System.out.print(num[i] + " ");
        }
    }


}
