public class BubbleSort{
    public static void main() {
    // BUBBLE SORT
        // declares, initializes, and prints original array
        System.out.println();
        System.out.println("Bubble Sort Method");
        int[] array2 = {500, 25, 1, 81, 4, 49};
        System.out.print("Here is your unsorted array: [");
        printArray(array2);
        
        // declares, initializes, sorts, and prints the sorted array
        int[] sortedArray2 = bubbleSort(array2); // bubbleSort method
        System.out.print("Here is your sorted array: [");
        printArray(sortedArray2);
}   
public static int[] bubbleSort(int[] ints){ // uses bubble sort
        // metrics variables
        int compares = 0;
        int swaps = 0;
        double time = System.nanoTime();
        
        // where the sort ends each time
        int limit = ints.length - 1;
        
        // repeats until the limit gets to 1
        for(int i = limit; i > 1; i--){
            // runs through the array until the limit
            for(int j = 0; j < limit; j++){
                // compares the current value to the one after
                compares++;
                if(ints[j] > ints[j+1]){
                    // if the current value is greater, swap the two
                    int tempJ = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = tempJ;
                    swaps++;
                }
            }
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