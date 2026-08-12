package br.com.viduink.sete_api_clientes.controllers;

import br.com.viduink.sete_api_clientes.dtos.ClienteRequestDto;
import br.com.viduink.sete_api_clientes.entities.Cliente;
import br.com.viduink.sete_api_clientes.entities.Plano;
import br.com.viduink.sete_api_clientes.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/clientes")
public class ClientesController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<?> post(@RequestBody ClienteRequestDto dto){
        try{
            var cliente = new Cliente(); //instanciando a classe de entidade
            cliente.setPlano(new Plano()); //instanciando o atributo plano associado ao cliente

            cliente.setId(UUID.randomUUID());
            cliente.setNome(dto.nome());
            cliente.setEmail(dto.email());
            cliente.setCpf(dto.cpf());
            cliente.getPlano().setId(dto.planoId());

            clienteRepository.inserir(cliente);

            return ResponseEntity.status(201).body("Cliente cadastrado com sucesso!");

        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro: " + e.getMessage());
        }
    }

    @PutMapping
    public String put(){
        return "Cliente atualizado com sucesso!";
    }

    @DeleteMapping
    public String delete(){
        return "Cliente excluído com sucesso!";
    }

    @GetMapping
    public String get(){
        return "Consulta realizada com sucesso!";
    }
}
