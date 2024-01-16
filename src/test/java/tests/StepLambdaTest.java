package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubHomePage;
import pages.GitHubIssuesPage;
import pages.GitHubRepositryPage;
import pages.GitHubSearchPage;
import utils.StepsName;
import utils.UserData;

import static io.qameta.allure.Allure.step;

@DisplayName("Lambda Tests")
public class StepLambdaTest extends BaseTest {
    GitHubHomePage gitHubHomePage = new GitHubHomePage();
    UserData data = new UserData();
    StepsName stepName = new StepsName();
    GitHubIssuesPage gitHubIssuePage = new GitHubIssuesPage();
    GitHubSearchPage gitRepository = new GitHubSearchPage();
    GitHubRepositryPage gitHubRep = new GitHubRepositryPage();

    @DisplayName("In repository 'eroshenkoam/allure-example' in GitHUB must be  Last Issue")
    @Test
    public void searchLastIssueInRepositoryLambda() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step(stepName.step1, () -> {
            gitHubHomePage.openURL();
        });
        step(stepName.step2, () -> {
            gitHubHomePage.openSearchField();
        });
        step(stepName.step3, () -> {
            gitHubHomePage.searchRepository(data.repository);
        });
        step(stepName.step4, () -> {
            gitRepository.choosePage(data.repository);
        });
        step(stepName.step5, () -> {
            gitHubRep.goIssues();
        });
        step(stepName.step6, () -> {
            gitHubIssuePage.chooseIssue(data.issue);
        });
    }

    @DisplayName("In repository 'eroshenkoam/allure-example' in GitHUB must be  Last Issue ")
    @Test
    public void searchLastIssueInRepositoryLambda2th() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open GitHub home page", () -> {
            gitHubHomePage.openURL();
        });
        step("Click on search field", () -> {
            gitHubHomePage.openSearchField();
        });
        step("Sending a search request: " + data.repository, () -> {
            gitHubHomePage.searchRepository(data.repository);
        });
        step("Select the found page: " + data.repository, () -> {
            gitRepository.choosePage(data.repository);
        });
        step("Go to the section 'Issues'", () -> {
            gitHubRep.goIssues();
        });
        step("Checking for a issue " + data.issue, () -> {
            gitHubIssuePage.chooseIssue(data.issue);
        });
    }
}
