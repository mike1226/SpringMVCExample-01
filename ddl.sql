CREATE TABLE Country (
 MstCountryCD character varying(10) NOT NULL,
 MstCountryNanme CHAR(20),
 UpdateDt  DECIMAL(10),
 DeleteDt DECIMAL(10)
);

ALTER TABLE Country ADD CONSTRAINT PK_Country PRIMARY KEY (MstCountryCD);


CREATE TABLE Province (
 ProvCode CHAR(10) NOT NULL,
 MstCountryCD character varying(10) NOT NULL,
 ProvName CHAR(20) NOT NULL
);

ALTER TABLE Province ADD CONSTRAINT PK_Province PRIMARY KEY (ProvCode,MstCountryCD);


ALTER TABLE Province ADD CONSTRAINT FK_Province_0 FOREIGN KEY (MstCountryCD) REFERENCES Country (MstCountryCD);

INSERT INTO Country (MstCountryNanme,MstCountryCD)
VALUES
  ('Poland','5492'),
  ('Singapore','6721'),
  ('Netherlands','2173'),
  ('Brazil','1713'),
  ('Philippines','4521'),
  ('Austria','9357'),
  ('Costa Rica','5827'),
  ('Poland','5657'),
  ('Nigeria','7672'),
  ('Italy','1451'),
  ('Ukraine','4222'),
  ('South Korea','6217'),
  ('South Africa','3738'),
  ('India','3489'),
  ('Brazil','7026');


  INSERT INTO Province (ProvName,ProvCode,MstCountryCD)
  VALUES
  ('Gilgit Baltistan','48273','5492'),
  ('Voronezh Oblast','66361','5492'),
  ('Xīnán','668562','5492'),
  ('Utah','854524','5492'),
  ('Lào Cai','1548-1275','5492'),
  ('New South Wales','8564 KR','5492'),
  ('Junín','61142-161','5492'),
  ('Guerrero','8851','5492'),
  ('Lima','89075','5492'),
  ('Oost-Vlaanderen','A8V 1B5','5492'),
  ('West-Vlaanderen','24514','5492'),
  ('Bremen','14261','5492'),
  ('Saskatchewan','47264-64868','5492'),
  ('Małopolskie','38845','5492'),
  ('Kaliningrad Oblast','7875','5492'),
  ('Gilgit Baltistan','388423','3489'),
  ('Katsina','17151','3489'),
  ('Limburg','4573','3489'),
  ('Gyeonggi','92225','3489'),
  ('Cartago','387768','3489'),
  ('Paraíba','33751','3489'),
  ('Pernambuco','28123','3489'),
  ('South Island','802342','3489'),
  ('Gauteng','44116','3489'),
  ('New South Wales','12734-21512','3489');

