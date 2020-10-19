
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RomanToArabicTest {
    String in, expected;

    public RomanToArabicTest(String in, String expected) {
        this.in = in;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection providerArabToRim() {
        return Arrays.asList(new Object[][]{
                {"II", "2"},
                {"ii", "2"},
                {"V", "5"},
                {"vIi", "7"},
                {"X", "10"},
                {"IVVV", "14"},
                {"IIIV", "2"},
                {"IX", "9"},
                {"IIX", "8"},
                {"IIIIX", "6"},
                {"CCI", "201"},
                {"IIC", "98"},
                {"DCI", "601"},
                {"mcii", "1102"},
        });
    }

    @Test
    public void testArabToRim() {
        String out = new RomanToArabic().ArabToRim(in);
        Assert.assertEquals(expected, out);
    }
}