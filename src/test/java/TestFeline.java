import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;

public class TestFeline {

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }

    @Test
    public void testFelineEatMeat() throws Exception {
        List<String> food = feline.eatMeat();

        assertNotNull(food);
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }

    @Test
    public void testFamily() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void testKittens() {
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void testKittensWithCount() {
        int kittens = feline.getKittens(3);
        assertEquals(3, kittens);
    }
}

