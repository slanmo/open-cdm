package com.clougence.clouddm.init.component.scripts;

import java.util.List;

import com.clougence.clouddm.init.component.flyway.AbstractUpgradeJavaMigration;

public class V202605070031__init_data extends AbstractUpgradeJavaMigration {

    @Override
    public List<String> collectScript() {
        return List.of();
    }
}
