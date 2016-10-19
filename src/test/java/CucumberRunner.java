import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Maksim Ruts on 10/20/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:com/nivafex/cucumber/cash_withdrawal.feature",
        glue = "classpath:com.nivafex.cucumber"
)
public class CucumberRunner {
}
