package bst;

public class dll {
	public class node {
		int data;
		node next;
		node prev;
		node(int d) { this.data = d; }

	}

	node head;

	public void insert(int data){
		node n = new node(data);
		if(head==null) {
			head=n;
		}
		else {
			node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
		}
	}

	public void delete(int data){
		if(head.data==data) {
			head.next.prev=null;
			head=head.next;
			return;
		}
		node temp=head;
		while(temp!=null && temp.data!=data) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Not found");
			return;
		}
		if(temp.next==null) {
			temp.prev.next=null;
			return;
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
	}
	
	public void traverse() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	

    public static void main(String[] args){
    	dll d1 = new dll();
    	d1.insert(5);
    	d1.insert(6);
    	d1.insert(7);
    	d1.insert(8);
    	d1.insert(9);
    	d1.insert(10);
    	d1.traverse();
    	d1.delete(5);
    	d1.traverse();
    	d1.delete(7);
    	d1.traverse();
    	d1.delete(10);
    	d1.traverse();
    }
}
