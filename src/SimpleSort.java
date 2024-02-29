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
            System.out.println(this.arr[i]);
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
}
