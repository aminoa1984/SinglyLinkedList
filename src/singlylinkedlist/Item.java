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
public class Item {
    
    private int d;
    private Item next;

    public Item(int d, Item next) {
	this.d = d;
	this.next = next;
    }

    public int getD() {
	return d;
    }

    public Item getNext() {
	return next;
    }

    public void setNext(Item next) {
	this.next = next;
    }
    
}
