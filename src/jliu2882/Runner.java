package jliu2882;
public class Runner {
    public static void main(String[] args) {
        int count = 10;

        long startTime=System.nanoTime();
        int[] list1=InPlaceSorts.randIntArr(count,9);
        for(int i=0;i<list1.length;i++){System.out.print(list1[i]+" ");}
        System.out.println("");
        InPlaceSorts.insertionSort(list1);
        for(int i=0;i<list1.length;i++){System.out.print(list1[i]+" ");}
        long endTime=System.nanoTime();
        System.out.println("\n Insertion sort : "+((endTime-startTime)/1e6)+" ms\n");


        startTime=System.nanoTime();
        double[] list2=InPlaceSorts.randDoubArr(count,9);
        for(int i=0;i<list2.length;i++){System.out.print(list2[i]+" ");}
        System.out.println("");
        InPlaceSorts.selectionSort(list2);
        for(int i=0;i<list2.length;i++){System.out.print(list2[i]+" ");}
        endTime=System.nanoTime();
        System.out.println("\n Selection sort : "+((endTime-startTime)/1e6)+" ms\n");


        startTime=System.nanoTime();
        String[] list3=InPlaceSorts.randStrArr(count);
        for(int i=0;i<list3.length;i++){System.out.print(list3[i]+" ");}
        System.out.println("");
        InPlaceSorts.bubbleSort(list3);
        for(int i=0;i<list3.length;i++){System.out.print(list3[i]+" ");}
        endTime=System.nanoTime();
        System.out.println("\n Bubble sort : "+((endTime-startTime)/1e6)+" ms\n");


        startTime=System.nanoTime();
        int[] list4=InPlaceSorts.randIntArr(count,9);
        for(int i=0;i<list4.length;i++){System.out.print(list4[i]+" ");}
        System.out.println("");
        InPlaceSorts.mergeSort(list4);
        for(int i=0;i<list4.length;i++){System.out.print(list4[i]+" ");}
        endTime=System.nanoTime();
        System.out.println("\n Merge sort : "+((endTime-startTime)/1e6)+" ms\n");


        startTime=System.nanoTime();
        int[] list5=InPlaceSorts.randIntArr(count,9);
        for(int i=0;i<list5.length;i++){System.out.print(list5[i]+" ");}
        System.out.println("");
        InPlaceSorts.quickSort(list5,0,9);
        for(int i=0;i<list5.length;i++){System.out.print(list5[i]+" ");}
        endTime=System.nanoTime();
        System.out.println("\n Quick sort : "+((endTime-startTime)/1e6)+" ms\n");
    }
}
