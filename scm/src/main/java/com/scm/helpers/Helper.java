package com.scm.helpers;

import org.springframework.security.core.Authentication;

public class Helper {

    public static String getEmailOfLoggedInUser(Authentication authentication) {

        return authentication.getName();
    }

}
