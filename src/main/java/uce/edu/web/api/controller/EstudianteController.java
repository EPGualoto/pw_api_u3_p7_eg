package uce.edu.web.api.controller;

import uce.edu.web.api.service.IEstudianteService;
import uce.edu.web.api.service.to.EstudianteTo;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Path("/estudiantes")
public class EstudianteController {

    @Inject
    private IEstudianteService iEstudianteService;

    @GET
    @Path("/{id}")
    public EstudianteTo buscarPorId(@PathParam("id") Integer id) {
        return this.iEstudianteService.buscarPorId(id);
    }

    
    @GET
    @Path("")
    public List<EstudianteTo> buscarTodos(){
        return this.iEstudianteService.buscarTodos();   
     }

    @GET
    @Path("/porNombre")
    public List<EstudianteTo> buscarPorNombre(@QueryParam("nombre") String nombre){
        return this.iEstudianteService.buscarPorNombre(nombre);   
     }

    @GET
    @Path("/porNombreApellido")
    public List<EstudianteTo> buscarPorNombreApellido(@QueryParam("nombre") String nombre, @QueryParam("apellido") String apellido){
        return this.iEstudianteService.buscarPorNombreApellido(nombre, apellido);
     }

    @POST
    @Path("/guardar")
    public void guardar(EstudianteTo estudiante) {
        this.iEstudianteService.guardar(estudiante);
    }

    @PUT
    @Path("/actualizar")
    public void actualizar(EstudianteTo estudiante) {
        this.iEstudianteService.actualizar(estudiante);
    }

    @PATCH
    @Path("/actualizar/parcial")
    public void actualizarParcial(EstudianteTo estudiante) {
        EstudianteTo tmp = this.iEstudianteService.buscarPorId(estudiante.getId());
        tmp.setNombre(estudiante.getNombre());
        this.iEstudianteService.actualizar(tmp);
    }

    @DELETE
    @Path("/borrar")
    public void borrar() {
        Integer id = 3;
        this.iEstudianteService.borrar(id);
    }
}
