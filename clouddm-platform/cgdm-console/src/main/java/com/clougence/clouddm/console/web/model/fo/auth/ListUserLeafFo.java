package com.clougence.clouddm.console.web.model.fo.auth;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListUserLeafFo {

    @NotNull(message = "levels must not null")
    private List<String> levels;

    @NotBlank(message = "leafType must not blank")
    private String       leafType;

    private String       pattern;

    private String       uid;

}
