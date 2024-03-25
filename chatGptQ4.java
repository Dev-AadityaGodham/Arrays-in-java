/******************************************************************************
Implement a function that takes two arrays as input and returns a new array containing elements that are present in both arrays.
*******************************************************************************/

public class Main
{   
    public static void sameEl(int arr1[],int arr2[]){
        int maxSize = Math.min(arr1.length, arr2.length);
        int newArr[] = new int[maxSize];
        int index = 0;
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    newArr[index] = arr1[i];    
                    index++;
                }
            }
            
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]);
        }
    }
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {4,5};
		sameEl(arr1,arr2);
		
	}
}
