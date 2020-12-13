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
	public int create(Semestre s) {
		return jdbcTemplate.update("CALL PK_SEMESTRE.SP_CREATE_S(?)", s.getNombre());
		
	}

	@Override
	public int update(Semestre s) {
		return jdbcTemplate.update("CALL PK_SEMESTRE.SP_UPDATE_S(?,?)", s.getId_semestre(), s.getNombre());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("CALL PK_SEMESTRE.SP_DELETE_S(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_SEMESTRE")
		.withProcedureName("sp_read_semestre")
		.declareParameters(new SqlOutParameter("CURSOR_SEMESTRE", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("P_idsemestre", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_idsemestre", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_semestre")
				.withProcedureName("sp_listar_semestre")
				.declareParameters(new SqlOutParameter("cursor_semestre", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
