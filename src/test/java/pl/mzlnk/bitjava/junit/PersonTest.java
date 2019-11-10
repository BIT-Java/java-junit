package pl.mzlnk.bitjava.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeAll
    static void initAll() {
        // code here
    }

    @AfterAll
    static void  finishAll() {
        // code here
    }

    @BeforeEach
    void init() {
        // code here
    }

    @AfterEach
    void finish() {
        // code here
    }

    @Test
    void testToString() {
        Person person = new Person("John", "Smiths", 25);
        String result = "Person(name=John, surname=Smiths, age=25)";
        assertEquals(result, person.toString());
    }

    @RepeatedTest(12)
    void repeatedTest() {
        // test here
    }

    @RepeatedTest(value = 12, name = "Test {displayName} - {currentRepetition} / {totalRepetitions}")
    @DisplayName("Repeating Test!")
    void repeatedTest2() {
        // test here
    }

    @Test
    @Disabled("for demonstration only")
    void skippedTest() {
        // test here
    }

    @Test
    @DisplayName("Test with custom name")
    void customTest() {
        // test here
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, -6, 8})
    void nonNegativeNumbersTest(int value) {
        assertTrue(value > 0);
    }

    @Test
    @Timeout(value = 300, unit = TimeUnit.MILLISECONDS)
    void timeoutTest() throws InterruptedException {
        Thread.sleep(400);
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void notOnWindowsTest() {
        // test here
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void onlyOnWindowsTest() {
        // test here
    }

    @Test
    @EnabledOnJre({JRE.JAVA_12, JRE.JAVA_13})
    void onlyOnJava12And13Test() {
        // test here
    }

}