package com.alex.linkednode.utils;

import com.alex.linkednode.model.LinkedNode;

public class NodeUtils<E> {

    private NodeUtils() {
    }

    static volatile NodeUtils nodeUtils;

    public static NodeUtils getDefault() {
        if (nodeUtils == null) {
            synchronized (NodeUtils.class) {
                if (nodeUtils == null) {
                    nodeUtils = new NodeUtils();
                }
            }
        }
        return nodeUtils;
    }

    /**
     * 删除节点
     *
     * @param linkedNode
     */
    public void deleteNode(LinkedNode linkedNode) {
        if (linkedNode == null) return;
        if (linkedNode.next == null) {
            linkedNode = null;
            return;
        }
        //删除下一个节点
        linkedNode.val = linkedNode.next.val;
        linkedNode.next = linkedNode.next.next;
    }

    public static LinkedNode reverse(LinkedNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedNode pre = null;
        LinkedNode cur = head;
        while (cur != null) {
            LinkedNode next = cur.next;//记录下一个节点
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 添加节点
     *
     * @param head
     * @param value
     */
    public void add(LinkedNode head, E value) {
        LinkedNode newNode = new LinkedNode();
        newNode.val = value;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            LinkedNode<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    /**
     * 找到链表的中间节点
     * fast 每一步的步长是low的一倍，当fast刚好走完全程的时候，slow刚好位于中间节点
     *
     * @param head
     * @return
     */
    public LinkedNode findMiddle(LinkedNode head) {
        if (head == null) {
            return null;
        }
        LinkedNode fast = head;
        LinkedNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean hasCycle(LinkedNode head) {
        LinkedNode fast = head;
        LinkedNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}
