package org.example.Controller;

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
    public ResponseEntity<String> salvarProduto(@RequestBody Produto produto) {
        repository.save(produto);
        return ResponseEntity.ok("Produto salvo com sucesso!");
    }
    @GetMapping
    public List<Produto> listar() {
        return repository.findAll();
    }
}
