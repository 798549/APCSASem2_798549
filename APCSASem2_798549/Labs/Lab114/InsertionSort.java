public class InsertionSort{
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 

    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    public static void main(String args[]) 
    {         
        System.out.println("sorted array is: ");
        int arr[] = {2,567,56,5,4,3,6,8,9,456,45,4}; 
        InsertionSort ob = new InsertionSort();         
        ob.sort(arr); 
        printArray(arr);   
        } 
} 