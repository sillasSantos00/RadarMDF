package org.example.repository;

import org.example.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    //Essa interface herda de JpaRepository, que já tem:
    //
    //.save() → salva um produto
    //
    //.findAll() → lista todos
    //
    //.findById() → busca por ID
    //
    //.delete() → apaga item
    //
    //Com isso, você escreve zero SQL manual!

}
