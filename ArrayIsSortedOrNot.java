/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	 
	    
        Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[5];
        
        for (int i=0;i<numbers.length;i++ ){
            numbers[i]=sc.nextInt();
        }
        
        boolean SortedOrNot = true;
        for(int i=1;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                SortedOrNot = false;
            }
        }
        if(SortedOrNot){
            System.out.println("Array is sorted");
            
        }else{
            System.out.println("Array is not sorted");
        }
            
        
            
        
        
        
    }
}
