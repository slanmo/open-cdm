package com.clougence.rdp.controller.model.fo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;

/**
 * @author bucketli 2021/1/11 11:17
 */
@Data
public class ResetOpPasswdFO {

    @NotBlank(message = "{notblank.oppassword}")
    @Size(min = 8, max = 32, message = "operation password must between 8~32 character.")
    private String opPassword;

    @NotBlank(message = "{notblank.verifycode}")
    private String verifyCode;
}
