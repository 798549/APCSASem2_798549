
/**
 * Write a description of class MergeSort here.
 *
 * @author Jeremiah
 * @version 1/18/19
 */
public class MergeSort
{
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {return;} //  Base Case
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        merge(a, l, r, mid, n - mid);
    }
}