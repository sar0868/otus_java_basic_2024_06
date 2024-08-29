package ru.otus.java.basic.safarov.homework11;

import org.junit.jupiter.api.Test;

class TreeNodeTest {

    @Test
    void insert() {
        TreeNode<String> treeNode = new TreeNode<>();
        treeNode.insert("t");
        treeNode.insert("b");
        treeNode.insert("d");
        treeNode.insert("e");
        treeNode.insert("a");


        System.out.println(treeNode);
    }
}