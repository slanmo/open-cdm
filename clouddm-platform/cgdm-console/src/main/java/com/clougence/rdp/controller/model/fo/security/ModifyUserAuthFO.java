package com.clougence.rdp.controller.model.fo.security;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import com.clougence.clouddm.sdk.security.auth.AuthKind;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bucketli 2024/2/21 09:57:43
 */
@Getter
@Setter
public class ModifyUserAuthFO {

    @NotNull(message = "authKind can not be null.")
    private AuthKind                  authKind;

    @NotBlank(message = "targetUid can not be blank.")
    private String                    targetUid;

    private List<ModifyAuthForAppend> appends;

    private List<ModifyAuthForUpdate> updates;

    private List<ModifyAuthForDelete> deletes;
}
