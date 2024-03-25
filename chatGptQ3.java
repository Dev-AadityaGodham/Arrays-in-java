/******************************************************************************
Given an array of integers, write a function to find the average of all the elements in the array.
*******************************************************************************/

public class Main
{   
    public static int AvgInt(int arr[]){
        int sum=0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.print(AvgInt(arr));
		
	}
}
