package com.github.adrianopassis.crud_empresa.service;

import com.github.adrianopassis.crud_empresa.dto.EmpresaDTO;
import com.github.adrianopassis.crud_empresa.model.Empresa;
import com.github.adrianopassis.crud_empresa.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa criar(EmpresaDTO dto) {
        Empresa empresa = empresaDTO(dto);
        return empresaRepository.save(empresa);
    }

    public Empresa buscarPorId(Long id) {
        return empresaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
    }

    public Empresa atualizar(Long id, EmpresaDTO dto) {
        Empresa empresa = buscarPorId(id);
        empresa.setNome(dto.getNome());
        empresa.setNomeFantasia(dto.getNomeFantasia());
        empresa.setDocumento(dto.getDocumento());
        empresa.setEmail(dto.getEmail());
        empresa.setObservacoes(dto.getObservacoes());
        return empresaRepository.save(empresa);
    }

    public void deletar(Long id) {
        empresaRepository.deleteById(id);
    }

    public List<Empresa> listarTodas() {
        return empresaRepository.findAll();
    }

    private Empresa empresaDTO(EmpresaDTO dto) {
        Empresa empresa = new Empresa();
        empresa.setNome(dto.getNome());
        empresa.setNomeFantasia(dto.getNomeFantasia());
        empresa.setDocumento(dto.getDocumento());
        empresa.setEmail(dto.getEmail());
        empresa.setObservacoes(dto.getObservacoes());
        return empresa;
    }
}
