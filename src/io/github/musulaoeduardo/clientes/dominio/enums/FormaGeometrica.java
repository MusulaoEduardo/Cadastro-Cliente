package io.github.musulaoeduardo.clientes.dominio.enums;

public enum FormaGeometrica {
    QUADRADO(4),
    CIRCULO(0),
    TRIANGULO(3),
    RETANGULO(4);

    private final int lados;
    FormaGeometrica(int lados){
        this.lados = lados;
    }
}
