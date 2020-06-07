import javafx.util.StringConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();

    @BeforeEach
    public void beforeEach() throws Exception {
        stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("Test dodawania")
    public void addTest() throws Exception {
        assertEquals(0, stringCalculator.add(""));
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(3, stringCalculator.add("1,2"));
    }


    @Test
    @DisplayName("Wiele Liczb")
    public void manyNumbersAddTest() throws Exception {
        assertEquals(6, stringCalculator.add("1,2,3"));
        }

        @Test
        @DisplayName("test separatora")
        public void separatorAddTest() throws Exception{
        assertEquals(6,stringCalculator.add("1\n2,3"));
        }

    @Test
    @DisplayName("Test generowanego separatora")
    public void customLineDelimeterTest() throws Exception {
        assertEquals(6, stringCalculator.add("//;\n1;2;3"));
    }

    @Test
    @DisplayName("Wykrywanie liczn ujemnych")
    public void negativeNumbersTest() throws Exception{
        Exception exception = assertThrows(Exception.class, () -> {
            stringCalculator.add("1,-2,-3");
        });

        System.out.println(exception.getLocalizedMessage());

        assertTrue(exception.getLocalizedMessage().contains("-2"));
        assertTrue(exception.getLocalizedMessage().contains("-3"));
    }

    @Test
    @DisplayName("Pomijanie liczb większych niż 1000")
    public void tooBigNumbers() throws Exception{
        assertEquals(3,stringCalculator.add("2,1,1500,1001"));

    }



}


