// https://www.youtube.com/watch?v=VCTP81Ij-EM&index=2&list=PLamzFoFxwoNjPfxzaWqs7cZGsPYy0x_gI
/*
example: a = [1, 2, 3, 4, 5, 6, 7, 8, 9]
b = [4, 7, 9, 11, 21, 31]
*/

class balancedBST_from_sorted_array {
    static class Node {
        Node left;
        Node right;
        int data;
        Node(int val) {
            data = val;
            right = left = null;
        }
    }

    //static Node head = null;
    static Node createBST(int[] list, int start, int end) {
        if(start > end)
            return null;

        int mid = (start + end)/2;
        int data = list[mid];
        Node newNode = new Node(data);
        // return newNode;
        newNode.left = createBST(list, start, mid-1);
        newNode.right = createBST(list, mid+1, end);
        
        return newNode;
    }
    static void displayBST(Node root) {
        if(root.left != null)
            displayBST(root.left);
        System.out.print(root.data + " ");
        if(root.right != null)
            displayBST(root.right);
    }

    public static void main(String[] argh) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = list.length;
        Node root = createBST(list, 0, l-1);
        displayBST(root);
        System.out.println("\n");
    }
}