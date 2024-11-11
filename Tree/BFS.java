package Tree;
import java.util.LinkedList;
public class BFS {
    public static void BFS(TreeNode root){
        if(root==null){
            return ;
        }
        LinkedList <TreeNode> list=new LinkedList<>();
        list.add(root);
        while(list.size()!=0){
            //remove first Node
            TreeNode temp=list.removeFirst();

            //work on removed node
            System.out.print(temp.data +" ");

            //Add Childs of removed Node
            if(temp.left!=null){
                list.addLast(temp.left);
            }
            if(temp.right!=null){
                list.addLast(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        //1 2 4 null null 5 null null 3 null null
        //1 2 6 5 null null 3 null null 9 null null 4 8 null null 7 null null
        MyTree t= new MyTree();
        BFS(t.root);
	}
}
