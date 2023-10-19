package runners;

import configuration.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import java.net.MalformedURLException;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        snippets = CAMELCASE,
        features = "./src/test/resources/features/Telefone.feature",
        glue = {"steps"},
        monochrome = true,
        plugin = {
                "pretty",
                "json:target/jsonReports/cucumber-report.json"
        }
)
public class AndroidTest {
    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DriverFactory.createDriverByParameter("Android");
    }

    @AfterClass
    public static void tearDown(){
        DriverFactory.quitDriver();
    }
}
