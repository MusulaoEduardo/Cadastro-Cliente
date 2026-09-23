package estudos.colecoes;

import io.github.musulaoeduardo.clientes.dominio.Cliente;

public class RepositorioClientes {
    private Cliente[] arrayClientes;
    private int posicaoAtual;
    public RepositorioClientes() {
        this.arrayClientes = new Cliente[1000];
        posicaoAtual=0;
    }

    public void adicionarCliente(Cliente cliente){
        this.arrayClientes[posicaoAtual] = cliente;
        posicaoAtual++;
    }
    public void imprimirClientes(){
        for(Cliente cliente: this.arrayClientes){
            System.out.println(cliente);
        }
    }
}
