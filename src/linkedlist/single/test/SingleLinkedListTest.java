
package linkedlist.single.test;

import linkedlist.single.SingleLinkedList;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author GLNG
 * For testing purpose
 */
public class SingleLinkedListTest {    
    @Test
    public void test_addElement(){
        SingleLinkedList sll = new SingleLinkedList();
        
        sll.addElement(3);        
        Assert.assertEquals(false, sll.isEmpty());
        Assert.assertEquals(1, sll.size());
        Assert.assertEquals("[3]", sll.toString());
        
        sll.addElement(2);        
        Assert.assertEquals(2, sll.size());
        Assert.assertEquals("[3,2]", sll.toString());
    }
    
    @Test
    public void test_removeLastElement(){
        SingleLinkedList sll = new SingleLinkedList();
        
        sll.addElement(2);
        Assert.assertEquals(false, sll.isEmpty());
        Assert.assertEquals(1, sll.size());
        Assert.assertEquals("[2]", sll.toString());
        
        sll.removeLastElement();        
        Assert.assertEquals(true, sll.isEmpty());
        Assert.assertEquals(0, sll.size());
        Assert.assertEquals("[]", sll.toString());
    }
    
    @Test
    public void test_removeElementsGreaterThan(){
        SingleLinkedList sll = new SingleLinkedList();
        sll.addElement(5);
        sll.addElement(4);
        sll.addElement(3);
        sll.addElement(2);
        sll.addElement(1);
        sll.addElement(0);
        Assert.assertEquals(false, sll.isEmpty());
        Assert.assertEquals(6, sll.size());
        Assert.assertEquals("[5,4,3,2,1,0]", sll.toString());
        
        sll.removeElementGreaterThan(3);        
        Assert.assertEquals(4, sll.size());
        Assert.assertEquals("[3,2,1,0]", sll.toString());
    }
}
