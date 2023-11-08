import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person p;

    @BeforeEach
    void setUp(){
        p = new Person("Gus", 1888,'F');
    }

    @Test
    void getName() {
        assertNotNull(p.getName());
        assertFalse(p.getName().isEmpty());
    }

    @Test
    void getYearOfBirth() {
        assertTrue(p.getYearOfBirth() <= LocalDateTime.now().getYear());
    }

    @Test
    void getGender() {
        assertTrue(p.getGender() == 'M' || p.getGender() == 'F');
    }
}