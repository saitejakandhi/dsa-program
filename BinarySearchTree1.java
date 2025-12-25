class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST2 {
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value > root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}
class BinarySearchTree1 {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(11);
        tree.insert(6);
        tree.insert(8);
        tree.insert(19);
        tree.insert(4);
        tree.insert(10);
        tree.insert(5);
        tree.insert(17);
        tree.insert(43);
        tree.insert(49);
        tree.insert(31);
        System.out.println("Inorder traversal of BST:");
        tree.inorder();
    }
}
