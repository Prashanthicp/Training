package com.cashapona.collections.queue.jun09;

import java.util.PriorityQueue;

public class CreatePriorityQueueStringExample {

	public static void main(String[] args) {
		// Create a Priority Queue
		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

		// Add items to a Priority Queue (ENQUEUE)
		namePriorityQueue.add("Prash");
		namePriorityQueue.add("Sravs");
		namePriorityQueue.add("Latha");
		namePriorityQueue.add("Anuradha");
		namePriorityQueue.add("Yogitha");
		namePriorityQueue.add("Neha");

		// Remove items from the Priority Queue (DEQUEUE)
		while (!namePriorityQueue.isEmpty()) {
			System.out.println(namePriorityQueue.remove());
		}

	}
}