package io.github.musulaoeduardo.clientes.logicanegocio;

import java.util.UUID;

public interface Cadastro <TIPO>{
    void salvar(TIPO objetoCadastrado);
    TIPO buscar(UUID codigo);
    void deletar(UUID codigo);
    void atualizar(TIPO objetoAtualizado);
}
