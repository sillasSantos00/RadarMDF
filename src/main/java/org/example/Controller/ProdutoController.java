package org.example.Controller;

import org.example.produto.Produto;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @PostMapping
    public ResponseEntity<String> salvarProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok("Produto salvo com sucesso!");
    }
}
