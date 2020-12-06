package pe.edu.com.sysrubricas.daoImp;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.com.sysrubricas.dao.PersonaDao;
import pe.edu.com.sysrubricas.entity.Persona;
@Component
public class PersonaDaoImp implements PersonaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createPersona(Persona p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pk_persona.sp_create_persona(? , ? , ? , ? ,? )"
	,p.getNombres() , p.getApe_pat() , p.getApe_mat() , p.getDni() , p.getTelefono());
	}
	@Override
	public int updatePersona(Persona p) {
		// TODO Auto-generated method stub
 return jdbcTemplate.update("call  pk_persona.sp_update_persona(? , ? , ? , ? ,? ,? )"
 , p.getId_persona() ,p.getNombres() , p.getApe_pat() , p.getApe_mat() , p.getDni() , p.getTelefono());
	}
	@Override
	public int deletePersona(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_persona.sp_delete_persona(?)", id);
	}
	@Override
	public Map<String, Object> readPersona(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_persona")
		.withProcedureName("sp_read_persona")
		.declareParameters(new SqlParameter("id_persona", Types.INTEGER),new SqlOutParameter("cursor_personas", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("id_persona", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAllPersona() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_persona")
				.withProcedureName("sp_listar_persona")
				.declareParameters(new SqlOutParameter("cursor_personas", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}
}
