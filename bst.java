package bst;

public class bst{
	public class node{
		int data;
		node left;
		node right;
	}
	node root;
	
	public void insert(int data) {
		root = inserting(data,root);
	}
	
	public node inserting(int data, node root){
		if(root==null){
			root=new node();
			root.data=data;
			return root;
		}
		else{
			if(root.data>data)
				root.left = inserting(data,root.left);
			else
				root.right = inserting(data,root.right);
		}	
		return root;
	}
	public void preorder(node n){
		if(n==null)
			return;
		System.out.print(n.data+" ");
		preorder(n.left);
		preorder(n.right);
	}
	public void inorder(node n){
		if(n==null)
			return;
		inorder(n.left);
		System.out.print(n.data+" ");
		inorder(n.right);
	}
	public void postorder(node n){
		if(n==null)
			return;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data+" ");
	}
	

	public static void main(String[] args){
		bst b1 = new bst();
		b1.insert(60);
		b1.insert(20);
		b1.insert(10);
		b1.insert(30);
		b1.insert(40);
		b1.insert(50);
		b1.preorder(b1.root);
		System.out.println();
		b1.postorder(b1.root);
		System.out.println();
		b1.inorder(b1.root);
	}

}	

					
			