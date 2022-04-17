package com.pauloneto.cassandra.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.pauloneto.cassandra.domain.enums.CategoriaProduto;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "produto")
@Indexed
@Analyzer(impl = StandardAnalyzer.class)
@Getter
@Setter
@ToString
public class Produto {

    @Id
    @DocumentId
    private Long id;

    @Column
    @Field(analyze = Analyze.NO)
    private String nome;

    @Column
    private String descricao;
    
    @Column
    @Field
    private CategoriaProduto categoria;
}
