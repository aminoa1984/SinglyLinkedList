package singlylinkedlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noua Amine
 */
public class SinglyLinkedList {
     
    private Item head;
    
    /*1. Append an element into the linkedlist*/
     
    public void appendElement(int d) {
	head = new Item(d, head);
    }
    
    /*2. Remove the tail element from a linkedlist*/
    
    public void removeTail() {
        
	if (head == null)
            return;
        
	Item temp = head, pr = null;

	while (temp != null && temp.getNext() != null) {
            pr = temp;
            temp = temp.getNext();
	}
	pr.setNext(null);
        
    }
    
    /*3. Remove all element in the linkedlist that is great than a target value*/
    
    public void removeAllGreaterValue(int value) {
        
	if (head == null)
            return;
        
        if (head.getD() > value)
            head = head.getNext();
        
	Item current = head;

	while (current != null && (current.getNext() != null)) {
            if (current.getNext().getD() > value) {
		current.setNext(current.getNext().getNext());
            } else {
                    current = current.getNext();
            }
	}
    }
    /* For printing the linkedlist */
    public String toString() {
		StringBuffer result = new StringBuffer();
                if(this.head == null) result.append("List empty");
                else
		for (Item x=this.head; x!=null; x=x.getNext())
			result.append(x.getD() + " ");

		return result.toString();
	}
    
}
