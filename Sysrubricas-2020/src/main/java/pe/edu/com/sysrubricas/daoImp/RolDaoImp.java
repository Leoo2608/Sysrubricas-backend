package pe.edu.com.sysrubricas.daoImp;

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
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;
import pe.edu.com.sysrubricas.dao.RolDao;
import pe.edu.com.sysrubricas.entity.Rol;
@Component
public class RolDaoImp implements RolDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Rol r) {
		return jdbcTemplate.update("call pk_roles.sp_create_rol(?)", r.getNombre());
	}

	@Override
	public int update(Rol r) {
		return jdbcTemplate.update("call pk_roles.sp_update_rol(?,?)", r.getIdrol(),r.getNombre());
	}

	@Override
	public Map<String, Object> read(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)			
		.withCatalogName("pk_roles") //nombre del paquete
		.withProcedureName("sp_read_rol") //nombre del procedimiento
		.declareParameters(new SqlOutParameter("cursor_roles", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()), new SqlParameter("idr", OracleTypes.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("idr", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_ROLES")
				.withProcedureName("sp_listar_roles")
				.declareParameters(new SqlOutParameter("cursor_roles", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call pk_roles.sp_delete_rol(?)	", id);
	}
}
