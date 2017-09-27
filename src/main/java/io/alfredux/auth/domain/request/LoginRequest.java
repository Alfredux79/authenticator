package io.alfredux.auth.domain.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by Alfredo on 28/09/2017.
 */
@Data
public class LoginRequest {

    @NotNull
    private String login;

    @NotNull
    private String password;


}
