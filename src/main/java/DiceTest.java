import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DiceTest {

    @Test
    void tossAndSumTest() {
        //given
        Dice dice = new Dice(5);

        System.out.println(dice.tossAndSum());
    }

    @Test
    void getDieTest() {
        Dice dice = new Dice(2);
        int expected = 2;

        int actual = dice.getNumberOfDie();

        Assert.assertEquals(expected, actual);
    }
}