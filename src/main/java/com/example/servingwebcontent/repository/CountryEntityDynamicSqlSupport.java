package com.example.servingwebcontent.repository;

import java.sql.JDBCType;

import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

import jakarta.annotation.Generated;

public final class CountryEntityDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.567786+09:00", comments = "Source Table: public.country")
	public static final CountryEntity countryEntity = new CountryEntity();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.567943+09:00", comments = "Source field: public.country.mstcountrycd")
	public static final SqlColumn<String> mstcountrycd = countryEntity.mstcountrycd;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568012+09:00", comments = "Source field: public.country.mstcountrynanme")
	public static final SqlColumn<String> mstcountrynanme = countryEntity.mstcountrynanme;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568073+09:00", comments = "Source field: public.country.updatedt")
	public static final SqlColumn<Long> updatedt = countryEntity.updatedt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.568133+09:00", comments = "Source field: public.country.deletedt")
	public static final SqlColumn<Long> deletedt = countryEntity.deletedt;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.567869+09:00", comments = "Source Table: public.country")
	public static final class CountryEntity extends AliasableSqlTable<CountryEntity> {
		public final SqlColumn<String> mstcountrycd = column("mstcountrycd", JDBCType.VARCHAR);
		public final SqlColumn<String> mstcountrynanme = column("mstcountrynanme", JDBCType.VARCHAR);
		public final SqlColumn<Long> updatedt = column("updatedt", JDBCType.NUMERIC);
		public final SqlColumn<Long> deletedt = column("deletedt", JDBCType.NUMERIC);

		public CountryEntity() {
			super("public.country", CountryEntity::new);
		}
	}
}