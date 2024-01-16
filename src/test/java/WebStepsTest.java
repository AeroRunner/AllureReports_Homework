import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.UserData;
import pages.WebStepsPage;
@DisplayName("Only Web Steps Test")
public class WebStepsTest extends BaseTest{
    UserData data = new UserData();
    @DisplayName("In repository 'eroshenkoam/allure-example' in GitHUB must be  Last Issue")
    @Test
    public void webStepsIssueSearchTest(){

        SelenideLogger.addListener("allure",new AllureSelenide());
        WebStepsPage steps = new WebStepsPage();

        steps.openMainPage();
        steps.openSearchField();
        steps.searchRepository(data.repository);
        steps.choosePageLink(data.repository);
        steps.openIssuesTab();
        steps.shuldSeeIssueWitchName(data.issue);
    }

}
