package com.alex.treenode.utils;

import com.alex.treenode.model.TreeNode;
import com.alex.treenode.model.TreeRoot;

public class TreeNodeUtils {

    /**
     * 先序遍历
     *
     * @param rootTreeNode 根节点
     */
    public static void preTraverseTree(TreeNode rootTreeNode) {
        if (rootTreeNode != null) {
            //访问根节点
            System.out.println(rootTreeNode.getValue());
            //访问左节点
            preTraverseTree(rootTreeNode.getLeftNode());
            //访问右节点
            preTraverseTree(rootTreeNode.getRightNode());
        }
    }

    /**
     * 中序遍历
     *
     * @param rootTreeNode 根节点
     */
    public static void inTraverseTree(TreeNode rootTreeNode) {
        if (rootTreeNode != null) {
            //访问左节点
            inTraverseTree(rootTreeNode.getLeftNode());
            //访问根节点
            System.out.println(rootTreeNode.getValue());
            //访问右节点
            inTraverseTree(rootTreeNode.getRightNode());
        }
    }

    /**
     * 后序遍历
     *
     * @param rootTreeNode 根节点
     */
    public static void postTraverseTree(TreeNode rootTreeNode) {
        if (rootTreeNode != null) {
            //访问左节点
            postTraverseTree(rootTreeNode.getLeftNode());
            //访问右节点
            postTraverseTree(rootTreeNode.getRightNode());
            //访问根节点
            System.out.println(rootTreeNode.getValue());
        }
    }

    /**
     * 动态创建二叉查找树
     *
     * @param treeRoot
     * @param value
     */

    public static void createTree(TreeRoot treeRoot, int value) {

        if (treeRoot == null) return;
        if (treeRoot.getTreeNode() == null) {
            TreeNode treeNode = new TreeNode(value);
            treeRoot.setTreeNode(treeNode);
        } else {
            TreeNode tempRoot = treeRoot.getTreeNode();
            while (tempRoot != null) {
                //当前值大于根值，往右边走
                if (value > tempRoot.getValue()) {
                    //右边没有树根，那就直接插入
                    if (tempRoot.getRightNode() == null) {
                        tempRoot.setRightNode(new TreeNode(value));
                        return;
                    } else {
                        //如果右边有树根，到右边的树根去
                        tempRoot = tempRoot.getRightNode();
                    }
                } else {//左没有树根，那就直接插入
                    if (tempRoot.getLeftNode() == null) {
                        tempRoot.setLeftNode(new TreeNode(value));
                        return;
                    } else {
                        tempRoot = tempRoot.getLeftNode();
                    }
                }
            }
        }
    }

    /**
     * 找出树的深度
     *
     * @param treeNode
     * @return
     */

    public static int getHeight(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        } else {
            int leftHeight = getHeight(treeNode.getLeftNode());
            int rightHeight = getHeight(treeNode.getRightNode());
            int max = leftHeight;
            if (rightHeight > max) {
                max = rightHeight;
            }
            return max + 1;
        }
    }

    /**
     * 找出树的最大值
     *
     * @param treeNode
     * @return
     */

    public static int getMax(TreeNode treeNode) {
        if (treeNode == null) {
            return -1;
        } else {

            int left = getMax(treeNode.getLeftNode());

            int right = getMax(treeNode.getRightNode());

            int currentRootValue = treeNode.getValue();

            int max = left;

            if (right > max) {
                max = right;
            }
            if (currentRootValue > max) {
                max = currentRootValue;
            }
            return max;
        }
    }
}
