package com.clougence.rdp.controller.model.fo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import lombok.Data;

/**
 * @author bucketli 2021/1/11 10:34
 */
@Data
public class AddSubAccountFO {

    @NotBlank(message = "{notblank.username}")
    private String userName;

    @NotBlank(message = "{notblank.subaccount}")
    private String subAccount;

    @Min(value = 1, message = "{min.roleid}")
    private long   roleId;

    @NotBlank(message = "{notblank.password}")
    private String password;

    @NotBlank(message = "{notblank.email}")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "email format is illegal.")
    private String email;

    @NotBlank(message = "{notblank.phone}")
    @Pattern(regexp = "^\\d{5,20}$", message = "phone format is illegal.")
    private String phone;
}
