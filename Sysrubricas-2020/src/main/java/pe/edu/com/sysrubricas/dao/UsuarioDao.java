package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Usuario;

public interface UsuarioDao {
	Usuario readUsuario(String username);
	Map<String, Object> datosUsuario(String username);
}
