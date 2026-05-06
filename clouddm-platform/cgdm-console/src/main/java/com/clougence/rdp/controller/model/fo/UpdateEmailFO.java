package com.clougence.rdp.controller.model.fo;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateEmailFO {

    @NotBlank(message = "{notblank.oldemail}")
    private String oldEmail;

    @NotBlank(message = "{notblank.newemail}")
    private String newEmail;
}
