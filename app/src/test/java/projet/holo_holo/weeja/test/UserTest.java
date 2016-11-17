package projet.holo_holo.weeja.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import projet.holo_holo.weeja.model.User;

import static org.junit.Assert.*;

/**
 * Created by Alex on 17/11/2016.
 */
public class UserTest {

    User user;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void emailValidOK() throws Exception {
        user = new User("test@test.fr","password",null);
        assertTrue(user.emailValid());
    }

    @Test
    public void emailValidKO() throws Exception {
        user = new User("testtest.fr","password",null);
        assertFalse(user.emailValid());
    }

    @Test
    public void passwordValidOK() throws Exception {
        user = new User("test@test.fr","password",null);
        assertTrue(user.passwordValid());
    }

    @Test
    public void passwordValidKO() throws Exception {
        user = new User("test@test.fr","pas",null);
        assertFalse(user.passwordValid());
    }
}