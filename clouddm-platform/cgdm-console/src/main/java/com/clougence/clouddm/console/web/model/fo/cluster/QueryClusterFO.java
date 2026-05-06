package com.clougence.clouddm.console.web.model.fo.cluster;

import jakarta.validation.constraints.Min;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bucketli 2021/1/7 14:28
 */
@Getter
@Setter
public class QueryClusterFO {

    @Min(value = 1, message = "{min.clusterid}")
    private long clusterId;
}
