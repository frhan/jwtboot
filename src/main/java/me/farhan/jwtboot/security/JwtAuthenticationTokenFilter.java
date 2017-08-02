package me.farhan.jwtboot.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

  private final Log logger = LogFactory.getLog(this.getClass());

  @Autowired
  private UserDetailsService userDetailsService;

  @Autowired
  private JwtTokenUtil jwtTokenUtil;

  @Value("${jwt.header}")
  private String tokenHeader;

  @Override
  protected void doFilterInternal(HttpServletRequest httpServletRequest,
                                  HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

  }
}
