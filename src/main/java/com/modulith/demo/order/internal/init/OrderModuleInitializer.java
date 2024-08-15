package com.modulith.demo.order.internal.init;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationVersion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.modulith.ApplicationModuleInitializer;
import org.springframework.stereotype.Component;

@Component
public class OrderModuleInitializer implements ApplicationModuleInitializer {

    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.username}")
    private String dbUser;
    @Value("${spring.datasource.password}")
    private String dbPassword;

    @Override
    public void initialize() {
        Flyway migration = Flyway.configure()
                        .dataSource(dbUrl, dbUser, dbPassword)
                        .locations("classpath:db/migration/orders")
                        .target(MigrationVersion.LATEST)
                        .baselineOnMigrate(true)
                        .schemas("orders")
                        .load();
        migration.migrate();
    }
}
