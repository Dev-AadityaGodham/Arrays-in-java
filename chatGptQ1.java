/******************************************************************************
Question: Given an array of integers, write a function to return the sum of all the elements in the array.

For example:

Input: [1, 2, 3, 4, 5]
Output: 15 (1 + 2 + 3 + 4 + 5 = 15)
*******************************************************************************/

public class Main
{   
    public static int sum(int arr[]){
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            count += arr[i];
        }
        return count;
    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.print(sum(arr));
		
	}
}
