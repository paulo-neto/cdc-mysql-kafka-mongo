package com.pauloneto;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jnosql.diana.api.column.ColumnFamilyManager;
import org.jnosql.diana.cassandra.column.CassandraColumnFamilyManager;

@ApplicationScoped
public class CassandraProducer {
    
    
    @Inject
    @ConfigProperty(defaultValue = "column")
    private ColumnFamilyManager manager;

    @Produces
    @ApplicationScoped
    public CassandraColumnFamilyManager getManagerCassandra() {
        return (CassandraColumnFamilyManager) manager;
    }

    public void dispose(@Disposes CassandraColumnFamilyManager manager) {
        manager.close();
    }
}
