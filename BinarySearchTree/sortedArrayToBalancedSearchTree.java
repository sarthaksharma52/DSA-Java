/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node sortedArrayToBST(int[] arr) {
        // code here
        return find(arr,0,arr.length-1);
    }
    
    private Node find(int[] arr, int s,int l){
        int mid = (s+l)/2;
        
        if(s>l){
            return null;
        }
        Node root = new Node(arr[mid]);
        root.left = find(arr,s,mid-1);
        root.right = find(arr,mid+1,l);
        
        return root;
    }
}