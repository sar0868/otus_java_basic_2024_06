package ru.otus.java.basic.safarov.homework11;

public class TreeNode {
    private Node root;

    public TreeNode() {
        this.root = null;
    }

    public void insert(int x) {
        root = doInsert(root, x);
    }

    private Node doInsert(Node node, int x) {
        if (node == null) {
            return new Node(x);
        }
        if (x < node.getValue()) {
            node.setLeft(doInsert(node.getLeft(), x));
        } else if (x > node.getValue()) {
            node.setRight(doInsert(node.getRight(), x));
        }
        return node;
    }
}
