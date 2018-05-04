package com.upwork.listsample;

public class SinglyLinkedList 
{

	class Node
	{
		private Integer data;
		private Node next;

		Node(Integer data)
		{
			this.data = data;
		}
	}

	private Node head;
	private int size = 0;

	public void append(Integer data)
	{
		if (data == null)
		{
			return;
		}

		if (head == null)
		{
			head = new Node(data);
			size++;
			return;
		}

		Node current = head;
		while (current.next != null)
		{
			current = current.next;
		}

		current.next = new Node(data);
		size++;
	}

	public void removeTail()
	{
		if (head == null)
		{
			return;
		}

		if (head.next == null)
		{
			head = null;
			size = 0;
			return;
		}

		Node current = head;
		Node prev = null;
		while (current.next != null)
		{
			prev = current;
			current = current.next;
		}

		prev.next = null;
		size--;
	}

	public void removeAll()
	{
		while(size > 0) {
			removeTail();
		}
	}

	public int size() {
		return size;
	}
	
	public Integer get(int index) {
		if(index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		int i = 0;
		Node current = head;
		while(i<index) {
			current = current.next;
			++i;
		}
		
		return current.data;
	}
}
