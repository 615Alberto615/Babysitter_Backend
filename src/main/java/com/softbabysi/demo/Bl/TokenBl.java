package com.softbabysi.demo.Bl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.softbabysi.demo.Dto.TokenDto;
import com.softbabysi.demo.Dto.UserLoginDto;

import java.util.Date;

public class TokenBl {
    public static final String KEY = "AppSoftBabySI";

    private String generateToken(Integer userId, Integer seRoleId, String type, int minutes){
        try {
            Algorithm algorithm = Algorithm.HMAC256(KEY);
            String token  = JWT.create()
                    .withIssuer("www.softbabysi.com")
                    .withClaim("userId", userId)
                    .withClaim("seRoleId", seRoleId)
                    .withClaim("type", type)
                    .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * minutes))
                    .sign(algorithm);
            return token;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error al generar el token " + userId + " " + seRoleId + " " + type + " " + minutes);
            throw new RuntimeException("Error al generar el token", e);
        }
    }

    public boolean validateToken(String token){
        if(token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        DecodedJWT decodedJWT;
        try {
            Algorithm algorithm = Algorithm.HMAC256(KEY);
            JWTVerifier verifier = JWT.require(algorithm)
                    // specify an specific claim validations
                    .withIssuer("www.softbabysi.com")
                    // reusable verifier instance
                    .build();
            decodedJWT = verifier.verify(token);
            return true;
        } catch (JWTVerificationException exception){
            System.err.print("Token invalido: " + exception.getMessage());
            return false;
        }
    }
}
