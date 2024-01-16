package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubPage {
    UserData userData = new UserData();
    public SelenideElement
    searchButton= $(".header-search-button"),
    searchField = $("#query-builder-test"),
    issuesButton = $("#issues-tab");
    public GitHubPage openURL(){
        open("https://www.github.com");
        return this;
    }
    public GitHubPage openSearchField(){
        searchButton.click();
        return this;
    }
    public GitHubPage useSearchField(String value){
        searchField.setValue(value).submit();
        return this;
    }
    public GitHubPage choosePage(String value){
        $(By.linkText(value)).click();
        return this;
    }
    public GitHubPage goIssues(){
        issuesButton.click();
        return this;
    }
    public GitHubPage chooseIssue(String value){
        $(withText(value)).should(Condition.exist);
        return this;
    }
}
