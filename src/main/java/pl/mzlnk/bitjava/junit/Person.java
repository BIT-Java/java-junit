package pl.mzlnk.bitjava.junit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private String name;
    private String surname;
    private int age;

}
