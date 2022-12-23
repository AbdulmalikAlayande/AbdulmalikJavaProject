package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    @Test
    void addMethod(){
        Addition ben = new Addition();
        ben.add(2,4);
        assertEquals(6,ben.getAdd());
    }
}
