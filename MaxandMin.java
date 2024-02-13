/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	  int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
	    
        Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[5];
        
        for (int i=0;i<numbers.length;i++ ){
            numbers[i]=sc.nextInt();
        }
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("the max number is"+ max);
        System.out.println("the min number is"+ min);
        
    }
}
