package com.clougence.clouddm.init.component.scripts;

import java.sql.Connection;
import java.sql.Statement;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

public class V202605070049__test_error_probe extends BaseJavaMigration {

    public static final String INJECT_TEST_ERROR_PROPERTY = "clouddm.init.flyway.inject-test-error";

    @Override
    public void migrate(Context context) throws Exception {
        if (!Boolean.parseBoolean(System.getProperty(INJECT_TEST_ERROR_PROPERTY, "false"))) {
            return;
        }

        Connection connection = context.getConnection();
        try (Statement statement = connection.createStatement()) {
            statement.execute("SELECT * FROM __clouddm_intentional_failure_probe__");
        }
    }
}