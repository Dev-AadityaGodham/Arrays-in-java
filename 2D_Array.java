/******************************************************************************
			2DArray
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the size of row :");
		int row =sc.nextInt();
		System.out.println("Enter the size of Col :");
		int col =sc.nextInt();
		int[][]numbers = new int[row][col];
		System.out.println("Which number you want to find :");
		int x = sc.nextInt();
		
		
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        System.out.println("enter the "+i+"th and "+j+"th element");
		        numbers[i][j]=sc.nextInt();
		    }
		}
		System.out.println("The Array is:");
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		       System.out.print(numbers[i][j]);
		    }
		    System.out.println();
		}
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		       if(numbers[i][j]==x){
		           System.out.println("the "+x+" found at ( "+i+" , "+j+" ) Position");
		       }
		    }
		    System.out.println();
		}
		
	}
}
