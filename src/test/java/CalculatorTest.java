import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @BeforeEach
    public void beforeEach() {
        System.out.println("Nowy Objekt");
        calculator = new Calculator();
    }
@Test
    @DisplayName("Test dodawania")
    public void additionTest() {

assertEquals(3,calculator.add(1,2));
assertNotEquals(3,calculator.add(2,2), "2+2 =4");
}
@Test
@DisplayName("Test odejmowania")

public void substractTest(){
    assertEquals(4, calculator.substract(6,2));
    assertNotEquals(2, calculator.substract(5,2));
}

@Test
@DisplayName("Test mnożenia")
public void mulitplyTest(){
        assertEquals(3,calculator.multiply(1,3));
        assertNotEquals(3,calculator.multiply(2,3));

}
@Test
@DisplayName("Test dzielenia")

    public  void divideTest(){
        assertEquals(3,calculator.divide(6,2));
        assertNotEquals(3,  calculator.divide(3,3));

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(4,0);
        });
}



}
