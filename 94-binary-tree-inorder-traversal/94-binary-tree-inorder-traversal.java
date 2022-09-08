/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {

    
    List<Integer> result = new ArrayList<Integer>();
 
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root !=null){
            Tree(root);
        }
 
        return result;
    }
 
    public void Tree(TreeNode p){
        if(p.left!=null)
            Tree(p.left);
 
        result.add(p.val);
 
        if(p.right!=null)
            Tree(p.right);
    }

        
    }
