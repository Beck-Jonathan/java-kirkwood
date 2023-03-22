import java.util.Arrays;

public class Assignment4 {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4};

        int[] updatedArray = updateArray(original, 3, 10);
        System.out.println("this is replacing the value at index 3 with a 10");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Changed: " + Arrays.toString(updatedArray));

        int[] insertedArray = insertIntoArray(original, 1, 10);
        System.out.println("inserting items");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Changed: " + Arrays.toString(insertedArray));

        int[] deleteItem = deleteArrayItem(original, 3);
        System.out.println("Deleting items");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Changed: " + Arrays.toString(deleteItem));

        int[] swappedArray = swapArrayItems(original, 3, 1);
        System.out.println("Swaping items");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Changed: " + Arrays.toString(swappedArray));

        int[] shiftedRight = shiftRight(original);
        System.out.println("Shifting right");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Changed: " + Arrays.toString(shiftedRight));

    }


    //        Task 1: Update
//        Update a value somewhere in the array.
//
//        Sample Run:
//        Original list: [0, 1, 2, 3, 4]
//        Update value at index: 3
//        Enter an integer: 10
//        Modified list: [0, 1, 2, 10, 4]

    public static int[] updateArray(int[] array, int index, int value) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                temp[i] = array[i];
            }
            if (i == index) {
                temp[i] = value;
            }
        }
        return temp;

    }


//        Task 2: Insertion
//        Insert a value somewhere in the array and shift remaining elements to the right.
//        Note that the last element will be pushed off the list.
//
//        Original list: [0, 1, 2, 3, 4]
//        Insert value at index: 1
//        Enter an integer: 10
//        Modified list: [0, 10, 1, 2, 3, 4]

    public static int[] insertIntoArray(int[] array, int index, int value) {
        int[] temp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                temp[i] = array[i];
            }
            if (i == index) {
                temp[i] = value;
            }
            if (i > index - 1) {
                temp[i + 1] = array[i];
            }
        }
        return temp;
    }

//        Task 3: Deletion
//        Remove a value in the array.
//
//        Sample Run:
//        Original list: [0, 1, 2, 3, 4]
//        Delete value at index: 3
//        Modified list: [0, 1, 2, 4]

    public static int[] deleteArrayItem(int[] array, int index) {
        int[] temp = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                temp[i] = array[i];
            }
            if (i > index) {
                temp[i - 1] = array[i];
            }
        }
        return temp;
    }

//        Task 4: Swapping
//        Swap two values.
//
//        Sample Run:
//        Original list: [0, 1, 2, 3, 4]
//        Swap value at index: 3
//        With the value at index: 1
//        Modified list: [0, 3, 2, 1, 4]

    public static int[] swapArrayItems(int[] array, int index1, int index2) {
        int[] temp = new int[array.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[i];
        }
        int j = temp[index1];
        temp[index1] = temp[index2];
        temp[index2] = j;
        return temp;
    }


//        Task 5: Shift Right
//        Shift every element one place to the right.
//
//        Sample Run:
//        Original list: [0, 1, 2, 3, 4]
//        Modified list: [4, 0, 1, 2, 3]

    public static int[] shiftRight(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < temp.length - 1; i++) {
            temp[i + 1] = array[i];
        }
        temp[0] = array[array.length - 1];

        return temp;
    }


}
