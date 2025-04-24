package com.github.adrianopassis.crud_empresa.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDTO {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    private String nomeFantasia;

    @NotBlank(message = "Documento é obrigatório")
    private String documento;

    @Email(message = "Email inválido")
    @NotBlank(message = "Email é obrigatório")
    private String email;

    private String observacoes;

}
