import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTestHW {

    @Test
     void testGetSum(){
       int result;

       result = MainHW.getSum(10, 10);
       Assert.assertEquals(result, 20);

       result = MainHW.getSum(0, 0);
       Assert.assertEquals(result, 0);

       result = MainHW.getSum(-10, -10);
       Assert.assertEquals(result, -20);

       result = MainHW.getSum(-10, 10);
       Assert.assertEquals(result, 0);
        }

    @Test
    void testGetMult(){
        int result;

        result = MainHW.getMult(10, 10);
        Assert.assertEquals(result, 100);

        result = MainHW.getMult(0, 0);
        Assert.assertEquals(result, 0);

        result = MainHW.getMult(-10, -10);
        Assert.assertEquals(result, 100);

        result = MainHW.getMult(-10, 10);
        Assert.assertEquals(result, -100);
    }

    @Test
    void testGetMin(){
        int result;

        result = MainHW.getMin(10, 10);
        Assert.assertEquals(result, 0);

        result = MainHW.getMin(0, 0);
        Assert.assertEquals(result, 0);

        result = MainHW.getMin(-10, -10);
        Assert.assertEquals(result, 0);

        result = MainHW.getMin(-10, 10);
        Assert.assertEquals(result, -20);
    }

    @Test
    void testGetSep(){
        int result;

        result = MainHW.getSep(10, 10);
        Assert.assertEquals(result, 1);

        result = MainHW.getSep(4, 2);
        Assert.assertEquals(result, 2);

        result = MainHW.getSep(-10, -10);
        Assert.assertEquals(result, -1);

        result = MainHW.getSep(-10, 10);
        Assert.assertEquals(result, -1);
    }
}
