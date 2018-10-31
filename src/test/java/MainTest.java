import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void simpleTest(){
        int a = 1;
        int b = 2;
        Assertions.assertTrue(a + b == 3);
    }

}