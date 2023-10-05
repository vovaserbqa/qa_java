import com.example.Feline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFeline {
    Feline feline = new Feline();

    @Test
    public void testMeat() throws Exception {
        Feline feline = new Feline();
        var actual = feline.eatMeat();
        List<String> expectedMeat = new ArrayList<>();
        expectedMeat.add("Животные");
        expectedMeat.add("Птицы");
        expectedMeat.add("Рыба");

        assertEquals(actual, expectedMeat);
    }

    @Test
    public void testFamily() throws Exception {
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void testKittens() {
        int expectedKittens = 8;
        assertEquals(expectedKittens, feline.getKittens(8));
    }

    @Test
    public void testKittensCount() {
        int expectedKittens = 1;
        assertEquals(expectedKittens, feline.getKittens());
    }


}
