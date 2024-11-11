package Tree;

public class Client {
    public static void main(String[] args) {
        MyTree s=new MyTree();
        System.out.println();
        //1 2 4 null null 5 null null 3 null null
        System.out.print("PreOrder"+ " : ");
        DFS d=new DFS();
        d.preOrder(s.root);
        System.out.println();
        System.out.print("InOrder"+ " : ");
        d.inOrder(s.root);
        System.out.println();
        System.out.print("PostOrder"+ " : ");
        d.postOrder(s.root);
    }
}
