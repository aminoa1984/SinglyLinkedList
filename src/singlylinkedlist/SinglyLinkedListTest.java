/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author Noua Amine
 */
public class SinglyLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.print("Before append any elements into the linkedlist: ");
	System.out.println(list);
        list.appendElement(9);
	list.appendElement(6);
	list.appendElement(4);
	list.appendElement(5);
	list.appendElement(1);
	list.appendElement(3);
	list.appendElement(2);
        System.out.print("After append many elements into the linkedlist: ");
	System.out.println(list);
        
        System.out.print("Before remove the tail element: ");
	System.out.println(list);
	list.removeTail();
	System.out.print("After remove the tail element: ");
	System.out.println(list);
        
        int r = 2;
	System.out.print("Before remove all elements greater than the target value " + r + ": ");
	System.out.println(list);
	list.removeAllGreaterValue(r);
	System.out.print("After remove all elements greater than the target value " + r + ": ");
	System.out.println(list);
    }
    
}
