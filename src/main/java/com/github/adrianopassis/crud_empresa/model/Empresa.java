package com.github.adrianopassis.crud_empresa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "empresas")
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "nome_fantasia", nullable = false)
    private String nomeFantasia;

    @Column(nullable = false)
    private String documento;

    @Column(nullable = false)
    private String email;

    @Column
    private String observacoes;

    @OneToMany(mappedBy = "empresa")
    private List<Usuario> usuario;
}
