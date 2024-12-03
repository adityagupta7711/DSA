package trees;
public class MainRun{
    public static void main(String[] args) {
    
    
    int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
    SegmentTree tree = new SegmentTree(arr);
    // tree.display();

    System.out.println(tree.query(1, 6));
    }
}


/*
 * //     bst tree= new bst();
    // int[] nums= {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
    // tree.populate(nums);
    // tree.display();
 */