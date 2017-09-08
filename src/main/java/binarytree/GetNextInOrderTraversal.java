package binarytree;

/**
 * Created by zhujia on 2017/9/4.
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * <p>
 * 我们可发现分成两大类：1、有右子树的，那么下个结点就是右子树最左边的点；
 * 2、没有右子树的，也可以分成两类，
 * a)是父节点左孩子 ，那么父节点就是下一个节点 ；
 * b)是父节点的右孩子找他的父节点的父节点的父节点...直到当前结点是其父节点的左孩子位置。如果没有，那么他就是尾节点。
 */
public class GetNextInOrderTraversal {

    TreeLinkNode GetNext(TreeLinkNode node) {
        if (node == null) return null;
        if (node.right != null) { //如果有右子树，则找右子树的最左节点
            node = node.right;
            while (node.left != null) node = node.left;
            return node;
        }
        while (node.next != null) { //没右子树，则找第一个当前节点是父节点左孩子的节点
            if (node.next.left == node) return node.next;
            node = node.next;
        }
        return null;//退到了根节点仍没找到，则返回null
    }


}
