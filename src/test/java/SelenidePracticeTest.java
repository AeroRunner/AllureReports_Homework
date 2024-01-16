import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubPage;
import pages.UserData;

import static com.codeborne.selenide.Selenide.$;

public class SelenidePracticeTest extends BaseTest {
    GitHubPage gitHubPage = new GitHubPage();
    UserData userData = new UserData();
    @DisplayName("In chapter 'Eroshenkoam' in GitHUB must be Issue N80")
    @Test
    public void findIssueNumber80inAllureExmple() {
        gitHubPage.openURL();
        gitHubPage.openSearchField();
        gitHubPage.useSearchField(userData.searchRequest);
        gitHubPage.choosePage(userData.searchRequest);
        gitHubPage.goIssues();
        gitHubPage.chooseIssue(userData.issueNumber);

}
}
