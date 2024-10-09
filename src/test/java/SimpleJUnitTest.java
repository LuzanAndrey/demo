import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {
    int result;

    @BeforeAll

    static void beforeall() {
        System.out.println("### beforeall()\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("### beforeEach()");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("### afterEach()\n");
        result = 0;
    }
    @AfterAll

    static void AfterAll() {
        System.out.println("### AfterAll()\n");
    }

    @Test
    void firstTest() {

        System.out.println("### firstTest");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        System.out.println("### secondTest");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("### thirdTest");
        Assertions.assertTrue(result > 2);
    }
    private int getResult() {
        return 3;
}
}