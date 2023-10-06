import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class TestLion {

    @Mock
    Lion lion;
    @Mock
    Feline felineMock;
    private final String sex;
    private final boolean hasManeExpected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false}
        });
    }

    public TestLion(String sex, boolean hasManeExpected) {
        this.sex = sex;
        this.hasManeExpected = hasManeExpected;
    }

    @Before
    public void setUp() throws Exception {
        felineMock = mock(Feline.class);
        lion = new Lion(sex, felineMock);
    }

    @Test
    public void testDoesHaveMane() {
        boolean hasMane = lion.doesHaveMane();
        assertEquals(hasManeExpected, hasMane);
    }
}





