package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubRepositryPage {
    public SelenideElement issuesButton = $("#issues-tab");

    public GitHubRepositryPage goIssues() {
        issuesButton.click();
        return this;
    }
}
