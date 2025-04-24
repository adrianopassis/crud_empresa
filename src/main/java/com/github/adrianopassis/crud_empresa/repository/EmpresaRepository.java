package com.github.adrianopassis.crud_empresa.repository;

import com.github.adrianopassis.crud_empresa.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
