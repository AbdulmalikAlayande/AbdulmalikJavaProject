import org.junit.jupiter.api.Test;
import tdd.Baby;

import static org.junit.jupiter.api.Assertions.*;

public class BabyTest {



    @Test
    public void requiredArgsConstructor(){
        Baby babym = new Baby(7);
        assertEquals(7, babym.getWeight());
        assertEquals(0, babym.getAge());
        assertEquals(null, babym.getName());

        Baby neddyBaby = new Baby();
        assertEquals(0, neddyBaby.getWeightInKg());
        assertEquals(0, neddyBaby.getAge());
        assertEquals(null, neddyBaby.getName());

    }





}