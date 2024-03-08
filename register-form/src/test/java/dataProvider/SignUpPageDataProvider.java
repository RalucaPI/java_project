package dataProvider;



import org.testng.annotations.DataProvider;

public class SignUpPageDataProvider {

    @DataProvider(name = "signUpPageDataProvider")
    public Object[][] signUpPageDataProvider() {
        return new Object[][] {
                {"chrome", true},
                {"firefox", false},
                {"edge", true},
                {"safari", false}
        };
    }
}