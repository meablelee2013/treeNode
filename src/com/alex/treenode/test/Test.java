package com.alex.treenode.test;

import com.alex.treenode.model.TreeNode;
import com.alex.treenode.utils.TreeNodeUtils;

public class Test {

    public static void main(String[] args) {
        TreeNode rootTreeNode = initTree();
        System.out.println("前序遍历");
        TreeNodeUtils.preTraverseTree(rootTreeNode);
        System.out.println("中序遍历");
        TreeNodeUtils.inTraverseTree(rootTreeNode);
        System.out.println("后序遍历");
        TreeNodeUtils.postTraverseTree(rootTreeNode);
    }

    private static TreeNode initTree() {
        TreeNode rootTreeNode = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(35);
        //根节点的左右节点
        rootTreeNode.setLeftNode(treeNode2);
        rootTreeNode.setRightNode(treeNode3);
        //20节点的左右节点
        treeNode3.setLeftNode(treeNode4);
        treeNode3.setRightNode(treeNode5);
        return rootTreeNode;
    }

}
