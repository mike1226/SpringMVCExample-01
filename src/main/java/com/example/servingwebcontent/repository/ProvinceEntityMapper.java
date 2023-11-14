package com.example.servingwebcontent.repository;

import static com.example.servingwebcontent.repository.ProvinceEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.servingwebcontent.entity.ProvinceEntity;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface ProvinceEntityMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ProvinceEntity>, CommonUpdateMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.571086+09:00", comments = "Source Table: public.province")
	BasicColumn[] selectList = BasicColumn.columnList(provcode, mstcountrycd, provname);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570518+09:00", comments = "Source Table: public.province")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "ProvinceEntityResult", value = {
			@Result(column = "provcode", property = "provcode", jdbcType = JdbcType.CHAR, id = true),
			@Result(column = "mstcountrycd", property = "mstcountrycd", jdbcType = JdbcType.CHAR, id = true),
			@Result(column = "provname", property = "provname", jdbcType = JdbcType.CHAR) })
	List<ProvinceEntity> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.57059+09:00", comments = "Source Table: public.province")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("ProvinceEntityResult")
	Optional<ProvinceEntity> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570632+09:00", comments = "Source Table: public.province")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, provinceEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570673+09:00", comments = "Source Table: public.province")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, provinceEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570723+09:00", comments = "Source Table: public.province")
	default int deleteByPrimaryKey(String provcode_, String mstcountrycd_) {
		return delete(c -> c.where(provcode, isEqualTo(provcode_)).and(mstcountrycd, isEqualTo(mstcountrycd_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570773+09:00", comments = "Source Table: public.province")
	default int insert(ProvinceEntity row) {
		return MyBatis3Utils.insert(this::insert, row, provinceEntity, c -> c.map(provcode).toProperty("provcode")
				.map(mstcountrycd).toProperty("mstcountrycd").map(provname).toProperty("provname"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570872+09:00", comments = "Source Table: public.province")
	default int insertMultiple(Collection<ProvinceEntity> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, provinceEntity,
				c -> c.map(provcode).toProperty("provcode").map(mstcountrycd).toProperty("mstcountrycd").map(provname)
						.toProperty("provname"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570967+09:00", comments = "Source Table: public.province")
	default int insertSelective(ProvinceEntity row) {
		return MyBatis3Utils.insert(this::insert, row, provinceEntity,
				c -> c.map(provcode).toPropertyWhenPresent("provcode", row::getProvcode).map(mstcountrycd)
						.toPropertyWhenPresent("mstcountrycd", row::getMstcountrycd).map(provname)
						.toPropertyWhenPresent("provname", row::getProvname));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.571152+09:00", comments = "Source Table: public.province")
	default Optional<ProvinceEntity> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, provinceEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.57121+09:00", comments = "Source Table: public.province")
	default List<ProvinceEntity> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, provinceEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.571272+09:00", comments = "Source Table: public.province")
	default List<ProvinceEntity> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, provinceEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.571342+09:00", comments = "Source Table: public.province")
	default Optional<ProvinceEntity> selectByPrimaryKey(String provcode_, String mstcountrycd_) {
		return selectOne(c -> c.where(provcode, isEqualTo(provcode_)).and(mstcountrycd, isEqualTo(mstcountrycd_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.571411+09:00", comments = "Source Table: public.province")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, provinceEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.571468+09:00", comments = "Source Table: public.province")
	static UpdateDSL<UpdateModel> updateAllColumns(ProvinceEntity row, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(provcode).equalTo(row::getProvcode).set(mstcountrycd).equalTo(row::getMstcountrycd).set(provname)
				.equalTo(row::getProvname);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.571546+09:00", comments = "Source Table: public.province")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(ProvinceEntity row, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(provcode).equalToWhenPresent(row::getProvcode).set(mstcountrycd)
				.equalToWhenPresent(row::getMstcountrycd).set(provname).equalToWhenPresent(row::getProvname);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.571611+09:00", comments = "Source Table: public.province")
	default int updateByPrimaryKey(ProvinceEntity row) {
		return update(c -> c.set(provname).equalTo(row::getProvname).where(provcode, isEqualTo(row::getProvcode))
				.and(mstcountrycd, isEqualTo(row::getMstcountrycd)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.571664+09:00", comments = "Source Table: public.province")
	default int updateByPrimaryKeySelective(ProvinceEntity row) {
		return update(c -> c.set(provname).equalToWhenPresent(row::getProvname)
				.where(provcode, isEqualTo(row::getProvcode)).and(mstcountrycd, isEqualTo(row::getMstcountrycd)));
	}
}