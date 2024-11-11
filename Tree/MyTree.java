package Tree;
import java.util.*;
public class MyTree {
    TreeNode root;
    Scanner s=new Scanner(System.in);
    MyTree(){
        root=Build();
    }
    private TreeNode Build(){
        System.out.println("Enter Data");
        String data=s.next();
        if(data.equals("null")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(data));
        System.out.println("Left child");
        root.left=Build();
        System.out.println("Right child");
        root.right=Build();

        return root;
    }
}
