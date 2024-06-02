import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    MyMath myMath = new MyMath();

    @BeforeEach
    public void before() {
        System.out.println("Before");
    }

    @AfterEach
    public void after() {
        System.out.println("After");
    }

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After");
    }

    @Test
    public void sum_with_three_numbers() {
        int result = myMath.sum(new int[]{1,2,3});
        assertEquals(6,result);
    }

    @Test
    public void sum_with_one_number() {
        int result = myMath.sum(new int[]{3});
        assertEquals(3,result);
    }
}