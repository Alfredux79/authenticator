package io.alfredux.auth.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("jwtTokenProvider")
public class JWTAuthenticationProvider implements AuthenticationProvider {

	private final Logger log = LoggerFactory.getLogger(JWTAuthenticationProvider.class);
	
	@Override
	public String authenticate(String username, String password) {
		log.info("Authenticating user: {}",username);
		return "token";
	}

}
