package io.alfredux.auth.service;

public interface AuthenticationProvider {
	String authenticate(String username, String password);
}
