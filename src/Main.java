import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //createNumbers();
        Scanner input=new Scanner(new File("p9in-JaeJee.txt"));
        int[] numbers=new int[20];
        int i=0;

        //BinaryTree<Integer> numberTree;
        while (input.hasNext()){
            numbers[i]=input.nextInt();
            i++;
        }

        BinaryTreeInterface<Integer> emptyTree= new BinaryTree<>();
        i=0;
        BinaryTreeInterface<Integer> aTree=new BinaryTree<>();
        aTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> bTree=new BinaryTree<>();
        bTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> cTree=new BinaryTree<>();
        cTree.setTree(numbers[i],aTree,bTree);
        i++;
        BinaryTreeInterface<Integer> dTree=new BinaryTree<>();
        dTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> eTree=new BinaryTree<>();
        eTree.setTree(numbers[i],dTree,emptyTree);
        i++;
        BinaryTreeInterface<Integer> fTree=new BinaryTree<>();
        fTree.setTree(numbers[i],cTree,eTree);
        i++;
        BinaryTreeInterface<Integer> gTree=new BinaryTree<>();
        gTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> hTree=new BinaryTree<>();
        hTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> iTree=new BinaryTree<>();
        iTree.setTree(numbers[i],gTree,hTree);
        i++;
        BinaryTreeInterface<Integer> jTree=new BinaryTree<>();
        jTree.setTree(numbers[i],fTree,iTree);
        i++;
        BinaryTreeInterface<Integer> kTree=new BinaryTree<>();
        kTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> lTree=new BinaryTree<>();
        lTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> mTree=new BinaryTree<>();
        mTree.setTree(numbers[i],kTree,lTree);
        i++;
        BinaryTreeInterface<Integer> nTree=new BinaryTree<>();
        nTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> oTree=new BinaryTree<>();
        oTree.setTree(numbers[i],nTree,mTree);
        i++;
        BinaryTreeInterface<Integer> pTree=new BinaryTree<>();
        pTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> qTree=new BinaryTree<>();
        qTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> rTree=new BinaryTree<>();
        rTree.setTree(numbers[i],pTree,qTree);
        i++;
        BinaryTreeInterface<Integer> sTree=new BinaryTree<>();
        sTree.setTree(numbers[i],rTree,oTree);
        i++;
        BinaryTreeInterface<Integer> tTree=new BinaryTree<>();
        tTree.setTree(numbers[i],jTree,sTree);




        Scanner userInput=new Scanner(System.in);
        int choiceNum;
        do {
            System.out.println("Choose the following:\n1 - Add a number into the tree\n" +
                "2 - Delete a number from the tree\n3 - Preorder Traversal\n4 - Inorder Traversal\n" +
                "5 - Postorder Traversal\n6 - Exit");

            choiceNum=userInput.nextInt();
            switch (choiceNum){
                case 1:
                    System.out.println("Add: ");
                    int add=userInput.nextInt();

                    preorder(tTree);
                    inorder(tTree);
                    postorder(tTree);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Delete: ");
                    int delete=userInput.nextInt();

                    preorder(tTree);
                    inorder(tTree);
                    postorder(tTree);
                    System.out.println();
                    break;
                case 3:
                    preorder(tTree);
                    System.out.println();
                    break;
                case 4:
                    inorder(tTree);
                    System.out.println();
                    break;
                case 5:
                    postorder(tTree);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Input is invalid");
                    break;
            }

        }while (choiceNum!=6);


    }

    static void preorder(BinaryTreeInterface tTree){
        Iterator<Integer> preorder=tTree.getPreorderIterator();
        System.out.print("Preorder Traversal:\t");
        while (preorder.hasNext())
            System.out.print(preorder.next()+" ");
        System.out.println();
    }

    static void inorder(BinaryTreeInterface tTree){
        Iterator<Integer> inorder=tTree.getInorderIterator();
        System.out.print("Inorder Traversal:\t");
        while (inorder.hasNext())
            System.out.print(inorder.next()+" ");
        System.out.println();
    }

    static void postorder(BinaryTreeInterface tTree){
        Iterator<Integer> postorder=tTree.getPostorderIterator();
        System.out.print("Postorder Traversal:\t");
        while (postorder.hasNext())
            System.out.print(postorder.next()+" ");
        System.out.println();
    }

    static void createNumbers() throws IOException {
        int[] nums=new int[20];
        java.io.PrintWriter output=new java.io.PrintWriter(new File("p9in-JaeJee.txt"));

        for (int i=0;i<20;i++) {
            nums[i] = (int) (Math.random() * 101);
            output.println(nums[i]);
        }output.close();
    }
}
