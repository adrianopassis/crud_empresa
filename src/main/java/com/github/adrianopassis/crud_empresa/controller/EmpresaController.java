package com.github.adrianopassis.crud_empresa.controller;

import com.github.adrianopassis.crud_empresa.dto.EmpresaDTO;
import com.github.adrianopassis.crud_empresa.model.Empresa;
import com.github.adrianopassis.crud_empresa.service.EmpresaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService){
        this.empresaService = empresaService;
    }

    @PostMapping
    public Empresa criar(@RequestBody @Valid EmpresaDTO empresaDTO){
        return empresaService.criar(empresaDTO);
    }

    @GetMapping("/{id}")
    public Empresa buscarPorId(@PathVariable Long id) {
        return empresaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Empresa atualizar(@PathVariable Long id, @RequestBody @Valid EmpresaDTO empresaDTO) {
        return empresaService.atualizar(id, empresaDTO);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        empresaService.deletar(id);
    }

    @GetMapping
    public List<Empresa> listarTodas() {
        return empresaService.listarTodas();
    }
}
