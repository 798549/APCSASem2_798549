public class InsertionSort{
    public static void main() { // main method
        // INSERTION SORT
        // declares, initializes, and prints original array
        System.out.println();
        System.out.println("Insertion Sort Method");
        int[] array4 = {500, 25, 1, 81, 4, 49};
        System.out.print("Here is your unsorted array: [");
        printArray(array4);

        // declares, initializes, sorts, and prints the sorted array
        int[] sortedArray4 = insertionSort(array4); // selectionSort method
        System.out.print("Here is your sorted array: [");
        printArray(sortedArray4);
    }

    public static int[] insertionSort(int[] ints){ // uses insertion sort
        // metrics variables
        int compares = 0;
        int swaps = 0;
        double time = System.nanoTime();

        int tempJ;
        // repeats until the index is one less than the array length
        for(int i = 1; i < ints.length; i++){
            // runs through the array beginning at i and going backward
            for(int j = i; j > 0; j--) {
                // compares the start value to the ones after it
                compares++;
                if(ints[j] < ints[j-1]){
                    // if the current value is less, swap the two
                    tempJ = ints[j];
                    ints[j] = ints[j-1];
                    ints[j-1] = tempJ;
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