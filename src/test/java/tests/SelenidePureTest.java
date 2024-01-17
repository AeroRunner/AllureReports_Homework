package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubHomePage;
import pages.GitHubIssuesPage;
import pages.GitHubRepositryPage;
import pages.GitHubSearchPage;
import utils.UserData;


@DisplayName("Only Selenide Test")
public class SelenidePureTest extends BaseTest {
    GitHubHomePage gitHubHomePage = new GitHubHomePage();
    GitHubIssuesPage gitHubIssuePage = new GitHubIssuesPage();
    UserData userData = new UserData();
    GitHubSearchPage gitRepository = new GitHubSearchPage();
    GitHubRepositryPage gitHubRep = new GitHubRepositryPage();

    @DisplayName("In repository 'eroshenkoam/allure-example' in GitHUB must be  Last Issue")
    @Test
    public void searchLastIssueInRepositoryOnlySelenide() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        gitHubHomePage.openURL();
        gitHubHomePage.openSearchField();
        gitHubHomePage.searchRepository(userData.repository);
        gitRepository.choosePage(userData.repository);
        gitHubRep.goIssues();
        gitHubIssuePage.chooseIssue(userData.issue);

    }
}
