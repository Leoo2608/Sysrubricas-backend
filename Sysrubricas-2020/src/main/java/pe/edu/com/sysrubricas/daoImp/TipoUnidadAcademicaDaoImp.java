package pe.edu.com.sysrubricas.daoImp;



import java.sql.Types;
import java.util.Map;
import oracle.jdbc.internal.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import pe.edu.com.sysrubricas.dao.TipoUnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;
@Component

public class TipoUnidadAcademicaDaoImp implements TipoUnidadAcademicaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(TipoUnidadAcademica t) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL pk_tipounidad.sp_create_tipounidad(?)", t.getNombre());
	}

	@Override
	public int update(TipoUnidadAcademica t) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL pk_tipounidad.sp_update_tipounidad(?,?)", t.getId_tipoUnidad(), t.getNombre() );
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL pk_tipounidad.sp_delete_tipounidad(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_tipounidad")
		.withProcedureName("SP_READ_L")
		.declareParameters(new SqlOutParameter("CURSOR_T", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("ID_TIPO_UNIDAD", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_TIPO_UNIDAD", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_tipounidad") //nombre del paquete
				.withProcedureName("sp_listar_tipounidad") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CURSOR_T", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
