package com.upwork.listsample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        
        printList(linkedList);
        
        linkedList.removeTail();
        printList(linkedList);
        
        linkedList.removeTail();
        printList(linkedList);
        
        linkedList.removeAll();
        System.out.println("Size = " + linkedList.size());
    }
    
    private static void printList(SinglyLinkedList linkedList) {
    	for(int i=0; i< linkedList.size(); i++) {
        	System.out.print(linkedList.get(i) + ", ");
        }
    	System.out.println();
    	System.out.println();
    }
}
