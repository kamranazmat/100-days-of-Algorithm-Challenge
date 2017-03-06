void LevelOrder(Node root)
{
    Queue<Node> bst = new LinkedList();

    bst.add(root);
    while (!bst.isEmpty()) {
        Node temp = bst.poll();
        System.out.print(temp.data + " ");
        if(temp.left != null)
            bst.add(temp.left);
        if(temp.right != null)
            bst.add(temp.right);        
    }
}
