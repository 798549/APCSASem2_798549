



// Jeremiah Ponce
public class selectionsort
{
    public static void main() { 
        // SELECTION SORT
        // declares, initializes, and prints original array
        System.out.println();
        System.out.println("Selection Sort Method");
        int[] array3 = {500, 25, 1, 81, 4, 49};
        System.out.print("Here is your unsorted array: [");
        printArray(array3);
        // declares, initializes, sorts, and prints the sorted array
        int[] sortedArray3 = selectionSort(array3); // selectionSort method
        System.out.print("Here is your sorted array: [");
        printArray(sortedArray3);
    }

    public static int[] selectionSort(int[] ints){ // uses selection sort
        // metrics variables
        int compares = 0;
        int swaps = 0;
        double time = System.nanoTime();

        // repeats until the index is one less than the array length
        for(int i = 0; i < ints.length - 1; i++){
            // value at which to start the sort
            int start = i;
            // runs through the array beginning just after the start
            for(int j = i + 1; j < ints.length; j++) {
                // compares the start value to the ones after it
                compares++;
                if(ints[j] < ints[start]){
                    start = j;
                }
            }
            // swapping part
            int tempJ = ints[start];
            ints[start] = ints[i];
            ints[i] = tempJ;
            swaps++;
        }
        double endTime = System.nanoTime();

        // prints metrics
        System.out.println("Compares: " + compares);
        System.out.println("Swaps: " + swaps);
        System.out.println("Nanoseconds taken: " + (endTime - time));

        // returns the sorted array
        return ints;
    }  

    public static void printArray(int[] ints){ // extra method to print an array
        // runs through the array, printing the values
        for(int i = 0; i < ints.length - 1; i++){
            System.out.print(ints[i] + ", ");
        }

        // prints the final value with a bracket instead of a comma
        System.out.println(ints[ints.length - 1] + "]");
    }
}
