package executor.service;

import executor.service.model.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StepExecutionClickCSS implements StepExecution {

    @Override
    public String getStepAction() {
        return "click";
    }

    @Override
    public void step(WebDriver webDriver, Step step) {
        String cssSelector = step.getValue();
        WebElement element = webDriver.findElement(By.cssSelector(cssSelector));
        element.click();
    }
}
