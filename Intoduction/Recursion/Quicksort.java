/**
 * Quicksort
 */
import java.util.Scanner;

public class Quicksort{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int[] ar =new int[len];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        quicksort(ar);
        sc.close();
    }
    
    private static void quicksort(int[] arr,int si,int ei)
    {
        if(si>=ei)
          return;
        int mid= (si+ei)/2;
        quicksort(arr, si, mid);
        quicksort(arr, mid+1,ei );
        merge(arr,si,ei);
    }

    private static void merge(int[]arr,int si,int ei)
    {
        int mid=(si+ei)/2;
        int[] aux= new int[ei-si+1];
        int i=si,j=mid+1;
        for(int k=si;k<=ei;k++);
            aux[k]=arr[k];

        for(k=si;k<=ei;k++)
        {
            if(i>mid)
                arr[k]=aux[j++];
            else if(j>high)
                    arr[k]=aux[i++];
                else if (aux[j]<aux[i])
                        arr[k]=aux[j++];
                    else
                        arr[k]=aux[i++];

        }
        
    }

    static void quicksort(int[] ar)
    {
        quicksort(ar, 0, ar.length);
    }
    
}
