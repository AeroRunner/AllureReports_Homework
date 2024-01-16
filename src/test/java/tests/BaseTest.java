package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static io.qameta.allure.Allure.step;

public class BaseTest {
    public static String size = "1920x1080";
    public static String loadStr = "eager";

    @BeforeAll
    public static void testsSetUP() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("SetUp BrowserSize = " + size, () -> {
            Configuration.browserSize = size;
        });
        step("SetUP pageLoadStrategy = " + loadStr, () -> {
            Configuration.pageLoadStrategy = loadStr;
        });

    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}
