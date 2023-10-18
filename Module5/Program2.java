package Module5;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class Program2 {
    Node root;

    Program2(int key) {
        root = new Node(key);
    }

    Program2() {
        root = null;
    }

    // Traverse Inorder
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.key);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }

    // Traverse Preorder
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public static void main(String[] args) {
        Program2 tree = new Program2();
        tree.root = new Node(10);
        tree.root.left = new Node(11);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(13);
        System.out.print("Pre order Traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nIn order Traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nPost order Traversal: ");
        tree.traversePostOrder(tree.root);
    }
}