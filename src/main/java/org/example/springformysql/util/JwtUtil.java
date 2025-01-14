package org.example.springformysql.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;


import java.util.Date;
import java.util.Map;

import static javax.crypto.Cipher.SECRET_KEY;

public class JwtUtil {

    private static final String key = "zyc123" ;

    /**
     * Generate a JWT token
     * @param claims Map of claims to include in the token
     * @return Generated JWT token
     */
    public static String genToken(Map<String, Object> claims) {
        return JWT.create()
                .withClaim("claim",claims)
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000*60*60*12))
                .sign(Algorithm.HMAC256(key));
    }

    /**
     * Parse and extract claims from a JWT token
     * @param token The JWT token
     * @return Claims extracted from the token
     */
    public static Map<String,Object> parseToken(String token) {
        return JWT.require(Algorithm.HMAC256(key))
                .build()
                .verify(token)
                .getClaim("claim")
                .asMap() ;

    }



}

