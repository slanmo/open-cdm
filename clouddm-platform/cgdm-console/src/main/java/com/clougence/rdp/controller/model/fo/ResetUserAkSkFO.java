package com.clougence.rdp.controller.model.fo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import com.clougence.rdp.controller.model.enumeration.VerifyType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bucketli 2021/10/12 15:10
 */
@Getter
@Setter
public class ResetUserAkSkFO {

    @NotBlank(message = "{notblank.verifycode}")
    private String     verifyCode;

    @NotNull(message = "{notnull.verifytype}")
    private VerifyType verifyType;
}
