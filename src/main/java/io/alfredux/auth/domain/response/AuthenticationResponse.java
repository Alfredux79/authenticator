package io.alfredux.auth.domain.response;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AuthenticationResponse extends ApiResponse{


	private String token;
	private String renewToken;

}
