package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class GitHubIssuesPage {
    public GitHubIssuesPage chooseIssue(String value) {
        $(withText(value)).should(Condition.exist);
        return this;
    }

}
