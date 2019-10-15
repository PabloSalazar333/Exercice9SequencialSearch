package com.exercise9sequecialsearch.app;

import java.util.Random;
import java.util.Scanner;

public class SequencialNonGreedy 
{

	public static void main(String[] args) 
	{
		//Constants declaration
		final int ELEMENTS_ARRAY = 100;
		
		//Variable declaration
		int numberToFInd = 0;
		int indexFound =-1;
		boolean isFound=false;
		int index=0;
		
		//Array declaration
		int [] vector = new int[ELEMENTS_ARRAY];
		
		//Object construction
		Random numbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			vector[i] = numbers.nextInt(101);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			System.out.println(vector[i]+" ");
		}
		
		System.out.println("");
		do
		{
			
			System.out.println("Input the value to find inside the array: ");
			numberToFInd = input.nextInt();
			if(numberToFInd<0)
			{
				System.out.println("Number must be greater then or equal to 0");
			}
			
		}while(numberToFInd<0);
		
		//First way used cycle While
		while(!isFound==true && index<ELEMENTS_ARRAY)
		{
			if(numberToFInd==vector[index])
			{
				indexFound=index;
				isFound=true;
			}
			index++;
			
		}
		if(indexFound!=-1)
		{
			System.out.println("Element found at index: "+indexFound);
		}
		else
		{
			System.out.println("Element not found!!!");
		}
		
		//Second way used loops For
		/*for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			if(numberToFInd==vector[i])
			{
				indexFound=i;
				break;
			}
		}
		if(indexFound!=-1)
		{
			System.out.println("Element found at index: "+indexFound);
		}
		else
		{
			System.out.println("Element not found!!");
		}*/
		
		input.close();
	}

}
