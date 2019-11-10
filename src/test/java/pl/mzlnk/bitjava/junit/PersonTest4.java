package pl.mzlnk.bitjava.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest4 {

    @Test
    void getSurname() {
        Person p = new Person("John", "Smiths", 23);;

        assertEquals("Smithss", p.getSurname());
    }

    @Test
    void getAge() {
    }

}