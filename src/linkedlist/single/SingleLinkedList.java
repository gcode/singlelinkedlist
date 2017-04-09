
package linkedlist.single;

/**
 *
 * @author GLNG
 * This class implements Single Linked List of integer value
 */
public class SingleLinkedList {
    private Node firstNode;
    private int size = 0;

    public SingleLinkedList(int firstElement) {
        this.firstNode = new Node(firstElement, null);
        this.size++;
    }

    public SingleLinkedList() {
    }

    //method to check whether list is empty
    public final boolean isEmpty() {
        return firstNode == null;
    }

    //method to return size of list
    public int size() {
        return this.size;
    }

    //method to add new element
    public void addElement(int element) {
    	if(!isEmpty()){
    		Node parent = firstNode;
            Node current = parent;
            while (current != null) {
                parent = current;
                current = current.getNode();
            }
            parent.setNode(new Node(element, null));
    	}else{
    		firstNode = new Node(element,null);
    	}
        this.size++;
    }

    //method to remove last element in the list
    public void removeLastElement() {
        if (!isEmpty()) {
            Node parent = firstNode;            
            if(parent.getNode() != null) {
            	Node last = parent.getNode();
	            while (last.getNode() != null) {
	                parent = last;
	                last = last.getNode();
	            }
	            parent.setNode(null);
            }else{
            	firstNode = null;
            }            
            this.size--;
        }
    }

    //method to remove all element in the list that is great than a target value
    public void removeElementGreaterThan(int targetValue) {
        Node parent = firstNode;
        Node current = parent;
        while (current != null) {
            if (current.getValue() > targetValue) {
                if (current == firstNode) {
                    firstNode = current.getNode();
                } else {
                    parent.setNode(current.getNode());
                }
                this.size--;                
            } else {
                parent = current;                
            }  
            current = current.getNode();
        }
    }
    
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder("[");
        Node current = firstNode;
        while(current != null){
            string.append(current.toString());
            if(current.getNode() != null){
                string.append(",");
            }
            current = current.getNode();            
        }
        
        return string.append("]").toString();
    }
}
