// Write a function taking a non-empty array of integers and int representing target sum
// return array of values that exist in array adding up to targetSum
// Completed 12/1/2021 @ 2:30 AM
// FIRST PROBLEM COMPLETED ON ALGOEXPERT! :)

import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		int[] output = new int[2];
		
		for(int i = 0; i < array.length-1; i++)
		{
			for(int x = i; x < array.length; x++)
			{
				if(array[i] + array[x] == targetSum && x != i)
				{
					output[0] = array[i];
					output[1] = array[x];
					return output;
				}
			}
			/*
			if(array[i] + array[i+1] == targetSum)
			{
				output[0] = array[i];
				output[1] = array[i+1];
				return output;
			}
			*/
		}
		
    return new int[0];
  }
}
