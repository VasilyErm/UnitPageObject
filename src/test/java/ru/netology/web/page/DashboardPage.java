package ru.netology.web.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.val;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    private SelenideElement header = $("[data-test-id=dashboard]");

    public DashboardPage(){
        header.should(visible);
    }
    private ElementsCollection cards = $$(".list__item");
    public int getFirstCardBalance() {
        val text = cards.first().text();   //text: "**** **** **** 0001, баланс: 10000 р. \nПополнить
        return 0;
    }
}
