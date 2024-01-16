package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubPage;
import pages.UserData;
@DisplayName("Only Selenide Test")
public class SelenidePureTest extends BaseTest {
    GitHubPage gitHubPage = new GitHubPage();
    UserData userData = new UserData();
    @DisplayName("In repository 'eroshenkoam/allure-example' in GitHUB must be  Last Issue")
    @Test
    public void findIssueNumber80inAllureExmple() {

        SelenideLogger.addListener("allure",new AllureSelenide());

        gitHubPage.openURL();
        gitHubPage.openSearchField();
        gitHubPage.searchRepository(userData.repository);
        gitHubPage.choosePage(userData.repository);
        gitHubPage.goIssues();
        gitHubPage.chooseIssue(userData.issue);

}
}
