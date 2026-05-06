package com.clougence.rdp.service.openapi.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiUpdateAliyunRdsAkSkFO {

    @Min(value = 1, message = "{min.datasourceid}")
    private long   dataSourceId;

    @NotBlank(message = "{notblank.accesskey}")
    private String accessKey;

    @NotBlank(message = "{notblank.secretkey}")
    private String secretKey;
}
