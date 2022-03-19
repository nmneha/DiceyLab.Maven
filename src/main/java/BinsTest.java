import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {
    Bins results = new Bins(2, 12);


    @Test
    void getBin() {
        //Given
        int expected = 0;

        System.out.println(results.getBin(10));
        int actual =  results.getBin(10);

        Assert.assertEquals(expected,actual);
    }

    @Test
    void increment() {
       // given
        int expected = 2;
        System.out.println("Before: " + results.getBin(10));

        results.increment(10);
        results.increment(10);

        System.out.println("After: " + results.getBin(10));
        int actual = results.getBin(10);

        Assert.assertEquals(expected, actual);

    }
}