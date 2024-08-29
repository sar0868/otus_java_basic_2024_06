package ru.otus.java.basic.safarov.homework11;

public class TreeNode<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public TreeNode() {
        this.root = null;
        this.size = 0;
    }

    public void insert(T x) {
       doInsert(root, x);
    }

    private void doInsert(Node<T> node, T x) {
        if (node == null) {
            root = new Node<>(x);
            size++;
            return;
        }
        Node<T> new_node = new Node<>(x);
        if (node.compareTo(new_node) < 0) {
            if (node.getRight() == null){
                node.setRight(new_node);
                new_node.setParent(node);
                size++;
            } else {
                doInsert(node.getRight(), x);
            }
        } else {
            if (node.getLeft() == null){
                node.setLeft(new_node);
                new_node.setParent(node);
                size++;
            } else {
                doInsert(node.getLeft(), x);
            }
        }
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return root.toString();
    }

}
