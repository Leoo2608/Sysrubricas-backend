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
import pe.edu.com.sysrubricas.dao.SemestreDao;
import pe.edu.com.sysrubricas.entity.Semestre;
@Component
public class SemestreDaoImp implements SemestreDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createSemestre(Semestre sm) {
		return jdbcTemplate.update("call  pk_semestre.sp_create_semestre(?)"
				,sm.getNombre());
	}

	@Override
	public int updateSemestre(Semestre sm) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pk_semestre.sp_update_semestre(? , ?)"
				,sm.getId_semestre() ,sm.getNombre());
	}

	@Override
	public int deleteSemestre(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_semestre.sp_delete_semestre(?)", id);
	}

	@Override
	public Map<String, Object> readSemestre(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_semestre")
		.withProcedureName("sp_read_semestre")
		.declareParameters(new SqlParameter("id_semestre", Types.INTEGER),new SqlOutParameter("cursor_semestre", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_idsemestre", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllSemestre() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_semestre")
				.withProcedureName("sp_listar_semestre")
				.declareParameters(new SqlOutParameter("cursor_semestre", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
