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
import pe.edu.com.sysrubricas.dao.ExpertoExternoDao;
import pe.edu.com.sysrubricas.entity.ExpertoExterno;
@Component
public class ExpertoExternoDaoImp implements ExpertoExternoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createExpertoExterno(ExpertoExterno exp) {
		// TODO Auto-generated method stub
	return jdbcTemplate.update("call  pk_expertos_ext.sp_create_experto_ext(? , ?)"
 , exp.getId_persona());
	}

	@Override
	public int updateExpertoExterno(ExpertoExterno exp) {
		// TODO Auto-generated method stub
	return jdbcTemplate.update("call  pk_expertos_ext.sp_update_experto_ext(? , ?)"
	, exp.getId_experto() , exp.getId_persona());
	}

	@Override
	public int deleteExpertoExterno(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_expertos_ext.sp_delete_experto_ext(?)", id);
	}

	@Override
	public Map<String, Object> readExpertoExterno(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_expertos_ext")
		.withProcedureName("sp_read_experto_ext")
		.declareParameters(new SqlParameter("id_experto", Types.INTEGER),new SqlOutParameter("cursor_expertos", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idexperto", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllExpertoExterno() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_expertos_ext")
				.withProcedureName("sp_listar_experto_ext")
				.declareParameters(new SqlOutParameter("cursor_expertos", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
