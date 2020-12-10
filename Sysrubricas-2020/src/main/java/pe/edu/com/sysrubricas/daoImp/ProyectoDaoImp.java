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
import pe.edu.com.sysrubricas.dao.ProyectoDao;
import pe.edu.com.sysrubricas.entity.Proyecto;
@Component
public class ProyectoDaoImp implements ProyectoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createProyecto(Proyecto pr) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pk_proyecto.sp_create_proyecto(? , ? , ? , ?)"
	,pr.getId_semestre() , pr.getCiclo() , pr.getGrupos() , pr.getId_persona());
	}

	@Override
	public int updateProyecto(Proyecto pr) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pk_proyecto.sp_create_proyecto(? , ? , ? , ? , ?)"
	,pr.getId_proyecto() ,pr.getId_semestre() , pr.getCiclo() , pr.getGrupos() ,pr.getId_persona());
	}

	@Override
	public int deleteProyecto(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_proyecto.sp_delete_proyecto(?)", id);
	}

	@Override
	public Map<String, Object> readProyecto(int id) {

		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_proyecto")
		.withProcedureName("sp_read_proyecto")
		.declareParameters(new SqlParameter("id_proyecto", Types.INTEGER),new SqlOutParameter("cursor_proyecto", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_idproyecto", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllProyecto() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_proyecto")
				.withProcedureName("sp_listar_proyecto")
				.declareParameters(new SqlOutParameter("cursor_proyecto", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
