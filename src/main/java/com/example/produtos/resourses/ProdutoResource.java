package com.example.produtos.resourses;

import com.example.produtos.models.Produto;
import com.example.produtos.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Api(value = "API rest produtos")
@CrossOrigin(origins="*")
public class ProdutoResource {

    @Autowired
    ProdutoRepository repository;

    @GetMapping("/produtos")
    @ApiOperation(value="Retorna lista de Produtos")
    public List<Produto> listaProdutos(){
        return repository.findAll();
    }

    @GetMapping("/produtos/{id}")
    @ApiOperation(value="Retorna Produto Unico")
    public Optional<Produto> listaProdutosUnico(@PathVariable(value = "id") Long id){
        return repository.findById(id);
    }

    @PostMapping("/produtos")
    @ApiOperation(value="Salva um produto")
    public Produto salvarProduto(@RequestBody Produto produto){
        return repository.save(produto);
    }

    @DeleteMapping("/produtos")
    @ApiOperation(value="deleta um produto")
    public void deletarProdutos(@RequestBody Produto produto){
        repository.delete(produto);
    }

    @PutMapping("/produtos")
    @ApiOperation(value="atualiza um produto")
    public Produto atualizaProdutos(@RequestBody Produto produto){
        return repository.save(produto);
    }


}
