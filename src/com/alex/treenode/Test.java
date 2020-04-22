package com.alex.treenode;

public class Test {

    public static void main(String[] args) {
        TreeNode rootTreeNode = initTree();
        System.out.println("前序遍历");
        preTraverseTree(rootTreeNode);
        System.out.println("中序遍历");
        inTraverseTree(rootTreeNode);
        System.out.println("后序遍历");
        postTraverseTree(rootTreeNode);
    }

    private static TreeNode initTree() {
        TreeNode rootTreeNode = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(35);
        //根节点的左右孩子
        rootTreeNode.setLeftNode(treeNode2);
        rootTreeNode.setRightNode(treeNode3);
        //20节点的左右孩子
        treeNode3.setLeftNode(treeNode4);
        treeNode3.setRightNode(treeNode5);
        return rootTreeNode;
    }

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
     */
    public static void dynamicCreateBinarySearchTree(){

    }

}
