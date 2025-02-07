package uce.edu.web.api.respository;

import java.util.List;

import uce.edu.web.api.respository.modelo.Estudiante;

public interface IEstudianteRepository {
    public Estudiante buscarPorId(Integer id);

    public List<Estudiante> buscarTodos();
    
    public List<Estudiante> buscarPorNombre(String nombre);

    public List<Estudiante> buscarPorNombreApellido(String nombre, String apellido);

    public void insertar(Estudiante estudiante);

    public void actualizar(Estudiante estudiante);

    public void eliminar(Integer id);
}