package com.clougence.rdp.controller.model.fo.mfa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CloseMfaSettingsFO {

    @NotBlank(message = "{notblank.mfaCode}")
    @Pattern(regexp = "^\\d{6}$", message = "{pattern.mfaCode}")
    private String mfaCode;
}
