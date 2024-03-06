/******************************************************************************
array
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,2,3};
	    int newArra[]=new int[arr.length*2];
	    for (int i=0;i<arr.length ;i++ ){
	        newArra[i]=arr[i];
	        newArra[arr.length+i]=arr[i];
	    }
	    for(int i=0;i<newArra.length;i++){
	        System.out.print(newArra[i]);
	    }
	}
}//123123
