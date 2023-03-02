package executor.service;

import executor.service.model.Step;
import org.junit.Assert;
import org.junit.Test;

public class StepTest {

    private final String action = "click";
    private final String value = "button";

    @Test
    public void testObjectsAreEqual() {
        Step expectedObject = new Step(action, value);
        Step actualObject = new Step(action, value);
        Assert.assertEquals(expectedObject, actualObject);
    }

    @Test
    public void testConstructorAndGetters() {
        Step step = new Step(action, value);
        Assert.assertEquals(action, step.getAction());
        Assert.assertEquals(value, step.getValue());
    }

    @Test
    public void testSetters() {
        Step step = new Step();
        step.setAction(action);
        step.setValue(value);
        Assert.assertEquals(action, step.getAction());
        Assert.assertEquals(value, step.getValue());
    }

    @Test
    public void testEqualsAndHashCode() {
        Step expectedObject = new Step(action, value);
        Step actualObject = new Step(action, value);
        Assert.assertEquals(expectedObject, actualObject);
        Assert.assertEquals(expectedObject.hashCode(), actualObject.hashCode());
    }

    @Test
    public void testToString() {
        Step step = new Step(action, value);
        String expected = "Step{action='click', value='button'}";
        Assert.assertEquals(expected, step.toString());
    }

    @Test
    public void testEqualsWithSameObject() {
        Step step = new Step(action, value);
        Assert.assertEquals(step, step);
    }

    @Test
    public void testEqualsWithDifferentObjectType() {
        Step actualObject = new Step(action, value);
        String otherObject = "not a Step object";
        Assert.assertNotEquals(actualObject, otherObject);
    }

    @Test
    public void testNotEquals() {
        Step expectedObject = new Step(action, value);
        Step actualObject = new Step("input", "email");
        Assert.assertNotEquals(expectedObject, actualObject);
    }

    @Test
    public void testEmptyConstructor() {
        Step step = new Step();
        Assert.assertNull(step.getAction());
        Assert.assertNull(step.getValue());
    }

    @Test
    public void testSetActionWithNull() {
        Step step = new Step(action, value);
        step.setAction(null);
        Assert.assertNull(step.getAction());
    }

    @Test
    public void testSetValueWithNull() {
        Step step = new Step(action, value);
        step.setValue(null);
        Assert.assertNull(step.getValue());
    }

    @Test
    public void testToStringWithNullValues() {
        Step step = new Step(null, null);
        String expected = "Step{action='null', value='null'}";
        Assert.assertEquals(expected, step.toString());
    }
}
