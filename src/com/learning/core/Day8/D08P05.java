package com.learning.core.Day8;
import java.util.LinkedList;
import java.util.Queue;

public class D08P05 {
	public static void Odd(Queue<Integer> queue)
	{
		System.out.print("Odd Queue: ");
		for (int num : queue)
		{
			if (num % 2 == 1)
			{
				System.out.print(num + " ");
			}
		}
		System.out.println();
		
	}
	
		public static void P4(Queue<Integer> queue)
		{
			System.out.print("Even Queue: ");
			for (int num : queue)
			{
				if (num % 2 == 0)
				{
					System.out.print(num + " ");
				}
			}
			System.out.println();
			
		}
		
	public static void main(String[] args)
	{
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(2);
		queue.offer(7);
		queue.offer(9);
		queue.offer(4);
		queue.offer(6);
		queue.offer(5);
		queue.offer(10);
		//System.out.println("Original Queue : "+queue);
		P4(queue);
		Odd(queue);
	}
	
		
	
}

