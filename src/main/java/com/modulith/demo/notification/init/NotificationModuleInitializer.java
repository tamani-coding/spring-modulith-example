package com.modulith.demo.notification.init;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationVersion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.modulith.ApplicationModuleInitializer;
import org.springframework.stereotype.Component;

@Component
public class NotificationModuleInitializer implements ApplicationModuleInitializer {

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
                        .locations("classpath:db/migration/notification")
                        .target(MigrationVersion.LATEST)
                        .baselineOnMigrate(true)
                        .schemas("notification")
                        .load();
        migration.migrate();
    }
}
