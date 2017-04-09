
package linkedlist.single;

/**
 *
 * @author GLNG
 * This class represents node of integer value
 */
public class Node {
    private int value;
    private Node node;

    public Node(int value, Node node) {
        this.value = value;
        this.node = node;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
    
    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
