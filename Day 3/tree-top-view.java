/*
   class Node 
       int data;
       Node left;
       Node right;
*/

static int count = 0;

void top_view(Node root)
{   
    if(root != null && count >= 0) {
        count ++;
        top_view(root.left);        
        System.out.print(root.data + " ");
    }
    count --;
    
    if(root != null && count < 0) {
        root = root.right;
        System.out.print(root.data + " ");
        top_view(root);
    }
}
