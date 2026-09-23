package estudos.colecoes;

import io.github.musulaoeduardo.clientes.dominio.Cliente;
import io.github.musulaoeduardo.clientes.dominio.enums.TipoSexo;

import java.util.ArrayList;
import  java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList<>();

    }

    private static void repositorioComArray(){
        RepositorioClientes repositorioClientes = new  RepositorioClientes();
        Cliente cliente = new Cliente();
        cliente.setCpf("123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        repositorioClientes.adicionarCliente(cliente);
        repositorioClientes.imprimirClientes();
    };
}
