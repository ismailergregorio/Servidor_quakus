package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.models.Entrega;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/api/entregas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ControleDeEntregas {

 private List<Entrega> entregas = new ArrayList<>();

 @GET
 public List<Entrega> ListaEntregas() {
  return entregas;
 }

 @POST
 public Response criarEntregas(Entrega entrega) {
  entregas.add(entrega);
  return Response.status(201).build();
 }

 public boolean agendarEntregas(){
    return true;
 }
 
}
