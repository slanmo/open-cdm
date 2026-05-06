package com.clougence.rdp.controller.model.fo.role;

import java.util.List;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bucketli 2021/1/11 15:13
 */
@Getter
@Setter
public class UpdateRoleFO {

    @Min(value = 1, message = "{min.roleid}")
    private long         roleId;

    @NotBlank(message = "{notblank.rolename}")
    private String       roleName;

    @NotEmpty(message = "{notempty.authlabellist}")
    private List<String> authLabelList;

}
