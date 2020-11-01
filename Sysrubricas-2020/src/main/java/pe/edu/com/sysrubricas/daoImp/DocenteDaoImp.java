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
import pe.edu.com.sysrubricas.dao.DocenteDao;
import pe.edu.com.sysrubricas.entity.Docente;
@Component
public class DocenteDaoImp implements DocenteDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Docente d) {
		return jdbcTemplate.update("CALL CRUD_DOCENTES.SP_CREATE_D(?, ?, ?)", d.getCodigo(), d.getIdpersona(), d.getEstado());
	}

	@Override
	public int update(Docente d) {
		return jdbcTemplate.update("CALL CRUD_DOCENTES.SP_UPDATE_D(?, ?)", d.getCodigo(), d.getIdpersona(), d.getEstado());
	}

	

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("CRUD_DOCENTES")
		.withProcedureName("SP_READ_D")
		.declareParameters(new SqlOutParameter("CURSOR_DOCENTES", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("CODIGO", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("CODIGO", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("CRUD_DOCENTES")
				.withProcedureName("sp_listar_d")
				.declareParameters(new SqlOutParameter("cursor_docente", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
		
	}



	@Override
	public int delete(int codigo) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL CRUD_DOCENTE.SP_DELETE_D(?)", codigo);
	}

}
