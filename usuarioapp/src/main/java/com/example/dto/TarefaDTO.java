package com.example.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class TarefaDTO {
 @NotBlank(message = "Descricao é obrigatório")
 @Size(min = 3, max = 100)
 public String descricao;

 @NotNull(message = "Usuário é obrigatório")
 @Positive(message = "insira um valor para idUsuario")
 public Long idUsuario;

 @Positive(message = "Custo deve ser inserido")
 public double custo;

}
