package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "frota")

// name = Define o nome da coluna no banco de dados. Por padrão, é o nome do
// atributo.
// unique = Define se a coluna deve ter a restrição UNIQUE. Exemplo:
// @Column(unique = true).
// nullable = Define se a coluna pode aceitar NULL. Padrão é true.
// insertable = Indica se a coluna deve ser incluída nas instruções SQL de
// INSERT. Padrão é true.
// updatable = Indica se a coluna pode ser atualizada com instruções SQL de
// UPDATE. Padrão é true.
// columnDefinition = Permite definir diretamente o tipo da coluna, conforme a
// sintaxe do banco de dados.
// length = Define o tamanho da coluna para tipos String. Padrão é 255.
// precision = Define a precisão para tipos numéricos BigDecimal. Refere-se ao
// total de dígitos.
// scale = Define a escala para tipos numéricos BigDecimal. Refere-se ao número
// de dígitos à direita da vírgula.
// table = Especifica o nome da tabela secundária caso o campo pertença a outra
// tabela. Pouco usado.

public class Frota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //VALOR DE ALTO INCREMENTAVEL
    private long id;
    @Column(nullable = false) // NÃO PODE RECEBER NULL
    private String modeloCaminhao;
    @Column(nullable = false, unique = true) // NÃO PODE RECEBER NULL E NÃO PODE TER INTENS REPETIDOS
    private String placa;
    private int capacidadeDeCarga;
    private boolean disponivel = true;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModeloCaminha() {
        return modeloCaminhao;
    }

    public void setModeloCaminha(String modeloCaminha) {
        this.modeloCaminhao = modeloCaminha;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}
