package com.clougence.rdp.controller.model.fo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;

/**
 * @author wanshao create time is 2021/1/18
 **/
@Data
public class AddDsEnvFO {

    @NotBlank(message = "{notblank.envname}")
    private String envName;

    @Size(max = 500, message = "description length need less than 500")
    private String description;

    @Min(value = 1, message = "{min.querylimit}")
    private Long   queryLimit;
}
