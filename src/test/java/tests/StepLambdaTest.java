package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubPage;
import pages.StepsName;
import pages.UserData;
import static io.qameta.allure.Allure.step;
@DisplayName("Lambda Tests")
public class StepLambdaTest extends BaseTest {
    GitHubPage gitHubPage = new GitHubPage();
    UserData data = new UserData();
    StepsName stepName = new StepsName();
    @DisplayName("In repository 'eroshenkoam/allure-example' in GitHUB must be  Last Issue")
    @Test
    public void findIssueNumber80inAllureExmple() {

        SelenideLogger.addListener("allure",new AllureSelenide());

        step(stepName.step1,()->{gitHubPage.openURL();
        });
        step(stepName.step2,()->{gitHubPage.openSearchField();
        });
        step(stepName.step3,()->{gitHubPage.searchRepository(data.repository);
        });
        step(stepName.step4,()->{gitHubPage.choosePage(data.repository);
        });
        step(stepName.step5,()->{gitHubPage.goIssues();
        });
        step(stepName.step6,()->{gitHubPage.chooseIssue(data.issue);
        });
    }
    @DisplayName("In repository 'eroshenkoam/allure-example' in GitHUB must be  Last Issue ")
    @Test
    public void findIssueNumber80inAllureExmple2th() {

        SelenideLogger.addListener("allure",new AllureSelenide());

        step("Open GitHub home page",()->{gitHubPage.openURL();
        });
        step("Click on search field",()->{gitHubPage.openSearchField();
        });
        step("Sending a search request: "+data.repository,()->{gitHubPage.searchRepository(data.repository);
        });
        step("Select the found page: "+data.repository,()->{gitHubPage.choosePage(data.repository);
        });
        step("Go to the section 'Issues'",()->{gitHubPage.goIssues();
        });
        step("Checking for a issue "+data.issue,()->{gitHubPage.chooseIssue(data.issue);
        });
    }
}
