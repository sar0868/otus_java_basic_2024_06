package ru.otus.java.basic.safarov.homework11;

import java.util.Objects;

public class Node<T> implements Comparable<Node<T>>{
    private final T value;
    private Node<T> left;
    private Node<T> right;
//    private Node parent;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
//        this.parent = parent;
    }
//    public Node(T value) {
//        this(value, null);
//    }

    public T getValue() {
        return value;
    }


    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

//    public Node getParent() {
//        return parent;
//    }
//
//    public void setParent(Node parent) {
//        this.parent = parent;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return  "Node:{ value=" + value +
                ", left=" + left +
                ", right=" + right +"}";
    }

    @Override
    public int compareTo(Node t) {
        return Integer.compare((Integer) value, (Integer) t.getValue());
    }
}
