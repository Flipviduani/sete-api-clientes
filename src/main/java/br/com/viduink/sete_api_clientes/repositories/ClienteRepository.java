package br.com.viduink.sete_api_clientes.repositories;

import br.com.viduink.sete_api_clientes.entities.Cliente;
import br.com.viduink.sete_api_clientes.factories.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ClienteRepository {

    @Autowired
    private ConnectionFactory connectionFactory;

    public void inserir(Cliente cliente) throws Exception {
        try (var connection = connectionFactory.getConnection()){
            var statement = connection.prepareStatement("""
                INSERT INTO clientes (id, nome, email, cpf, plano_id, dataHoraCadastro)
                VALUES (?,?,?,?,?, CURRENT_TIMESTAMP)
        """);
            statement.setObject(1, cliente.getId());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getEmail());
            statement.setString(4, cliente.getCpf());
            statement.setObject(5, cliente.getPlano().getId());
            statement.execute();
        }
    }

    public boolean atualizar(Cliente cliente) throws Exception {
        //TODO
        return false;
    }

    public boolean excluir(UUID id) throws Exception {
        //TODO
        return false;
    }

    public List<Cliente> obterPorNome(String nome) throws Exception {
        //TODO
        return null;
    }

    public Cliente obterPorId(UUID id) throws Exception {
        //TODO
        return null;
    }
}