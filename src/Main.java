// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        SimpleSort s1 = new SimpleSort(7);
        s1.insert(4);
        s1.insert(8);
        s1.insert(1);
        s1.insert(3);

        s1.display();
        s1.selectionSort();
        s1.display();
    }
}