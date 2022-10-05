import java.util.LinkedList;
import java.util.Stack;

public class Tree {

    TreeNode root;

    public void insert(int value) {
        TreeNode temp = new TreeNode();
        temp.value = value;
        if (root == null) {
            root = temp;
        } else {
            TreeNode p = root;
            while (true) {
                if (value < p.value) {
                    if (p.leftChild != null) {
                        p = p.leftChild;
                    } else {
                        p.leftChild = temp;
                        return;
                    }
                } else {
                    if (p.rightChild != null) {

                        p = p.rightChild;
                    } else {
                        p.rightChild = temp;
                        return;
                    }
                }
            }
        }
    }
    public boolean search(int value) {
        TreeNode current = root;
        while (true) {
            if (current.value == value) {
                return true;
            }
            if (value < current.value) {
                if (current.leftChild != null) {
                    current = current.leftChild;
                } else {
                    return false;
                }
            } else {
                if (current.rightChild != null) {
                    current = current.rightChild;
                } else {
                    return false;
                }
            }
        }
    }
    public TreeNode searchElement(int value) {
        TreeNode current = root;
        while (true) {
            if (current.value == value) {
                return current;
            }
            if (value < current.value) {
                if (current.leftChild != null) {
                    current = current.leftChild;
                } else {
                    return null;
                }
            } else {
                if (current.rightChild != null) {
                    current = current.rightChild;
                } else {
                    return null;
                }
            }
        }
    }
    public void pass(){
        inorder(root);
    }

    private void inorder(TreeNode node){
        if( node == null){
            return;
        }
        inorder(node.leftChild);
        System.out.println(node.value);
        inorder(node.rightChild);
    }
    public void passIterative() {
        inorderIterative(root);
    }


    private void inorderIterative(TreeNode node) {
        Stack<TreeNode> st = new Stack<>();
        while (!st.empty() || node != null) {
            if (node != null) {
                st.push(node);
                node = node.leftChild;
            } else {
                node = st.pop();
                System.out.println(node.value);
                node = node.rightChild;
            }
        }
    }

    public void passWidth(){
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.removeFirst();
            System.out.println(temp.value);
            if(temp.leftChild != null){
                queue.addLast(temp.leftChild);
            }
            if (temp.rightChild != null){
                queue.addLast(temp.rightChild);

            }

        }
    }


    private class TreeNode {
        int value;
        TreeNode leftChild;
        TreeNode rightChild;
    }

}