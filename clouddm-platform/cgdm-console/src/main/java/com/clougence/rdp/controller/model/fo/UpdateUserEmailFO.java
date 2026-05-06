package com.clougence.rdp.controller.model.fo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import com.clougence.rdp.controller.model.enumeration.VerifyType;

import lombok.Data;

@Data
public class UpdateUserEmailFO {

    @NotNull(message = "{notnull.email}")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "{pattern.email}")
    private String     email;

    @NotBlank(message = "{notblank.verifycode}")
    private String     verifyCode;

    @NotNull(message = "{notnull.verifycodetype}")
    private VerifyType verifyType;
}
