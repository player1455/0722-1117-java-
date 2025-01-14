package org.example.springformysql.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.springformysql.domain.Result;
import org.example.springformysql.util.JwtUtil;
import org.example.springformysql.util.ThreadLocalUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Map;

@Component
public class LoginInterceptors implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //令牌验证
        String token = request.getHeader("Authorization");
        try {
            Map<String, Object> claims = JwtUtil.parseToken(token) ;
            ThreadLocalUtil.set(claims);
            return true ;
        } catch (Exception e) {
            response.setStatus(401);
            return false;
        }
    }
}
