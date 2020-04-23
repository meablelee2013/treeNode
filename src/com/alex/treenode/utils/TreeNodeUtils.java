package com.alex.treenode.utils;

import com.alex.treenode.model.TreeNode;

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

    public static TreeNode createTreeNode(int[] values) {
        TreeNode treeNode = null;
        for (int value : values) {
            treeNode = createTree(treeNode, value);
        }
        return treeNode;
    }

    /**
     * 动态创建二叉查找树
     *
     * @param value
     */

    private static TreeNode createTree(TreeNode treeNode, int value) {

        if (treeNode == null) {
            treeNode = new TreeNode(value);
            treeNode.setValue(value);
        } else {
            if (value <= treeNode.getValue()) {
                treeNode.setLeftNode(createTree(treeNode.getLeftNode(), value));
            } else {
                treeNode.setRightNode(createTree(treeNode.getRightNode(), value));
            }
        }
        return treeNode;
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
