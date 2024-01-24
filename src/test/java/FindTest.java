import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FindTest {

    @DisplayName("find Test 01")
    @Test
    void find_Test01() {
        BinarySearch bs = new BinarySearch();
        int[] a = {2, 3, 5, 7, 10, 14, 22, 25, 27, 36, 44, 49, 52, 57, 64};
        boolean result = bs.find(a, 5);
        assertTrue(result);
    }

    
    @DisplayName("find Test 02")
    @Test
    void find_Test02() {
        BinarySearch bs = new BinarySearch();
        int[] a = {2, 3, 5, 7, 10, 14, 22, 27, 36, 44, 49, 52, 57, 64};
        boolean result = bs.find(a, 14);
        assertTrue(result);
    }

    
    @DisplayName("find Test 03")
    @Test
    void find_Test03() {
        BinarySearch bs = new BinarySearch();
        int[] a = {2, 3, 5, 7, 10, 14, 22, 25, 27, 36, 44, 49, 52, 57, 64};
        boolean result = bs.find(a, 57);
        assertTrue(result);
    }

    
    @DisplayName("find Test 04")
    @Test
    void find_Test04() {
        BinarySearch bs = new BinarySearch();
        int[] a = {2, 3, 5, 7, 14, 22, 25, 27, 36, 44, 49, 52, 57, 64};
        boolean result = bs.find(a, 27);
        assertTrue(result);
    }

    
    @DisplayName("find Test 05")
    @Test
    void find_Test05() {
        BinarySearch bs = new BinarySearch();
        int[] a = {2, 3, 5, 7, 10, 14, 22, 25, 27, 36, 44, 49, 52, 57, 64};
        boolean result = bs.find(a, 49);
        assertTrue(result);
    }

    
    @DisplayName("find Test 06")
    @Test
    void find_Test06() {
        BinarySearch bs = new BinarySearch();
        int[] a = {2, 3, 5, 7, 10, 14, 22, 25, 27, 36, 49, 52, 57, 64};
        boolean result = bs.find(a, 23);
        assertFalse(result);
    }

    
    @DisplayName("find Test 07")
    @Test
    void find_Test07() {
        BinarySearch bs = new BinarySearch();
        int[] a = {2, 3, 5, 7, 10, 14, 22, 25, 27, 36, 44, 49, 52, 57, 64};
        boolean result = bs.find(a, 4);
        assertTrue(!result);
    }

    @DisplayName("find Test 08")
    @Test
    void find_Test08() {
        BinarySearch bs = new BinarySearch();
        int[] a = {2, 3, 5, 7, 10, 14, 22, 25, 27, 36, 49, 52, 57, 64};
        boolean result = bs.find(a, 60);
        assertFalse(result);
    }

    @DisplayName("find Test 09")
    @Test
    void find_Test09() {
        BinarySearch bs = new BinarySearch();
        int[] a = {2, 3, 5, 7, 10, 14, 22, 25, 27, 36, 44, 49, 52, 57, 64};
        boolean result = bs.find(a, 21);
        assertFalse(result);
    }
}
