package com.example.servingwebcontent.repository;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class ProvinceEntityDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570188+09:00", comments = "Source Table: public.province")
	public static final ProvinceEntity provinceEntity = new ProvinceEntity();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570404+09:00", comments = "Source field: public.province.provcode")
	public static final SqlColumn<String> provcode = provinceEntity.provcode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570444+09:00", comments = "Source field: public.province.mstcountrycd")
	public static final SqlColumn<String> mstcountrycd = provinceEntity.mstcountrycd;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570477+09:00", comments = "Source field: public.province.provname")
	public static final SqlColumn<String> provname = provinceEntity.provname;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570343+09:00", comments = "Source Table: public.province")
	public static final class ProvinceEntity extends AliasableSqlTable<ProvinceEntity> {
		public final SqlColumn<String> provcode = column("provcode", JDBCType.CHAR);
		public final SqlColumn<String> mstcountrycd = column("mstcountrycd", JDBCType.CHAR);
		public final SqlColumn<String> provname = column("provname", JDBCType.CHAR);

		public ProvinceEntity() {
			super("public.province", ProvinceEntity::new);
		}
	}
}