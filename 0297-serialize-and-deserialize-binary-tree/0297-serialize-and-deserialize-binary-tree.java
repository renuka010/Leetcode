/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        StringBuilder res=new StringBuilder();
        
        if(root==null)
            return "";
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        res.append(String.valueOf(root.val));
        TreeNode curr;
        while(!q.isEmpty()){
            curr=q.poll();
            if(curr.left!=null){
                q.offer(curr.left);
                res.append("L"+String.valueOf(curr.left.val));
            }
            else
                res.append("N");
            
            if(curr.right!=null){
                q.offer(curr.right);
                res.append("R"+String.valueOf(curr.right.val));
            }
            else
                res.append("N");
        }
        
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String s) {
        if(s.length()==0)
            return null;
        
        TreeNode root=new TreeNode();
        TreeNode curr=root;
        int i=0, n=0;
        boolean neg=false;
        if(s.charAt(i)=='-'){
            neg=true;
            i++;
        }
        while(i<s.length() && s.charAt(i)!='R'&& s.charAt(i)!='L'&&s.charAt(i)!='N'){
            n=(n*10+(s.charAt(i)-'0'));
            i++;
        }
        if(neg)
            n=0-n;
        curr.val=n;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(curr);
        
        while(i<s.length()){
            curr=q.poll();
            
            if(s.charAt(i)=='N'){
                curr.left=null;
                i++;
            }
            else{
                i++;
                n=0;
                neg=false;
                if(s.charAt(i)=='-'){
                    neg=true;
                    i++;
                }
                while(i<s.length() && s.charAt(i)!='R'&& s.charAt(i)!='L'&& s.charAt(i)!='N'){
                    n=(n*10+(s.charAt(i)-'0'));
                    i++;
                }
                if(neg)
                    n=0-n;
                TreeNode left=new TreeNode(n);
                curr.left=left;
                q.offer(left);
            }
            
            if(s.charAt(i)=='N'){
                curr.right=null;
                i++;
            }
            else{
                i++;
                neg=false;
                if(s.charAt(i)=='-'){
                    neg=true;
                    i++;
                }
                n=0;
                while(i<s.length() && s.charAt(i)!='R'&& s.charAt(i)!='L'&& s.charAt(i)!='N'){
                    n=(n*10+(s.charAt(i)-'0'));
                    i++;
                }
                if(neg)
                    n=0-n;
                TreeNode right=new TreeNode(n);
                curr.right=right;
                q.offer(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));