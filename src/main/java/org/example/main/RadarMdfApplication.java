package org.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.example")
@EntityScan(basePackages = "org.example.produto")
@EnableJpaRepositories(basePackages = "org.example.repository")
public class RadarMdfApplication {
    public static void main(String[] args) {
        SpringApplication.run(RadarMdfApplication.class, args);
    }
}
//@SpringBootApplication(scanBasePackages = "org.example") 👉 Faz o Spring escanear todos os pacotes dentro de org.example pra detectar componentes, services, controllers etc. 📦 É útil quando sua estrutura está separada por pacotes (ex: main, produto, repository).
//
//@EntityScan(basePackages = "org.example.produto") 👉 Diz pro Spring onde estão suas entidades JPA (como o Produto.java). 🗃️ Sem isso, ele pode não detectar suas tabelas corretamente.
//
//@EnableJpaRepositories(basePackages = "org.example.repository") 👉 Define onde estão seus repositórios JPA (como ProdutoRepository). 🔍 Isso permite usar os métodos .save(), .findAll() etc sem escrever SQL.