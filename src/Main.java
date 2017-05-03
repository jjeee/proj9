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

        BinaryTreeInterface<Integer> aTree=new BinaryTree<>();
        aTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> bTree=new BinaryTree<>();
        bTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> cTree=new BinaryTree<>();
        cTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> dTree=new BinaryTree<>();
        dTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> eTree=new BinaryTree<>();
        eTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> fTree=new BinaryTree<>();
        fTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> gTree=new BinaryTree<>();
        gTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> hTree=new BinaryTree<>();
        hTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> iTree=new BinaryTree<>();
        iTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> jTree=new BinaryTree<>();
        jTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> kTree=new BinaryTree<>();
        kTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> lTree=new BinaryTree<>();
        lTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> mTree=new BinaryTree<>();
        mTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> nTree=new BinaryTree<>();
        nTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> oTree=new BinaryTree<>();
        oTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> pTree=new BinaryTree<>();
        pTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> qTree=new BinaryTree<>();
        qTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> rTree=new BinaryTree<>();
        rTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> sTree=new BinaryTree<>();
        sTree.setTree(numbers[i]);
        i++;
        BinaryTreeInterface<Integer> tTree=new BinaryTree<>();
        tTree.setTree(numbers[i]);





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
