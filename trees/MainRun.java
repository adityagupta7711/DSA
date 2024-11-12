package trees;
public class MainRun{
    public static void main(String[] args) {
        bst tree= new bst();
    int[] nums= {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
    tree.populate(nums);
    tree.display();
    }
}