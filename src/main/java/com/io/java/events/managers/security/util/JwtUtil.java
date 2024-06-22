package com.io.java.events.managers.security.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

public interface JwtUtil {
    boolean isValidToken(String jwt);
    Authentication authenticate(String jwt);
    String encode(UserDetails userDetails);
}
