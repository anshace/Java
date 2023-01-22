import java.util.Arrays;
import java.util.Scanner;
public class Insertionsort {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int[] ar= new int[num];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        ins_sort(ar);
        System.out.println(Arrays.toString(ar));

    }

    static void ins_sort(int[] ar)
    {
        for (int i = 1; i < ar.length; i++) {
            int key=ar[i];
            int j = i-1;
            for (; j>=0 && ar[j]>key; j--)
                ar[j+1]=ar[j];
            ar[j+1]=key;
        }
    }

    static void insertionSortRecursive(int arr[], int n)
    {
        // Base case
        if (n <= 1)
            return;
      
        // Sort first n-1 elements
        insertionSortRecursive(arr, n-1);
      
        // Insert last element at its correct position
        // in sorted array.
        int last = arr[n-1];
        int j = n-2;
      
        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j>= 0 && arr[j]> last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
