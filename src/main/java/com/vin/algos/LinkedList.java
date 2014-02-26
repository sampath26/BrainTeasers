package com.vin.algos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LinkedList {
	
	private static final Logger logger = Logger.getLogger(LinkedList.class.toString());
	
	private Node firstNode;
	
	private Node lastNode;
	
	private int size = 0;
	
	public LinkedList()
	{
		this.firstNode = new Node();
		this.lastNode = this.firstNode;
		this.size = 0;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public void add(Object data)
	{
		if(this.firstNode.getData() == null)
		{
			this.firstNode.setData(data);
			this.lastNode = this.firstNode;
		}
		else {
			Node node = new Node();
			node.setData(data);	
			this.lastNode.setNext(node);
			this.lastNode = node;
		}
		
		logger.info("Adding node to the linkedList");
		size++;
		
	}
	
	public void insertAtPosition(Object data, int pos)
	{
		if(pos == 0 || pos > size)
		{
			logger.info("Invalid Position");
			throw new RuntimeException("Invalid Position");
		}
		int index = pos - 1;
		Node node = new Node();
		node.setData(data);
		int counter = 0;
		Node currentNode = this.firstNode;
		if(index == 0)
		{
			node.setNext(this.firstNode);
			this.firstNode = node;
			size++;
			return;
		}
		
		while(true)
		{
			if(counter == index - 1)
			{
				logger.info("Inserting at position " + pos);
				node.setNext(currentNode.getNext());
				currentNode.setNext(node);
				size++;
				break;
			}
			currentNode = currentNode.getNext();
			counter++;
		}
		
	}
	
	public boolean deleteFromStart(int pos)
	{
		if(size == 0 || pos > size)
		{
			throw new RuntimeException("Invalid position");
		}
		int index = pos - 1;
		return deleteAtIndex(index);
	}
	
	public boolean deleteFromEnd(int pos)
	{
		if(size == 0 || pos > size)
		{
			throw new RuntimeException("Invalid position");
		}
		int index = size - pos;
		return deleteAtIndex(index);
	}
	
	private boolean deleteAtIndex(int index)
	{
		boolean isDeleted = false;
		
		if(index == 0)
		{
			this.firstNode = this.firstNode.getNext();
			return true;
		}
		int counter = 0;
		Node currentNode = firstNode;
		
		
		while(true)
		{
			if(counter == (index-1))
			{
				currentNode.setNext(currentNode.getNext().getNext());
				isDeleted = true;
				break;
			}
			currentNode = currentNode.getNext();
			counter++;
		}
		return isDeleted;
		
	}
	
	public void display()
	{
		StringBuilder builder = new StringBuilder();
		Node currentNode = firstNode;
		Node prevNode = null;
		
		
		while(true)
		{
			builder.append((String)currentNode.getData());
			currentNode = currentNode.getNext();
			if(currentNode != null)
			{
				builder.append("-->");
			}
			else {
				break;
			}
		}
		
		System.out.println(builder.toString());
		
	}
	
	private class Node{
		
		private Object data;
		
		private Node next;

		public Object getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		
		
	}

}
