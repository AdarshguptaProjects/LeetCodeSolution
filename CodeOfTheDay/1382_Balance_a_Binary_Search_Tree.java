/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        TreeNode temp = root;
        solveInorderTraversal(temp,al);
        return makeBST(al,0,al.size()-1);
    }
    public void solveInorderTraversal(TreeNode root, List<Integer> al){
        if(root==null)
            return;
        solveInorderTraversal(root.left,al);
        al.add(root.val);
        solveInorderTraversal(root.right,al);
    }
    public TreeNode makeBST(List<Integer> al, int start, int end){
        if(start>end)
            return null;
        int mid = start+(end-start)/2;
        TreeNode res = new TreeNode(al.get(mid));
        res.left = makeBST(al,start,mid-1);
        res.right = makeBST(al,mid+1,end);

        return res;
        
    }
}
