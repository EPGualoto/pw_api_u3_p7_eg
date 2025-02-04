package uce.edu.web.api.respository;

import uce.edu.web.api.respository.modelo.Estudiante;

public interface IEstudianteRepository {
    public Estudiante buscarPorId(Integer id);

    public void insertar(Estudiante estudiante);

    public void actualizar(Estudiante estudiante);

    public void eliminar(Integer id);
}