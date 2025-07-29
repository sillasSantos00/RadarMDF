package org.example.controller;

import org.example.repository.ProdutoRepository;
import org.example.produto.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

//Aqui ficam as rotas da API, que seu formulário chama com fetch().


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public ResponseEntity<String> cadastrar( @RequestBody Produto produto) {
        repository.save(produto);
        return ResponseEntity.ok("Produto cadastrado com sucesso!");
    }
    @GetMapping
    public List<Produto> listarTodos() {
        return repository.findAll();
    }
}


//@RestController define que a classe responde via API REST
//
//@RequestMapping("/api/produtos") define o caminho base
//
//@PostMapping responde ao método POST (pra cadastrar)
//
//@GetMapping responde ao método GET (pra listar)