import javafx.util.StringConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();

    @BeforeEach
    public void beforeEach() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void addTest() {
        assertEquals(0, stringCalculator.add(""));
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(3, stringCalculator.add("1,2"));
    }


    @Test
    public void manyNumbersAddTest() {
        assertEquals(6, stringCalculator.add("1,2,3"));
        }
    }


