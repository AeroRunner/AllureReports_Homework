package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class WebStepsPage {
    GitHubPage gitHubPage = new GitHubPage();
    @Step("Open GitHub home page")
    public void openMainPage(){
        gitHubPage.openURL();
    }
    @Step("Click on search field")
    public void openSearchField(){
        gitHubPage.openSearchField();
    }
    @Step("Sending a search request:{repository}")
    public void searchRepository(String repository){
        $("#query-builder-test").setValue(repository).submit();
    }
    @Step("Select the found page:{repository}")
    public void choosePageLink(String repository){
        $(By.linkText(repository)).click();
    }
    @Step("Go to the section 'Issues'")
    public void openIssuesTab(){
      gitHubPage.goIssues();
    }
    @Step("Checking for a issue {issueName}")
    public void shuldSeeIssueWitchName(String issueName){
        $(withText(issueName)).should(Condition.exist);
    }
}
