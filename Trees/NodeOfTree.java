package Trees;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(6);
        Node d = new Node(9);
        Node e = new Node(5);
        Node f = new Node(7);
        Node g = new Node(8);

        a.left = b; a.right = c;
        b.left = d; c.right = e;
        d.left = f; d.right = g;


        // System.out.println(a.left.left.val);
        // System.out.println(a.left.right);

        display(a);
        System.out.println();
        System.out.println(sum(a)+" ");
        System.out.println(max(a));
        System.out.println(size(a));
        System.out.println(levels(a));
    }

    private static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int levels(Node root) {
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    private static int size(Node root) {
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val, b = max(root.left), c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }

    private static void display(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
}
