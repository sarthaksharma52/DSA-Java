package BinarySearchTree;

public class InertionInBinarySearchTree{

    static class node{
        int val;
        node left;
        node right;

        node(int val){
            this.val = val;
        }
    }

    public static node insert(node root ,int val){
        if(root == null){
            root = new node(val);
            return root;
        }
        if(root.val > val){
            root.left = insert(root.left ,val);
        }
        else{
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static void inorder(node root){
        if(root == null ){
            return;
        }
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);

    }
    public static void main(String[] args){
        int[] arr = {5,3,8,2,6,1,11};
        node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root , arr[i]);
        }

        inorder(root);
        System.out.println();

    }
}