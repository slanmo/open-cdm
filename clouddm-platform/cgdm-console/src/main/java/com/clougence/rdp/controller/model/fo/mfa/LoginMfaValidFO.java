package com.clougence.rdp.controller.model.fo.mfa;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginMfaValidFO {

    @Min(value = 1, message = "min.mfaCode")
    @NotNull(message = "notnull.mfaCode")
    private Integer mfaCode;

    @NotBlank(message = "notnull.mfaPreActionToken")
    private String  mfaPreActionToken;
}
