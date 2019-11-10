package pl.mzlnk.bitjava.junit;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderedPersonTest {

    @Test
    @Order(2)
    void test1() {
        // test here
    }

    @Test
    @Order(1)
    void test2() {
        // test here
    }

}




