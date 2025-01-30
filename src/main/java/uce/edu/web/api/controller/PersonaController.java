package uce.edu.web.api.controller;

import uce.edu.web.api.service.IPersonaService;
import uce.edu.web.api.service.to.PersonaTo;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/personas")
public class PersonaController{

    @Inject
    private IPersonaService iPersonaService;

    @GET
    @Path("/buscar")
    public PersonaTo buscarPorId() {
        Integer id=1;
        return this.iPersonaService.buscarPorId(id);
        //return Response.ok(this.iPersonaService.buscarPorId(id)).build();
    }

    public void guardar(PersonaTo persona) {
        this.iPersonaService.guardar(persona);
    }

    public void actualizar(PersonaTo persona) {
        this.iPersonaService.actualizar(persona);
    }

    public void borrar(Integer id) {
        this.iPersonaService.borrar(id);
    }

}
