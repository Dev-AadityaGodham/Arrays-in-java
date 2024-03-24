public class MaxElementInArray {

    // Function to find the maximum element in an array
    public static int findMax(int[] arr) {
        // Initialize max to the minimum possible integer value
        int max = Integer.MIN_VALUE;
        
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than max, update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 1, 9, 2, 6}; // Sample array

        // Find the maximum element in the array
        int maxElement = findMax(arr);

        // Print the result
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
