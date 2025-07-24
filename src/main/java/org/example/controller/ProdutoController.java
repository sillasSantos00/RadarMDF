package org.example.controller;

import org.example.repository.ProdutoRepository;
import org.example.produto.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public ResponseEntity<String> cadastrar(@RequestBody Produto produto) {
        repository.save(produto);
        return ResponseEntity.ok("Produto cadastrado com sucesso!");
    }
    @GetMapping
    public List<Produto> listarTodos() {
        return repository.findAll();
    }
}
