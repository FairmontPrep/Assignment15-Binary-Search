import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class FindListTest {
    
    @DisplayName("find ArrayList Test 01")
    @Test
    void findList_Test01() {
        BinarySearch bs = new BinarySearch();
        ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(3); c.add(5); c.add(7); c.add(10);
        c.add(14); c.add(22); c.add(25); c.add(27); c.add(36); 
        c.add(44); c.add(49); c.add(52); c.add(57); c.add(64);
        boolean result = bs.find(c, 5);
        assertTrue(result);
    }

    
    @DisplayName("find ArrayList Test 02")
    @Test
    void findList_Test02() {
        BinarySearch bs = new BinarySearch();
        ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(3); c.add(5); c.add(7); c.add(10); 
        c.add(14); c.add(22); c.add(25); c.add(27); c.add(36); 
        c.add(44); c.add(49); c.add(52); c.add(64);
        boolean result = bs.find(c, 14);
        assertTrue(result);
    }

    
    @DisplayName("find ArrayList Test 03")
    @Test
    void findList_Test03() {
        BinarySearch bs = new BinarySearch();
        ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(3); c.add(5); c.add(7); c.add(10); 
        c.add(14); c.add(22); c.add(25); c.add(27); c.add(36); 
        c.add(44); c.add(49); c.add(52); c.add(57); c.add(64);
        boolean result = bs.find(c, 57);
        assertTrue(result);
    }

    
    @DisplayName("find ArrayList Test 04")
    @Test
    void findList_Test04() {
        BinarySearch bs = new BinarySearch();
        ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(3); c.add(5); c.add(7); c.add(10); 
        c.add(14); c.add(22); c.add(27); c.add(36); 
        c.add(44); c.add(49); c.add(52); c.add(57); c.add(64);
        boolean result = bs.find(c, 27);
        assertTrue(result);
    }

    
    @DisplayName("find ArrayList Test 05")
    @Test
    void findList_Test05() {
        BinarySearch bs = new BinarySearch();
        ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(3); c.add(5); c.add(7); c.add(10); 
        c.add(14); c.add(22); c.add(25); c.add(27); c.add(36); 
        c.add(44); c.add(49); c.add(52); c.add(57); c.add(64);
        boolean result = bs.find(c, 49);
        assertTrue(result);
    }

    
    @DisplayName("find ArrayList Test 06")
    @Test
    void findList_Test06() {
        BinarySearch bs = new BinarySearch();
        ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(3); c.add(5); c.add(7); c.add(10); 
        c.add(14); c.add(22); c.add(25); c.add(27); c.add(36); 
        c.add(44); c.add(49); c.add(52); c.add(64);
        boolean result = bs.find(c, 23);
        assertFalse(result);
    }

    
    @DisplayName("find ArrayList Test 07")
    @Test
    void findList_Test07() {
        BinarySearch bs = new BinarySearch();
        ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(3); c.add(5); c.add(7); c.add(10); 
        c.add(14); c.add(22); c.add(25); c.add(27); c.add(36); 
        c.add(44); c.add(49); c.add(52); c.add(57); c.add(64);
        boolean result = bs.find(c, 4);
        assertTrue(!result);
    }

    @DisplayName("find ArrayList Test 08")
    @Test
    void findList_Test08() {
        BinarySearch bs = new BinarySearch();
        ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(5); c.add(7); c.add(10); 
        c.add(14); c.add(22); c.add(25); c.add(27); c.add(36); 
        c.add(44); c.add(49); c.add(52); c.add(57); c.add(64);
        boolean result = bs.find(c, 60);
        assertFalse(result);
    }

    @DisplayName("find ArrayList Test 09")
    @Test
    void findList_Test09() {
        BinarySearch bs = new BinarySearch();
        ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(3); c.add(5); c.add(7); c.add(10); 
        c.add(14); c.add(22); c.add(25); c.add(27); c.add(36); 
        c.add(44); c.add(49); c.add(52); c.add(57); c.add(64);
        boolean result = bs.find(c, 21);
        assertFalse(result);
    }
}
