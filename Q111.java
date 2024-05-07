class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        stack.add(root);
        int thisLength = 1;
        int nextLength = 0;
        int layer = 1;
        while (true){
            int avail = 0;
            TreeNode curr = stack.getFirst();
            if (curr.left != null){
                stack.add(curr.left);
                avail ++;
            }
            if (curr.right != null){
                stack.add(curr.right);
                avail ++;
            }
            if (avail == 0){
                return layer;
            }
            nextLength += avail;
            thisLength --;
            stack.removeFirst();
            if (thisLength == 0){
                thisLength = nextLength;
                nextLength = 0;
                layer++;
            }
        }
    }
}