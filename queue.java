public class queue{
	
	public class node {
		int data;
		node next;
		node(int d) { this.data = d; }

	}

	node first;
	node last;

	public void enqueue(int data){
		node n = new node(data);
		if(first==null){
			first=n;
			last=n;
		}
		else{
			last.next=n;
			last=n;
		}
	}

	public int dequeue(){
		int d = Integer.MIN_VALUE;
		if(first==null){
			System.out.println("Stack is empty");
		}
		else{
			d=first.data;
			first=first.next;
			if(this.first==null)
				this.last=null;
		}
		return d;
	}
	

    public static void main(String[] args){
	queue q1 = new queue();
    	q1.enqueue(34);
	q1.enqueue(54);
	q1.enqueue(74);
    	System.out.println(q1.first.data+" "+q1.last.data);	
	q1.dequeue();
	System.out.println(q1.first.data+" "+q1.last.data);
    	
    }
}
			

		