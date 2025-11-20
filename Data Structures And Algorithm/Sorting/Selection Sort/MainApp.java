package com.sort.selectionsort;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array: ");
		size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter "+size+ " Elements: ");
		
        for(int i=0; i< arr.length; i++) {
        	
        	System.out.println("arr["+ i+"]");
        	arr[i]= sc.nextInt();	
        }
        
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}
        
        selectionSort(arr);
        System.out.println();
        
        
        System.out.println("After Selection Sort");
        for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}     

	}
	
	public static void selectionSort(int[] arr) {
		

		for(int i=0; i< arr.length-1; i++) {
			int minIndex = i; // this is the length of sorted area
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j] < arr[minIndex]) {
					
					minIndex =j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
			
		}
	}

}
