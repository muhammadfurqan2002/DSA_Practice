public class Main {
    public static void MaxHeap(int []array,int size){
        int i=size;
        while(i>1){
            int parent=i/2;
            if (array[parent]<array[i]){
                swap(array,parent,i);
                i=parent;
            }
        }
    }

    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void display(int []array){
        for(int i=1;i< array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
            int []array={0,10,5,3,2,4,15};
            MaxHeap(array, array.length-1);
            display(array);
    }
}