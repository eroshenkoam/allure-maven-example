package io.eroshenkoam.samples;

import io.qameta.allure.Step;
import org.junit.Test;

/**
 * eroshenkoam
 * 12.01.18
 */
public class SecondTest {

    @Test
    public void secondTestMethod() {
        firstStep();
    }

    @Step
    public void firstStep() {
        secondStep();
    }

    @Step
    public void secondStep() {

    }


}
