package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FailedToLineTest extends BaseTest {
    FeedbackPage feedbackPage = new FeedbackPage(driver);

    @Test
    public void secondLine()  {
        feedbackPage.clickRoot();
        feedbackPage.switchFrame();
        feedbackPage.setScore(10);
        feedbackPage.chooseEmoji(3);
        feedbackPage.setNextFirstLine();
        feedbackPage.setListen();
        feedbackPage.setAggrementFalse();
        feedbackPage.setFavorite();
        feedbackPage.setNextSecondLine();
        Assert.assertEquals("1. adıma geri döndünüz", feedbackPage.component_one, feedbackPage.component_one_reply);
    }
}
