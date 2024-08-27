class Solution {
    public int maxDepth(TreeNode root) {    
        return maxDepthDfs(root, 0);     
    }

    public int maxDepthDfs(TreeNode root, int currentDepth){
        if(root == null){
            return currentDepth;
        }

        return Math.max(maxDepthDfs(root.left, currentDepth + 1), maxDepthDfs(root.right, currentDepth + 1));    
    }
}
