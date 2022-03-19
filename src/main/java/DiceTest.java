import org.junit.jupiter.api.Test;

class DiceTest {

    @Test
    void tossAndSum() {
        //given
        Dice dice = new Dice(5);

        System.out.println(dice.tossAndSum());
    }
}