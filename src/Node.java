public class Node {

    public int data;

    private  Node _left, _right;

    public void AddToLeft(Node myNode)
    {
        _left = myNode;
    }

    public void AddToRight(Node myNode)
    {
        _right = myNode;
    }

}
