import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubPage;
import pages.UserData;

public class SelenideLambdaTest extends BaseTest {
    GitHubPage gitHubPage = new GitHubPage();
    UserData userData = new UserData();
    @DisplayName("In chapter 'Eroshenkoam' in GitHUB must be Issue N80")
    @Test
    public void findIssueNumber80inAllureExmple() {
        SelenideLogger.addListener("allure",new AllureSelenide());
        gitHubPage.openURL();
        gitHubPage.openSearchField();
        gitHubPage.useSearchField(userData.searchRequest);
        gitHubPage.choosePage(userData.searchRequest);
        gitHubPage.goIssues();
        gitHubPage.chooseIssue(userData.issueNumber);

    }
}
