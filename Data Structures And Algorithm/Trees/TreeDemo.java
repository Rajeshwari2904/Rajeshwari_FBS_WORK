package com.tree;

public class TreeDemo {
	
	 Node root;
	
	public void insert(String value) {
		
		root = insertValue(root, value);
		
	}
	
	public Node insertValue(Node root, String value) {
		
		if(root == null) {
			
			root = new Node(value);
			return root;
		}
		if(value.compareTo(root.data) > 0) {
			
			root.right = insertValue(root.right, value);
		}
		else
			if(value.compareTo(root.data) < 0) {
				
				root.left = insertValue(root.left, value);	
			}
		return root;
	}
	
	public void display() {
		
		System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();
	}
	
	private void inorder(Node root) {
        if (root != null) {
        	
        	inorder(root.left);                      // Left
            System.out.print(root.data + " ");       //Node
            inorder(root.right);                      //Right
        	
        }
           

                           
    }

}
