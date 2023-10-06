import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCat {

    @Mock
    Cat cat;
    private Feline felineMock;

    @Before
    public void setUp() throws Exception {
        felineMock = mock(Feline.class);
        cat = new Cat(felineMock);
    }

    @Test
    public void testCatSound() {
        String catSound = cat.getSound();
        assertEquals("Мяу", catSound);
    }

    @Test
    public void testCatFood() throws Exception {
        List<String> expectedFood = new ArrayList<>();
        expectedFood.add("Животные");
        expectedFood.add("Птицы");
        expectedFood.add("Рыба");
        when(felineMock.eatMeat()).thenReturn(expectedFood);

        List<String> catFood = cat.getFood();

        assertNotNull(catFood);
        assertEquals(expectedFood, catFood);
    }
}

