package epam;

import java.util.ArrayList;
import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Numbers : ");
		n=sc.nextInt();
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++)	arr.add(sc.nextInt());
		
		Double avg=arr.stream().mapToInt(val -> val).average().getAsDouble();
		System.out.println("Average is : "+avg);
		sc.close();
	}

}
