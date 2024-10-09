import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920*1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("QQ");
        $("#userEmail").setValue("luzan@mail.com");
        $("#currentAddress").setValue("ulica");
        $("#permanentAddress").setValue("prosperkt");
        $("#submit").click();

        $("#output #name").shouldHave(text("QQ"));
        $("#output #email").shouldHave(text("luzan@mail.com"));
        $("#output #currentAddress").shouldHave(text("ulica"));
        $("#output #permanentAddress").shouldHave(text("prosperkt"));


    }
}