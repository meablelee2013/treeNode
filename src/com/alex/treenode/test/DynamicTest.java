package com.alex.treenode.test;


import com.alex.treenode.model.TreeRoot;
import com.alex.treenode.utils.TreeNodeUtils;

/**
 *
 *                  2
 *                /  \
 *               1    3
 *                    \
 *                     4
 *                     \
 *                     5
 *
 * 先序遍历
 * 2
 * 1
 * 3
 * 4
 * 5
 * 中序遍历
 * 1
 * 2
 * 3
 * 4
 * 5
 * 后序遍历
 * 1
 * 5
 * 4
 * 3
 * 2
 *
 */



public class DynamicTest {

    public static void main(String[] args) {

        int[] arrays = {2, 3, 1, 4, 5};

        TreeRoot root = new TreeRoot();
        //动态创建二叉查找树
        for (int value : arrays) {
            TreeNodeUtils.createTree(root, value);
        }

        //先序遍历
        System.out.println("先序遍历");
        TreeNodeUtils.preTraverseTree(root.getTreeNode());

        System.out.println("中序遍历");
        TreeNodeUtils.inTraverseTree(root.getTreeNode());

        System.out.println("后序遍历");
        TreeNodeUtils.postTraverseTree(root.getTreeNode());
    }


}
