package io.alfredux.auth.domain.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExceptionResponse extends ApiResponse{

	private String errorCode;

}
