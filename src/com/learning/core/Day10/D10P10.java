package com.learning.core.Day10;
import org.junit.Test;

class UserProfile {
    public void validateUsername(String name) {
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Username should contains characters.");
        }
    }

    public void validatePassword(String password) {
        if (password.length() != 8 || !password.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Password should be 8 characters long with a combination of alphabets and digits.");
        }
    }
}
public class D10P10 {
	private static final UserProfile userProfile = new UserProfile();

    @Test(timeout = 0)
    public void testName() {
        userProfile.validateUsername("Nandinis");
    }

    @Test(timeout = 0)
    public void testPassword() {
       userProfile.validatePassword("Nan5c1v7");
    
    }

}
