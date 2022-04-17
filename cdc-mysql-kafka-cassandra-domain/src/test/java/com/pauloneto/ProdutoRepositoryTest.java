package com.pauloneto;

import com.pauloneto.cassandra.repository.ProdutoRepository;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.junit.Test;

public class ProdutoRepositoryTest {
   
    @Test
    public void shouldAnswerWithTrue(){

        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            container.select(ProdutoRepository.class).get();
        }
    }
}
