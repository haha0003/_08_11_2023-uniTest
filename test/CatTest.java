import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    private Cat cat;

    @BeforeEach
    void setUp(){
        cat = new Cat("Mijavchel Jackson", 'M', 9);
    }

    @Test
    void getName() {
        assertNotNull(cat.getName());
        assertFalse(cat.getName().isEmpty());
    }

    @Test
    void getGender() {
        assertTrue(cat.getGender() == 'M' || cat.getGender() == 'F');
    }

    @Test
    void getWeightInKg() {
        assertTrue(cat.getWeightInKg() >= 0 && cat.getWeightInKg() <= 10);
    }
}