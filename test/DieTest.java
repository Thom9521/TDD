import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DieTest {
    @Test
    void testRollMinValue() {

        DieMinValue die = new DieMinValue();
        die.roll();

        assertTrue(die.wasRolled);
        assertEquals(1, die.getFaceValue());
    }

    private class DieMinValue extends Die {
        boolean wasRolled = false;

        @Override
        public void roll(){
            super.roll();
            wasRolled = true;
        }

        @Override
        protected double mathRandom(){return 0;}
    }

    @Test
    void testRollMaxValue() {

        DieMaxValue die = new DieMaxValue();
        die.roll();

        assertTrue(die.wasRolled);
        assertEquals(6, die.getFaceValue());
    }

    private class DieMaxValue extends Die {
        boolean wasRolled = false;

        @Override
        public void roll(){
            super.roll();
            wasRolled = true;
        }

        @Override
        protected double mathRandom(){return 0.99999;}
    }

    @Test
    void testMinValueEquals1(){
        Die die = new Die();
        assertEquals(1, die.getMinValue());
    }

    @Test
    void testMaxValueEquals1(){
        Die die = new Die();
        assertEquals(6, die.getMaxValue());
    }
}
