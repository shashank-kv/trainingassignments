public class stack{
	
	public class node {
		int data;
		node next;
		node(int d) { this.data = d; }

	}

	node top;

	public void push(data){
		node n = new node(data);
		if(top==null){
			top=n;
		}
		else{
			node temp=top;
			top=n;
			n.next=temp;
		}
	}

	public int pop(){
		int popped = Integer.MIN_VALUE;
		if(top==null){
			System.out.println("Stack is empty");
		}
		else{
			popped=top.data;
			top=top.next;
		}
		return popped;
	}
	public int peek(){
		int peek = Integer.MIN_VALUE;
		if(top==null){
			System.out.println("Stack is empty");
		}
		else{
			peek=top.data;
		}
		return peek;
	}

    public static void main(String[] args){
	stack s1 = new stack();
    	s1.push(20);
    	s1.push(22);
    	s1.push(90);
    	
    	System.out.println(s1.pop());	
    	System.out.println(s1.peek());	
    }
}
	
		