import javafx.util.StringConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();

    @BeforeEach
    public void beforeEach() {
        stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("Test dodawania")
    public void addTest() {
        assertEquals(0, stringCalculator.add(""));
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(3, stringCalculator.add("1,2"));
    }


    @Test
    @DisplayName("Wiele Liczb")
    public void manyNumbersAddTest() {
        assertEquals(6, stringCalculator.add("1,2,3"));
        }

        @Test
        @DisplayName("test separatora")
        public void separatorAddTest(){
        assertEquals(6,stringCalculator.add("1\n2,3"));
        }

        @Test
        @DisplayName("Test dodatkowego separatora")
    public void optionalSeparatorTest(){
        assertEquals(6, stringCalculator.add("//;\n,2;2\n2"));
        }



}


