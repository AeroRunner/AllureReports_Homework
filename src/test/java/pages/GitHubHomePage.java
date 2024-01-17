package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;


public class GitHubHomePage {
    public SelenideElement
            searchButton = $(".header-search-button"),
            searchField = $("#query-builder-test");


    public GitHubHomePage openURL() {
        Selenide.open("");
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
