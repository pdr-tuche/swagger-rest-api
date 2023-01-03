package com.example.produtos.resourses;

import com.example.produtos.models.Produto;
import com.example.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProdutoResource {

    @Autowired
    ProdutoRepository repository;

    @GetMapping("/produtos")
    public List<Produto> listaProdutos(){
        return repository.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Optional<Produto> listaProdutosUnico(@PathVariable(value = "id") Long id){
        return repository.findById(id);
    }

    @PostMapping("/produtos")
    public Produto salvarProduto(@RequestBody Produto produto){
        return repository.save(produto);
    }

    @DeleteMapping("/produtos")
    public void deletarProdutos(@RequestBody Produto produto){
        repository.delete(produto);
    }

    @PutMapping("/produtos")
    public Produto atualizaProdutos(@RequestBody Produto produto){
        return repository.save(produto);
    }


}
