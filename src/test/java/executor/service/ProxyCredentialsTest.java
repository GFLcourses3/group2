package executor.service;

import executor.service.model.ProxyCredentials;
import org.junit.Assert;
import org.junit.Test;


public class ProxyCredentialsTest {

    private final String username = "username";
    private final String password = "password";

    @Test
    public void testEqualsDTO() {
        ProxyCredentials expectedObject = new ProxyCredentials(username, password);
        ProxyCredentials actualObject = new ProxyCredentials(username, password);
        Assert.assertEquals(expectedObject, actualObject);
    }

    @Test
    public void testNotEqualsDTO() {
        ProxyCredentials expectedObject = new ProxyCredentials(username, password);
        ProxyCredentials actualObject = new ProxyCredentials("testUsername", "testPassword");
        Assert.assertNotEquals(expectedObject, actualObject);
    }

    @Test
    public void testConstructor() {
        ProxyCredentials proxyCredentials = new ProxyCredentials(username, password);
        Assert.assertEquals(username, proxyCredentials.getUsername());
        Assert.assertEquals(password, proxyCredentials.getPassword());
    }

    @Test
    public void testSettersAndGetters() {
        ProxyCredentials proxyCredentials = new ProxyCredentials();
        proxyCredentials.setUsername(username);
        proxyCredentials.setPassword(password);
        Assert.assertEquals(username, proxyCredentials.getUsername());
        Assert.assertEquals(password, proxyCredentials.getPassword());
    }

    @Test
    public void testHashCode() {
        ProxyCredentials expectedObject = new ProxyCredentials(username, password);
        ProxyCredentials actualObject = new ProxyCredentials(username, password);
        Assert.assertEquals(expectedObject.hashCode(), actualObject.hashCode());
    }

    @Test
    public void testToString() {
        ProxyCredentials proxyCredentials = new ProxyCredentials(username, password);
        String expected = "ProxyCredentials{username='username', password='password'}";
        Assert.assertEquals(expected, proxyCredentials.toString());
    }

    @Test
    public void testEmptyConstructor() {
        ProxyCredentials proxyCredentials = new ProxyCredentials();
        Assert.assertNull(proxyCredentials.getUsername());
        Assert.assertNull(proxyCredentials.getPassword());
    }

    @Test
    public void testSetUsernameWithNull() {
        ProxyCredentials proxyCredentials = new ProxyCredentials(username, password);
        proxyCredentials.setUsername(null);
        Assert.assertNull(proxyCredentials.getUsername());
    }

    @Test
    public void testSetPasswordWithNull() {
        ProxyCredentials proxyCredentials = new ProxyCredentials(username, password);
        proxyCredentials.setPassword(null);
        Assert.assertNull(proxyCredentials.getPassword());
    }

    @Test
    public void testToStringWithNullValues() {
        ProxyCredentials proxyCredentials = new ProxyCredentials(null, null);
        String expected = "ProxyCredentials{username='null', password='null'}";
        Assert.assertEquals(expected, proxyCredentials.toString());
    }
}