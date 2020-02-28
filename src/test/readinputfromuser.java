package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class readinputfromuser {
	public static void main(String[] args) {
		Scanner   s = new Scanner(System.in);
		ArrayList<Integer> s1=new ArrayList<Integer>();
		     System.out.println("Enter the length of the array:");
		     int length = s.nextInt();
		     int [] myArray = new int[length];
		     System.out.println("Enter the elements of the array:");

		     for(int i=0; i<length; i++ ) {
		        myArray[i] = s.nextInt();
		     
		     }
		   

		     System.out.println(Arrays.toString(myArray));
		     
		  }
		}