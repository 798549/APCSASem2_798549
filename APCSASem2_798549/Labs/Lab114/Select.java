class Select
{
    void sort(int arr[])
    {
        int n = arr.length;
  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
  
    // Print
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  
    // Driver code to test above
    public static void main(String args[])
    {
        Select ob = new Select();
        int arr[] = {7,25,10,3,1};
        ob.sort(arr);
        System.out.println("This Is your sorted array:");
        ob.printArray(arr);
    }
}
