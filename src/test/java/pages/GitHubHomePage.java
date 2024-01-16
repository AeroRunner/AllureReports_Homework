package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubHomePage {
    public SelenideElement
            searchButton = $(".header-search-button"),
            searchField = $("#query-builder-test");

    public String homePage = "https://www.github.com";

    public GitHubHomePage openURL() {
        open(homePage);
        return this;
    }

    public GitHubHomePage openSearchField() {
        searchButton.click();
        return this;
    }

    public GitHubHomePage searchRepository(String value) {
        searchField.setValue(value).submit();
        return this;
    }

}
