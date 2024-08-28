package ru.otus.java.basic.safarov.homework11;

public class TreeNode<T> {
    private Node<T> root;

    public TreeNode() {
        this.root = null;
    }

    public void insert(T x) {
       doInsert(root, x);
    }

    private void doInsert(Node<T> node, T x) {
        if (node == null) {
            root = new Node<>(x);
            return;
        }
        Node<T> new_node = new Node<>(x);
        if (node.compareTo(new_node) < 0) {
            if (node.getRight() == null){
//                new_node.setParent(node);
                node.setRight(new_node);
            } else {
                doInsert(node.getRight(), x);
            }
        } else if (node.compareTo(new_node) > 0) {
            if (node.getLeft() == null){
//                new_node.setParent(node);
                node.setLeft(new_node);
            } else {
                doInsert(node.getLeft(), x);
            }
        }
    }

    @Override
    public String toString() {
        return root.toString();
    }

    private String printNode(Node<T> node){
        if (node.getLeft() == null){
            return node.toString();
        }
        return "";
    }
}
