package Tree;

public class DFS {
    public static void preOrder(TreeNode root){
        pre(root);
    }
    public static void inOrder(TreeNode root){
        inO(root);
    }
    public static void postOrder(TreeNode root){
        post(root);
    }
    private static void pre(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        pre(root.left);
        pre(root.right);
    }
    private static void inO(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    private static void post(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
