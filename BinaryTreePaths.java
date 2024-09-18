class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        dfs(root, "", paths);
        return paths;
    }

    public void dfs(TreeNode root, String path, List<String> paths){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            paths.add(path + String.valueOf(root.val));
            return ;
        }

        dfs(root.left, path + String.valueOf(root.val) + "->", paths);
        dfs(root.right, path + String.valueOf(root.val) + "->", paths);
    }
}
