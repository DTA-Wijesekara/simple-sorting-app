public class SimpleSort
{
    private int[] arr;
    private int nElement;
    public SimpleSort(int max)
    {
        this.arr = new int[max];
        this.nElement =0;
    }
    public void insert (int value)
    {
        if (nElement == arr.length)
        {
            System.out.println("array is full");
            return;
        }
        this.arr[this.nElement]=value;
        this.nElement++;
    }
    public void display()
    {
        System.out.println("array content");
        for (int i = 0; i < this.nElement ;i++)
        {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
    public void swap(int index1, int index2)
    {
        int temp;
        temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
    public void bubbleSort()
    {
        for (int i=0; i<nElement-1 ;i++)
        {
            for (int j=0; j<(nElement-1)-i ;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1);
                }
            }
        }
        System.out.println("numbers are sorted by bubble sort");
    }
    public void selectionSort()
    {
        for (int i=0; i<nElement-1 ;i++)
        {
            int minIndex=i;
            for (int j=i+1; j<nElement ;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            swap(i,minIndex);
        }
        System.out.println("numbers are sorted by selection sort");
    }
}
