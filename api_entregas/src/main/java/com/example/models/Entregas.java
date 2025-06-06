package com.example.models;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Entregas")

public class Entregas {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String categoria;
 @Column(nullable = false)
 private Date dataDeSaidaDeEntrega;
 private int volume;

 public int getVolume() {
  return volume;
 }

 public void setVolume(int volume) {
  this.volume = volume;
 }

 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public String getCategoria() {
  return categoria;
 }

 public void setCategoria(String categoria) {
  this.categoria = categoria;
 }

 public Date getDataDeSaidaDeEntrega() {
  return dataDeSaidaDeEntrega;
 }

 public void setDataDeSaidaDeEntrega(Date dataDeSaidaDeEntrega) {
  this.dataDeSaidaDeEntrega = dataDeSaidaDeEntrega;
  System.out.println("Ola");
 }

}
