package pe.edu.com.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.com.sysrubricas.dao.UsuarioDao;
import pe.edu.com.sysrubricas.entity.Usuario;
@Repository
public class UsuarioDaoImp implements UsuarioDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Usuario readUsuario(String username) {
		String SQL = "select *from usuarios where username=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {username}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public Map<String, Object> datosUsuario(String username) {
		String SQL = "SELECT u.idusuario, r.idrol, p.nombres, u.username, a.nomacceso FROM personas " + 
				"INNER JOIN usuarios u ON u.idpersona = p.idpersona " + 
				"INNER JOIN usuarios_roles ur ON u.idusuario = ur.idusuario " + 
				"INNER JOIN roles r ON r.idrol=ur.idrol"+
				"where u.username = ?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		return map;
	}

}
