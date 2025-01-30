package uce.edu.web.api.respository;

import uce.edu.web.api.respository.modelo.Persona;

public interface IPersonaRepository {
    public Persona buscarPorId(Integer id);

    public void insertar(Persona persona);

    public void actualizar(Persona persona);

    public void eliminar(Integer id);

}
