package com.example.controllers;

// import java.util.ArrayList;
import java.util.List;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import com.example.models.Frota;
import com.example.repository.FrotaRepository;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

@Path("/api/frotas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Frotas", description = "Operações para gerenciamento de Frotas")

public class ControleDeFrota {
    // private List<Frota> frotas = new ArrayList<>();
    @Inject
    FrotaRepository repositoriofrota;

    @GET
    public List<Frota> ListaFrotas() {
        return repositoriofrota.listAll();
    }

    @GET
    @Path("/{id}")
    public Response ListaEntrgas(@PathParam("id") long id) {
        Frota f = repositoriofrota.findById(id);
        if (f != null)
            return Response.ok().entity(f).build();
        else
            return Response.status(404).build();
    }

    @POST
    @Transactional
    public Response criarFrota(Frota frota) {
        try {
            repositoriofrota.persist(frota);
            return Response.status(201).build();
        } catch (Exception e) {
            return Response.serverError().entity(e).build();
        }

    }
}
