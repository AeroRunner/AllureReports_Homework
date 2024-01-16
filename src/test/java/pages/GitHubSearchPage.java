package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GitHubSearchPage {
    public GitHubSearchPage choosePage(String value) {
        $(By.linkText(value)).click();
        return this;
    }
}
