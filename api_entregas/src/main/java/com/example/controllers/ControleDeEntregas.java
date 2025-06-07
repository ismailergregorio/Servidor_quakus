package com.example.controllers;

// import java.util.ArrayList;
import java.util.List;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import com.example.models.Entregas;
import com.example.repository.RepositorioEntregas;

import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/api/entregas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Entregas", description = "Operaçoes para gerenciamento de Entregas")

public class ControleDeEntregas {
   @Inject
   RepositorioEntregas repositorioentregas;
   // private List<modeloEntregas> entregas = new ArrayList<>();
   @GET
   public List<Entregas> ListaEntregas() {
      return repositorioentregas.listAll();
   }

   @POST
   @Transactional
   public Response criarEntregas(Entregas entrega) {
      try{
         repositorioentregas.persist(entrega);
         return Response.status(201).build();
      } catch(Exception e){
         return Response.serverError().entity(e).build();
      }
   }

   public boolean agendarEntregas() {
      return true;
   }

}
