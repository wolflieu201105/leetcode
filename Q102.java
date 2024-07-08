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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if (root == null) {
            return returnList;
        }
        List<List<Integer>> leftList = levelOrder(root.left);
        List<List<Integer>> rightList = levelOrder(root.right);
        returnList = leftList;
        for (int i = 0; i < rightList.size(); i++) {
            if (i >= returnList.size()){
                returnList.add(rightList.get(i));
                continue;
            }
            List<Integer> inList = returnList.get(i);
            List<Integer> outList = rightList.get(i);
            inList.addAll(outList);
            returnList.set(i, inList);
        }
        List<Integer> thisValue = new ArrayList<Integer>();
        thisValue.add(root.val);
        returnList.add(0, thisValue);
        return returnList;
    }
}