module GymTracker {
    // JavaFX modules required for the GUI
    requires javafx.controls;   // Provides UI controls like buttons, tables, etc.
    requires javafx.fxml;       // Enables loading FXML files for defining UI layouts

    // Modules required for JPA and Hibernate
    requires jakarta.persistence;       // JPA annotations and interfaces (e.g., @Entity)
    requires java.sql;                  // JDBC API for database access
    requires org.hibernate.orm.core;    // Hibernate core ORM engine
    requires java.naming;               // Required by Hibernate for JNDI-related classes

    // Open packages to allow runtime reflection (used by JavaFX and Hibernate)
    opens ui to javafx.fxml;                // Allows JavaFX to inject FXML controllers
    opens entity to org.hibernate.orm.core; // Allows Hibernate to access entity fields and constructors

    // Exported packages, so other modules or layers (like UI) can use them
    exports ui;
    exports entity;
    exports repository;
    exports service;
    exports util;
    exports ui.controller;
    opens ui.controller to javafx.fxml;
}