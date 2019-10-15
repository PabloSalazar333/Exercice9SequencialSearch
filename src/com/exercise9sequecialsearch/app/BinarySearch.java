package com.exercise9sequecialsearch.app;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Constants declaration
		final int ELEMENTES_ARRAY = 100;
		
		//Variables declarations
		int numberToFind = 0;
		int indexFound = -1;
		int limInf = 0;
		int limSup = ELEMENTES_ARRAY-1;
		int pivotal = (limSup-limInf)/2;
		int temp = 0;
		
		//Array declaration
		int[] miArraycitu = new int[ELEMENTES_ARRAY];
		
		//Object construction
		Random randomNumbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		//Array initialization
		for(int i=0; i<ELEMENTES_ARRAY; i++)
		{
			miArraycitu[i] = randomNumbers.nextInt(101);
		}
		
		//Sorting algorithm
		for(int i=0; i<ELEMENTES_ARRAY;i++)
		{
			for(int j=0; j < i; j++)
			{
				if(miArraycitu[i]<miArraycitu[j])
				{
					temp=miArraycitu[j];
					miArraycitu[j]=miArraycitu[i];
					miArraycitu[i] = temp;
				}
			}
		}
		System.out.println("");
		//Array visualization
				for(int i=0; i<ELEMENTES_ARRAY;i++)
				{
					System.out.print(miArraycitu[i]+" ");
				}
				System.out.println("");
		
		//Ask the user for the number to find
		do
		{
			System.out.print("Input the number to find inside the Array(0-100): ");
			numberToFind = input.nextInt();
			if(numberToFind<0)
			{
				System.out.println("Number must be zero or positive value!!");
			}
			
			
			System.out.println("");
			for(int i=0; i<ELEMENTES_ARRAY; i++) {
				System.out.print(miArraycitu[i]+" ");
			}
			System.out.println("");
			
			//Binary search algorithm
			while(limInf<=limSup)
			{
				pivotal = limInf+(limSup-limInf)/2;
				if(numberToFind==miArraycitu[pivotal])
				{
					indexFound=pivotal;
					break;
				}
				else if(numberToFind>miArraycitu[pivotal])
				{
					limInf = pivotal+1;
				}
				else if(numberToFind<miArraycitu[pivotal])
				{
					limSup=pivotal-1;
				}
			}
			if(indexFound!=1)
			{
				System.out.print("Element found at index: "+indexFound);
			}
			else
			{
				System.out.println("Element not present in the Array!!");
			}
		}while(numberToFind<=0);
		

		
		input.close();
	}

}
