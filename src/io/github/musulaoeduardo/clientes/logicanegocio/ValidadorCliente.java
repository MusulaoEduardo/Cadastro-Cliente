package io.github.musulaoeduardo.clientes.logicanegocio;

import io.github.musulaoeduardo.clientes.dominio.Cliente;
import io.github.musulaoeduardo.clientes.dominio.exceptions.CpfInvalidoException;
import io.github.musulaoeduardo.clientes.dominio.exceptions.DadosObrigatoriosException;

public class ValidadorCliente {

    public static void validarCpf(Cliente cliente)throws CpfInvalidoException{
           if (cliente.getCpf().length()!=11){
                throw new CpfInvalidoException("Cpf invalido");
           }
           validarDadosObrigatorios(cliente);
    }

    private static void validarDadosObrigatorios(Cliente cliente){
        if (cliente.getNome() == null || cliente.getNome().trim().isEmpty()){
            throw new DadosObrigatoriosException("Nome Obrigatorio");
        }
    }
}
