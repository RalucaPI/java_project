package dataProvider;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {
    @DataProvider(name = "calculatorPositiveDataProvider")
    public Object[][] calculatorDataProvider(){
        return new Object[][]{
                {1, 3, "+", 4},
                {2,5, "-", -3},
                {2,6, "*", 12},
                {2,3, "/", 0.666666}
        };
    }
}
