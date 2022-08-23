package org.example;

import org.junit.Assert;
import org.junit.Test;

public class LineToLineTest extends BaseTest {
    FeedbackPage feedbackPage = new FeedbackPage(driver);

    @Test
    public void firstLine()  {
        feedbackPage.clickRoot();
        feedbackPage.switchFrame();
        feedbackPage.setScore(10);
        feedbackPage.chooseEmoji(3);
        feedbackPage.setNextFirstLine();
        feedbackPage.setListen();
        feedbackPage.setAggrementTrue();
        feedbackPage.setFavorite();
        feedbackPage.setNextSecondLine();
        feedbackPage.setEmail();
        feedbackPage.setName();
        feedbackPage.setPhone();
        feedbackPage.setNextLastLine();
    }

}
