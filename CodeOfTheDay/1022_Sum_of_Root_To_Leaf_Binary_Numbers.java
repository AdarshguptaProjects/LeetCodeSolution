class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return solve(root,0);
    }
    public int solve(TreeNode root, int res){
        if(root==null)
            return 0;
            res=res*2+root.val;
        if(root.left==null && root.right==null)
            return res;
        return solve(root.left,res)+solve(root.right,res);
    }
}
