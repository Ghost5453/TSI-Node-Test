public class Node {

    public int data;
    public boolean isLeaf;
    public Node left, right;

    Node(int data)
    {
        this.data = data;
        this.right = null;
        this.left = null;
        this.isLeaf = true;
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
