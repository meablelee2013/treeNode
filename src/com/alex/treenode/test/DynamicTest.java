package com.alex.treenode.test;


import com.alex.treenode.model.TreeNode;
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
 * 树的深度
 * 树的深度为 = 4
 */



public class DynamicTest {

    public static void main(String[] args) {

        int[] arrays = {2, 3, 1, 4, 5};

        //动态创建二叉查找树
        TreeNode root = TreeNodeUtils.createTreeNode(arrays);

        //先序遍历
        System.out.println("先序遍历");
        TreeNodeUtils.preTraverseTree(root);

        System.out.println("中序遍历");
        TreeNodeUtils.inTraverseTree(root);

        System.out.println("后序遍历");
        TreeNodeUtils.postTraverseTree(root);

        System.out.println("树的深度");
        System.out.println("树的深度为 = " + TreeNodeUtils.getHeight(root));

        System.out.println("树的最大值");
        System.out.println("树的最大值 = " + TreeNodeUtils.getMax(root));
    }


}
