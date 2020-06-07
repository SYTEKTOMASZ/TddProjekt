import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {
    private Greeting greeting = new Greeting();

    @BeforeEach

    public void beforeEach() throws Exception {
        greeting = new Greeting();
    }

@Test
@DisplayName("Test powitania")
    public void helloTest(){
    assertEquals("Witaj, Jan", greeting.hello("Jan") );
    assertEquals("Witaj, Marek", greeting.hello("Marek"));
}

    @ParameterizedTest
    @NullAndEmptySource
    public void helloNullOrEmptyTest(String name) {
        assertEquals("Witaj, przyjacielu", greeting.hello(name));
    }


}
