package app;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BinaryConverterTest {

    @DataProvider(name = "numbers")
    public Object[][] numbers() {
        return new Object[][]{
                {3, "11"}
        };
    }


    @Test(dataProvider = "numbers")
    public void correctConversionTest(int number, String expected) {
        // given
        BinaryConverter app = new BinaryConverter();

        // when
        String result = app.converter(number);

        // then
        assertEquals(result, expected);
    }
  }





