package JavaTechnoStudy.day41;

import org.junit.Assert;
import org.junit.Test;

public class TestUser {

    @Test
    public void testGetUsername() {
        User user = new User("admintechno.com", "123456");


        //check username
        Assert.assertEquals("admintechno.com", user.getUsername());

        user.setUsername("dos");

        Assert.assertEquals("dos", user.getUsername());
    }
}