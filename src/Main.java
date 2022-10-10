public class Main {
    public static void main(String[] args) {
        Node root = new Node(0);

        root.AddToLeft(new Node(1));
        root.AddToRight(new Node(2));
        root.left.AddToLeft(new Node(3));
        root.left.AddToRight(new Node(4));
        root.right.AddToLeft(new Node(5));
        root.right.AddToRight(new Node(6));
        root.left.left.AddToLeft(new Node(7));

        System.out.println(root.data);
        System.out.println(root.left.data + " | " + root.right.data);
        System.out.println(root.left.left.data + " | " + root.left.right.data + " || " + root.right.left.data + " | " +root.right.right.data);
        System.out.println(root.left.left.left.data);
    }
}