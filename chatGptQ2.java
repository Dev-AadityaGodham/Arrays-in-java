/******************************************************************************
Write a function to find the maximum element in an array of integers.
*******************************************************************************/

public class Main
{   
    public static int maxInt(int arr[]){
        int maxInt=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxInt){
                maxInt = arr[i];
            }
        }
        return maxInt;
    }
	public static void main(String[] args) {
		int arr[] = {1,8,7,4,8};
		System.out.print(maxInt(arr));
		
	}
}
