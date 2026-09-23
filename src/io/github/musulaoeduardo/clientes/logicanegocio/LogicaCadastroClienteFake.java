package io.github.musulaoeduardo.clientes.logicanegocio;

import io.github.musulaoeduardo.clientes.dominio.Cliente;

import javax.swing.*;
import java.util.UUID;

public class LogicaCadastroClienteFake implements Cadastro<Cliente>{
    @Override
    public void salvar(Cliente objetoCadastrado) {
        JOptionPane.showMessageDialog(null, objetoCadastrado);
    }

    @Override
    public Cliente buscar(UUID codigo) {
        return null;
    }

    @Override
    public void deletar(UUID codigo) {

    }

    @Override
    public void atualizar(Cliente objetoAtualizado) {

    }
}
