class Solution {
     boolean flag;
    public boolean isBalanced(TreeNode root) {
        flag=true;
        height(root);
        return flag;
    }
    public int height(TreeNode root){
        if(root==null)
            return 0;
        int left =  height(root.left);
        int right = height(root.right);

        if(Math.abs(left-right)>1)
            flag=false;
        
        return Math.max(left,right)+1;
    }
}
