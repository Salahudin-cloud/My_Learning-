package Latihan;


public class TreeNode {
    int data ; 
    TreeNode right ; 
    TreeNode left ; 

    public TreeNode(int data) {
        this.data = data;
    }
}
public class binarryTree {
    TreeNode root; 

    public Boolean isEmpty() {
        return (root == null) ; 
    }

    //insert data 
    public void insert(TreeNode input) {
        if(isEmpty()) {
            root = input; 
        }else {
            //cari parent yang sesuai dan (kiri  kanan ) 
            TreeNode current = root ; 
            TreeNode parent = null ; 
            boolean diKiri = true ; 
            while (current != null ) {
                //jika data input lebih besar maka akan ke kanan 
                if(current.data < input.data ) {
                    current = current.right ; 
                    diKiri = false ; 
                    //else bbegerak kekiri 
                }else if (current.data > iinput.data) {
                    current = current = current.left; 
                    diKiri = true ;
                }else {
                    System.out.println("data : " + input.data + " sudah ada");
                }
             }
             
        }
    }
}
