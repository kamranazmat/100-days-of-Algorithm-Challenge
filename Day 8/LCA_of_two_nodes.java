// https://www.youtube.com/watch?v=NBcqBddFbZw&list=PLamzFoFxwoNjPfxzaWqs7cZGsPYy0x_gI

Node getLCA(Node current, Node A, Node B) {
    
    if(current == null)
        return current;
    if(current == A || current == B)
        return current
    
    Node left = getLCA(current.left, A, B);
    Node right = getLCA(current.right, A, B);

    if(left != null && right != null)
        return current;

    if(right == null)
        return left;
    else
        return right;
}