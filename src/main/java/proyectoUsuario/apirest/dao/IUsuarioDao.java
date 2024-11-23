package proyectoUsuario.apirest.dao;

import org.springframework.data.repository.CrudRepository;

import proyectoUsuario.apirest.entity.Usuario;


public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
