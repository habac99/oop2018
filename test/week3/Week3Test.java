package week3;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
public class Week3Test {


    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(5,Week3.max(3,5));
        assertEquals(7,Week3.max(5,7));
        assertEquals(23,Week3.max(11,23));
        assertEquals(22,Week3.max(22,10));
        assertEquals(11,Week3.max(11,10));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinArray(){
        int array1[] = {1, 9,7,4,3,12,0,-2};
        int array2[] = {3,6,2,1,8,-11,-2,35};
        int array3[] = {6,7,8,12,21,2,25,67};
        int array4[] = {6,7,34,23,11,-3,8};
        int array5[] = {22,10,12,45,7,4,29};
        assertEquals(-2,Week3.minOfArray(array1));
        assertEquals(-11,Week3.minOfArray(array2));
        assertEquals(2,Week3.minOfArray(array3));
        assertEquals(-3,Week3.minOfArray(array4));
        assertEquals(4,Week3.minOfArray(array5));



    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI(){
        assertEquals("Bình thường", Week3.calculateBMI(60,1.7));
        assertEquals("Thiếu cân", Week3.calculateBMI(40,1.7));
        assertEquals("Thừa cân", Week3.calculateBMI(60,1.6));
        assertEquals("Béo phì", Week3.calculateBMI(60,1.5));
        assertEquals("Bình thường", Week3.calculateBMI(70,1.8));
    }
}
