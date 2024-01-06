import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] startTime = {1,2,3,3};
        int[] endTime = {3,4,5,6};
        int[] profit = {50,10,40,70};
        int expected = 120;
        int actual = new Solution().jobScheduling(startTime, endTime, profit);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test2(){
        int[] startTime = {1,2,3,4,6};
        int[] endTime = {3,5,10,6,9};
        int[] profit = {20,20,100,70,60};
        int expected = 150;
        int actual = new Solution().jobScheduling(startTime, endTime, profit);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test3(){
        int[] startTime = {1,1,1};
        int[] endTime = {2,3,4};
        int[] profit = {5,6,4};
        int expected = 6;
        int actual = new Solution().jobScheduling(startTime, endTime, profit);

        Assert.assertEquals(expected,actual);
    }
}
