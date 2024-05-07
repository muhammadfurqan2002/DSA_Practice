public class HEAP {
    int []array;
    int size;
    HEAP(){
        this.size=0;
        array=new int[100];
        array[0]=0;
    }

    public void insert(int value){
        ++this.size;
        array[size]=value;
        int i=size;
        while (i>1){
            int parent=i/2;
            if (array[parent]<array[i]){
                    swap(array,parent,i);
                    i=parent;
            }
        }
    }

    public void swap(int []array,int i, int j){
        int temp=this.array[i];
        this.array[i]=this.array[j];
        this.array[j]=temp;
    }
    public void display(){
        for (int i=1;i<=size;i++){
            System.out.println(this.array[i]);
        }
    }
    public void delete() {
        if (this.size == 0) {
            System.out.println("Array is empty");
        } else {
            this.array[1] = this.array[this.size];
            --this.size;
            int i = 1;

            while(i <= this.size) {
                int left = i * 2;
                int right = i * 2 + 1;
                if (this.array[i] < this.array[left]) {
                    swap(this.array, i, left);
                    i = left;
                } else {
                    if (this.array[i] >= this.array[right]) {
                        return;
                    }

                    swap(this.array, i, right);
                    i = right;
                }
            }

        }
    }


    public static void main(String[] args) {
        HEAP hp=new HEAP();
        hp.insert(10);
        hp.insert(20);
        hp.delete();
        hp.display();
    }

}
