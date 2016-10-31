/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Oct 2016
 * Takes a number of disks from the user and does towers of hanoi using
 * recursion
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Towers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader r = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(r);
	    
	   int numberOfDisks = 0;
	   
	   try {
		   
		   numberOfDisks = Integer.parseInt(br.readLine());
		   
	   } catch (NumberFormatException e) {
		   
		   System.out.println("Invalid input");
		   
	   } catch (IOException e) {
		
		   System.out.println("Invalid input");
	   }
	   
	   MoveTower(numberOfDisks, 'A' , 'B' , 'C');

	}
	
	public static void MoveTower (int topDisk, char a , char b , char c) {
		
		if (topDisk == 1) {
			
			System.out.println("Move disk 1 from " + a + " to " + c);
			
		} else {
			
			MoveTower (topDisk - 1, a , c , b);
			
			System.out.println("Move disk " + topDisk + " from " + a + " to " + c );
			
			MoveTower(topDisk - 1 , b , a , c);
			
			
			
		}
		
	}

}
