package com.example.servingwebcontent.repository;

import static com.example.servingwebcontent.repository.CountryEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.servingwebcontent.entity.CountryEntity;
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
public interface CountryEntityMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CountryEntity>, CommonUpdateMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568986+09:00", comments = "Source Table: public.country")
	BasicColumn[] selectList = BasicColumn.columnList(mstcountrycd, mstcountrynanme, updatedt, deletedt);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568237+09:00", comments = "Source Table: public.country")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "CountryEntityResult", value = {
			@Result(column = "mstcountrycd", property = "mstcountrycd", jdbcType = JdbcType.CHAR, id = true),
			@Result(column = "mstcountrynanme", property = "mstcountrynanme", jdbcType = JdbcType.CHAR),
			@Result(column = "updatedt", property = "updatedt", jdbcType = JdbcType.NUMERIC),
			@Result(column = "deletedt", property = "deletedt", jdbcType = JdbcType.NUMERIC) })
	List<CountryEntity> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568391+09:00", comments = "Source Table: public.country")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("CountryEntityResult")
	Optional<CountryEntity> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568476+09:00", comments = "Source Table: public.country")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, countryEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568549+09:00", comments = "Source Table: public.country")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, countryEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568607+09:00", comments = "Source Table: public.country")
	default int deleteByPrimaryKey(String mstcountrycd_) {
		return delete(c -> c.where(mstcountrycd, isEqualTo(mstcountrycd_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568664+09:00", comments = "Source Table: public.country")
	default int insert(CountryEntity row) {
		return MyBatis3Utils.insert(this::insert, row, countryEntity,
				c -> c.map(mstcountrycd).toProperty("mstcountrycd").map(mstcountrynanme).toProperty("mstcountrynanme")
						.map(updatedt).toProperty("updatedt").map(deletedt).toProperty("deletedt"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568773+09:00", comments = "Source Table: public.country")
	default int insertMultiple(Collection<CountryEntity> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, countryEntity,
				c -> c.map(mstcountrycd).toProperty("mstcountrycd").map(mstcountrynanme).toProperty("mstcountrynanme")
						.map(updatedt).toProperty("updatedt").map(deletedt).toProperty("deletedt"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568851+09:00", comments = "Source Table: public.country")
	default int insertSelective(CountryEntity row) {
		return MyBatis3Utils.insert(this::insert, row, countryEntity,
				c -> c.map(mstcountrycd).toPropertyWhenPresent("mstcountrycd", row::getMstcountrycd)
						.map(mstcountrynanme).toPropertyWhenPresent("mstcountrynanme", row::getMstcountrynanme)
						.map(updatedt).toPropertyWhenPresent("updatedt", row::getUpdatedt).map(deletedt)
						.toPropertyWhenPresent("deletedt", row::getDeletedt));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569055+09:00", comments = "Source Table: public.country")
	default Optional<CountryEntity> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, countryEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569124+09:00", comments = "Source Table: public.country")
	default List<CountryEntity> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, countryEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569168+09:00", comments = "Source Table: public.country")
	default List<CountryEntity> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, countryEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.56922+09:00", comments = "Source Table: public.country")
	default Optional<CountryEntity> selectByPrimaryKey(String mstcountrycd_) {
		return selectOne(c -> c.where(mstcountrycd, isEqualTo(mstcountrycd_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.56927+09:00", comments = "Source Table: public.country")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, countryEntity, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569318+09:00", comments = "Source Table: public.country")
	static UpdateDSL<UpdateModel> updateAllColumns(CountryEntity row, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(mstcountrycd).equalTo(row::getMstcountrycd).set(mstcountrynanme).equalTo(row::getMstcountrynanme)
				.set(updatedt).equalTo(row::getUpdatedt).set(deletedt).equalTo(row::getDeletedt);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569387+09:00", comments = "Source Table: public.country")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(CountryEntity row, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(mstcountrycd).equalToWhenPresent(row::getMstcountrycd).set(mstcountrynanme)
				.equalToWhenPresent(row::getMstcountrynanme).set(updatedt).equalToWhenPresent(row::getUpdatedt)
				.set(deletedt).equalToWhenPresent(row::getDeletedt);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569457+09:00", comments = "Source Table: public.country")
	default int updateByPrimaryKey(CountryEntity row) {
		return update(
				c -> c.set(mstcountrynanme).equalTo(row::getMstcountrynanme).set(updatedt).equalTo(row::getUpdatedt)
						.set(deletedt).equalTo(row::getDeletedt).where(mstcountrycd, isEqualTo(row::getMstcountrycd)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569576+09:00", comments = "Source Table: public.country")
	default int updateByPrimaryKeySelective(CountryEntity row) {
		return update(c -> c.set(mstcountrynanme).equalToWhenPresent(row::getMstcountrynanme).set(updatedt)
				.equalToWhenPresent(row::getUpdatedt).set(deletedt).equalToWhenPresent(row::getDeletedt)
				.where(mstcountrycd, isEqualTo(row::getMstcountrycd)));
	}
}