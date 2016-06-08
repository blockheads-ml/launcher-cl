

package com.launcher.launcher.auth;

import java.io.IOException;
import java.util.List;

/**
 * A service for creating authenticated sessions.
 */
public interface LoginService {

    /**
     * Attempt to login with the given details.
     *
     * @param agent the game to authenticate for, such as "Minecraft"
     * @param id the login ID
     * @param password the password
     * @return a list of authenticated sessions, which corresponds to identities
     * @throws IOException thrown on I/O error
     * @throws InterruptedException thrown if interrupted
     * @throws AuthenticationException thrown on an authentication error
     */
    List<? extends Session> login(String agent, String id, String password)
            throws IOException, InterruptedException, AuthenticationException;

}
