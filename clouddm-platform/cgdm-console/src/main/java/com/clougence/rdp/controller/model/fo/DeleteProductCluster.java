package com.clougence.rdp.controller.model.fo;

import jakarta.validation.constraints.Min;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bucketli 2023/11/23 17:17:10
 */
@Getter
@Setter
public class DeleteProductCluster {

    @Min(value = 1, message = "id must be large than 0.")
    private long id;
}
