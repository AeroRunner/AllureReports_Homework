package utils;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.GitHubHomePage;
import pages.GitHubRepositryPage;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class WebStepsPage {
    GitHubHomePage gitHubHomePage = new GitHubHomePage();
    GitHubRepositryPage gitHubRep = new GitHubRepositryPage();

    @Step("Open GitHub home page")
    public void openMainPage() {
        gitHubHomePage.openURL();
    }

    @Step("Click on search field")
    public void openSearchField() {
        gitHubHomePage.openSearchField();
    }

    @Step("Sending a search request:{repository}")
    public void searchRepository(String repository) {
        $("#query-builder-test").setValue(repository).submit();
    }

    @Step("Select the found page:{repository}")
    public void choosePageLink(String repository) {
        $(By.linkText(repository)).click();
    }

    @Step("Go to the section 'Issues'")
    public void openIssuesTab() {
        gitHubRep.goIssues();
    }

    @Step("Checking for a issue : {issueName}")
    public void shuldSeeIssueWitchName(String issueName) {
        $(withText(issueName)).should(Condition.exist);
    }
}
