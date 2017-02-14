
public class BinaryConverterTest {

    @DataProvider(name = "numbers")
    public Object[][] numbers() {
        return new Object[][]{
                {3}
        };
    }

    @Test(dataProvider = "numbers")
    public void correctConversionTest(int number, String expected) {
        // given
        BinaryConverter app = new BinaryConverter();

        // when
        String result = app.stringConverter();

        // then
        assertEquals(result, expected);
    }
}

