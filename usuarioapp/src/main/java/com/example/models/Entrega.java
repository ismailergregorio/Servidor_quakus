package com.example.models;

import java.sql.Date;

public class Entrega {
 private int id;
 private String categoria;
 private Date dataDeSidaDeEntrega;
 private int volume;
 
 public int getVolume() {
    return volume;
}

 public void setVolume(int volume) {
    this.volume = volume;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getCategoria() {
  return categoria;
 }

 public void setCategoria(String categoria) {
  this.categoria = categoria;
 }

 public Date getDataDeSidaDeEntrega() {
  return dataDeSidaDeEntrega;
 }

 public void setDataDeSidaDeEntrega(Date dataDeSidaDeEntrega) {
  this.dataDeSidaDeEntrega = dataDeSidaDeEntrega;
 }

}
