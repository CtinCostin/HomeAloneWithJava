package main.java.com.georgescuconstantin.binaryTreeAlgorithms;

import java.sql.Struct;
import java.util.*;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode {

        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void createBinaryTree() {

        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(1);


        root = a;
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;


        //            a
        //           / \
        //          b   c
        //        /  \    \
        //      d     e    f

    }

    public void breadthFirstTraversalBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> values = new ArrayList<>();
        while (queue.size() > 0) {
            TreeNode current = queue.poll();
            values.add(current.val);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println(values);
    }


    public void sumOfBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        int totalSum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            TreeNode current = queue.poll();
            totalSum += current.val;
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println(totalSum);
    }

    public void depthFirstTraversalBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> result = new ArrayList<>();
        while (stack.size() > 0) {
            TreeNode current = stack.pop();
            result.add(current.val);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }

        }
        System.out.println(result);
    }

    public void depthFirstTraversalBinaryTreeRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        depthFirstTraversalBinaryTreeRecursive(root.left);
        depthFirstTraversalBinaryTreeRecursive(root.right);
    }

    public void treeIncludes(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            TreeNode current = queue.remove();
            if (target == current.val) {
                System.out.println(current.val);
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        //binaryTree.sumOfBinaryTree(binaryTree.root);
        //binaryTree.depthFirstTraversalBinaryTreeRecursive(binaryTree.root);
        // binaryTree.breadthFirstTraversalBinaryTree(binaryTree.root);
        //binaryTree.depthFirstTraversalBinaryTree(binaryTree.root);
        binaryTree.treeIncludes(binaryTree.root, 4);

    }


}
