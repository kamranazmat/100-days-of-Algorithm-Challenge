 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

// this is not a balance BST
static Node Insert(Node root,int value)
{
    if(root == null) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.left = newNode.right = null;
        return newNode;
    }        
    else if(value > root.data)
        root.right = Insert(root.right, value);
    else
        root.left = Insert(root.left, value);
    return root;
}