package com.crack.code;
public class Excercise1 {

	
	public static void main(String args[]) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		//addEx(arr);
		//add(arr);
		add1(arr);
		add2(arr,arr);
	}
	
	
	
	static void addEx(int arr[])
	{
		 //Ex1  //0(N)+0(N);
		int sum=0;
		int product=0;
		for(int i=0;i<arr.length;i++) {
			sum+=sum+arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			product*=product+arr[i];
		}
		System.out.println(sum);
		System.out.println(product);
	}
	   //Ex2
	static void add(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i]+""+arr[j]); //0(N)*0(N);
			}
		}
	}
	
	
	   //Ex3
	static void add1(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {//0(N)+0(N-1)+0(N-2)+0(N-3);   O(N)^2
				System.out.print(i+""+j);
		}
			System.out.println("");
	}
}
	
	
	   //Ex3
	static void add2(int arra[],int arrb[]) {
		for(int i=0;i<arra.length;i++) {
			for(int j=0;j<arrb.length;j++) {  //O(A*B) it is not 0(n^2);
				System.out.print(i+""+j);
		}
			System.out.println("");
	}
}
	
	
}
