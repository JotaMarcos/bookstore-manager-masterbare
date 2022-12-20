package com.masterbare.bookstoremanager.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data // Adiciona os métodos getters, setters, equals e hashcode
@Builder // Padrões de projetos para a construção de objetos de forma segura
@NoArgsConstructor // Construtores sem argumentos
@AllArgsConstructor // Construtores com argumentos
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;


}
