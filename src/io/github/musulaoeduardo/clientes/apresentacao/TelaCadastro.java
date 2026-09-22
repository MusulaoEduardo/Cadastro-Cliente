package io.github.musulaoeduardo.clientes.apresentacao;

import javax.swing.*;

public class TelaCadastro extends JFrame {

    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<String> campoSexo;

    public TelaCadastro() {
        construirTela();
    }

    private void construirTela() {
        setSize(600, 500);
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        this.adicionarCampos();
        this.adicionarBotoes();
        this.adicionarComponetesFoto();

    }

    private void adicionarCampos() {
        labelNome = new JLabel("Nome:");
        labelNome.setBounds(20,20,200,20);
        getContentPane().add(labelNome);
        campoNome = new JTextField();
        campoNome.setBounds(20,40,200,20);
        getContentPane().add(campoNome);

        labelCpf = new JLabel("Cpf:");
        labelCpf.setBounds(20,60,200,20);
        getContentPane().add(labelCpf);
        campoCpf = new JTextField();
        campoCpf.setBounds(20,80,200,20);
        getContentPane().add(campoCpf);

        labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(20,100,200,20);
        getContentPane().add(labelSexo);
        campoSexo = new JComboBox<>();
        campoSexo.setBounds(20,120,200,20);
        getContentPane().add(campoSexo);
    }

    private void adicionarBotoes() {
    }

    private void adicionarComponetesFoto() {
    }

}
