import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertTest {

    @BeforeEach
    public void before() {
        System.out.println("Before");
    }

    @Test
    public void test1() {
        assertEquals(1,1);
    }

    @Test
    public void test2() {
        boolean condt=true;
        assertTrue(condt);
    }
}