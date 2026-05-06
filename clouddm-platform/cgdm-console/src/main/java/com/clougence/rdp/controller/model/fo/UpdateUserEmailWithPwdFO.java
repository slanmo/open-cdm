package com.clougence.rdp.controller.model.fo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import lombok.Data;

@Data
public class UpdateUserEmailWithPwdFO {

    @NotNull(message = "{notnull.email}")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "{pattern.email}")
    private String email;

    @NotBlank(message = "{notblank.password}")
    private String password;
}
