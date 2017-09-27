package io.alfredux.auth.controller;

import io.alfredux.auth.domain.request.LoginRequest;
import io.alfredux.auth.domain.response.ApiResponse;
import io.alfredux.auth.domain.response.AuthenticationResponse;
import io.alfredux.auth.service.AuthenticationProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

/**
 * Created by Alfredo on 28/09/2017.
 */
@RestController
public class AuthController {

    private final Logger log = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    AuthenticationProvider jwtTokenProvider;

    @PostMapping("/authenticate")
    ResponseEntity<AuthenticationResponse> authenticate(@RequestBody @Valid LoginRequest loginRequest) {
        log.debug("called auth controller {}", loginRequest);
        String token = jwtTokenProvider.authenticate(loginRequest.getLogin(), loginRequest.getPassword());
        return new ResponseEntity<>(new AuthenticationResponse(token,""), HttpStatus.ACCEPTED);
    }

    @GetMapping("/echo")
    ResponseEntity<ApiResponse> echo() {
        log.debug("called echo controller {}");
        ApiResponse apiResponse = new ApiResponse(LocalDateTime.now(),"ECHO");
        return new ResponseEntity<>(apiResponse,HttpStatus.ACCEPTED);
    }

}