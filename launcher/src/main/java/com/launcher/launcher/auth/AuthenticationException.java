

package com.launcher.launcher.auth;

import com.launcher.launcher.LauncherException;

/**
 * Thrown on authentication error.
 */
public class AuthenticationException extends LauncherException {

    public AuthenticationException(String message, String localizedMessage) {
        super(message, localizedMessage);
    }

    public AuthenticationException(Throwable cause, String localizedMessage) {
        super(cause, localizedMessage);
    }
}
