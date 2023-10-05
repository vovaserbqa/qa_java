import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCat {


    @Test
    public void testSoundCat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        var actual = cat.getSound();
        String expectedSound = "Мяу";

        assertEquals(actual, expectedSound);
    }

    @Test
    public void testFoodCat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        var actual = cat.getFood();
        List<String> expectedSound = new ArrayList<>();
        expectedSound.add("Животные");
        expectedSound.add("Птицы");
        expectedSound.add("Рыба");

        assertEquals(actual, expectedSound);
    }
}
