class Solution
{
    public static void transformTree (Node root)
    {
        //code here
        int [] sum = {0};  //Taking sum=0 
        u_inorder(root, sum);
    }
    static void u_inorder(Node r, int[] sum){
        if(r==null)
        return;
        
        u_inorder(r.right, sum);
        
        int t=r.data;
        r.data = sum[0];
        sum[0] += t;
        
        u_inorder(r.left, sum);
    }
}
