import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}

@Test
    @DisplayName("Test obsługi pustego imienia")
    public void helloEmptyNameTest(){
    assertEquals("Witaj, przyjacielu", greeting.hello("") );
}

}
