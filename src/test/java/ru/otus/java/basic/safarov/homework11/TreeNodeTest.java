package ru.otus.java.basic.safarov.homework11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void insert() {
        TreeNode treeNode = new TreeNode();
        treeNode.insert(3);
        treeNode.insert(5);
        treeNode.insert(2);
    }
}