public class Node {

    public int data;
    public boolean isLeaf;
    public Node left, right;
    private Node _pairant;
    private  int _id;

    Node(int data, Node myParent)
    {
        this.data = data;
        this.right = null;
        this.left = null;
        this.isLeaf = true;
        _pairant = myParent;
    }

    public void AddToLeft(Node myNode)
    {
        left = myNode;
        isLeaf = false;
    }

    public void AddToRight(Node myNode)
    {
        right = myNode;
        isLeaf = false;
    }

    public Node GetLeft()
    {
        if (isLeaf)
        {
            System.out.println("Is a leaf");
        }

        return left;
    }

    public Node GetRight()
    {
        if (isLeaf)
        {
            System.out.println("Is a leaf");
        }

        return right;
    }

}
