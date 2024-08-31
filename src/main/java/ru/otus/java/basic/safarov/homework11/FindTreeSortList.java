package ru.otus.java.basic.safarov.homework11;

import java.util.ArrayList;
import java.util.List;

public class FindTreeSortList<T extends Comparable<T>> implements SearchTree<T> {
    private final TreeNode<T> treeNode;

    public FindTreeSortList(List<T> list) {
        this.treeNode = new TreeNode<>();
        for (T el : list) {
            treeNode.insert(el);
        }
    }

    @Override
    public T find(T element) {
        if (search(treeNode.getRoot(), element)) {
            return element;
        }
        return null;
    }

    private boolean search(Node<T> node, T element) {
        if (node != null) {
            if (node.getValue() == element) {
                return true;
            } else if (node.getValue().compareTo(element) > 0) {
                return search(node.getLeft(), element);
            } else {
                return search(node.getRight(), element);
            }
        }
        return false;
    }

    @Override
    public List<T> getSortedList() {
        List<T> result = new ArrayList<>();
        treeToList(treeNode.getRoot(), result);
        return result;
    }

    private void treeToList(Node<T> node, List<T> list) {
        if (node != null) {
            if (node.getLeft() != null) {
                treeToList(node.getLeft(), list);
            }
            list.add(node.getValue());
            if (node.getLeft() != null) {
                treeToList(node.getRight(), list);
            }
        }
    }
}
