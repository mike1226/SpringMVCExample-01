package com.example.servingwebcontent.repository;

import static com.example.servingwebcontent.repository.CustomerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.servingwebcontent.entity.Customer;
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
public interface CustomerMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Customer>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.302953+09:00", comments="Source Table: public.customer")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, email, phoneNumber, postCode);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.30241+09:00", comments="Source Table: public.customer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CustomerResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_number", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="post_code", property="postCode", jdbcType=JdbcType.VARCHAR)
    })
    List<Customer> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.302515+09:00", comments="Source Table: public.customer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CustomerResult")
    Optional<Customer> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.302563+09:00", comments="Source Table: public.customer")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.302606+09:00", comments="Source Table: public.customer")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.302645+09:00", comments="Source Table: public.customer")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.302686+09:00", comments="Source Table: public.customer")
    default int insert(Customer row) {
        return MyBatis3Utils.insert(this::insert, row, customer, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(email).toProperty("email")
            .map(phoneNumber).toProperty("phoneNumber")
            .map(postCode).toProperty("postCode")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.302788+09:00", comments="Source Table: public.customer")
    default int insertMultiple(Collection<Customer> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, customer, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(email).toProperty("email")
            .map(phoneNumber).toProperty("phoneNumber")
            .map(postCode).toProperty("postCode")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.302859+09:00", comments="Source Table: public.customer")
    default int insertSelective(Customer row) {
        return MyBatis3Utils.insert(this::insert, row, customer, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(username).toPropertyWhenPresent("username", row::getUsername)
            .map(email).toPropertyWhenPresent("email", row::getEmail)
            .map(phoneNumber).toPropertyWhenPresent("phoneNumber", row::getPhoneNumber)
            .map(postCode).toPropertyWhenPresent("postCode", row::getPostCode)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.302996+09:00", comments="Source Table: public.customer")
    default Optional<Customer> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.303036+09:00", comments="Source Table: public.customer")
    default List<Customer> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.303089+09:00", comments="Source Table: public.customer")
    default List<Customer> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.303131+09:00", comments="Source Table: public.customer")
    default Optional<Customer> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.303226+09:00", comments="Source Table: public.customer")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.30334+09:00", comments="Source Table: public.customer")
    static UpdateDSL<UpdateModel> updateAllColumns(Customer row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(username).equalTo(row::getUsername)
                .set(email).equalTo(row::getEmail)
                .set(phoneNumber).equalTo(row::getPhoneNumber)
                .set(postCode).equalTo(row::getPostCode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.303415+09:00", comments="Source Table: public.customer")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Customer row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(username).equalToWhenPresent(row::getUsername)
                .set(email).equalToWhenPresent(row::getEmail)
                .set(phoneNumber).equalToWhenPresent(row::getPhoneNumber)
                .set(postCode).equalToWhenPresent(row::getPostCode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.303482+09:00", comments="Source Table: public.customer")
    default int updateByPrimaryKey(Customer row) {
        return update(c ->
            c.set(username).equalTo(row::getUsername)
            .set(email).equalTo(row::getEmail)
            .set(phoneNumber).equalTo(row::getPhoneNumber)
            .set(postCode).equalTo(row::getPostCode)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.303543+09:00", comments="Source Table: public.customer")
    default int updateByPrimaryKeySelective(Customer row) {
        return update(c ->
            c.set(username).equalToWhenPresent(row::getUsername)
            .set(email).equalToWhenPresent(row::getEmail)
            .set(phoneNumber).equalToWhenPresent(row::getPhoneNumber)
            .set(postCode).equalToWhenPresent(row::getPostCode)
            .where(id, isEqualTo(row::getId))
        );
    }
}