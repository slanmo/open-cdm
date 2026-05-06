package com.clougence.rdp.controller.model.fo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class CheckDriverVersionFO {

    @Min(value = 1, message = "cluster id must large than 0.")
    private Long   clusterId;

    @NotBlank(message = "{notblank.driverfamily}")
    private String driverFamily;

    @NotBlank(message = "{notblank.driverversion}")
    private String driverVersion;
}
