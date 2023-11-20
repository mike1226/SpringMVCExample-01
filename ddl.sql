DROP TABLE IF EXISTS public.customer;
DROP TABLE IF EXISTS public.Province;
DROP TABLE IF EXISTS public.Country;

CREATE TABLE IF NOT EXISTS public.customer
(
    id character varying(10) COLLATE pg_catalog."default" NOT NULL,
    username character varying(50) COLLATE pg_catalog."default" NOT NULL,
    email character varying(50) COLLATE pg_catalog."default" NOT NULL,
    phone_number character varying(11) COLLATE pg_catalog."default" NOT NULL,
    post_code character varying(7) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT customer_pkey PRIMARY KEY (id)
);

INSERT INTO customer VALUES ('001', 'user001', 'test.user.001@example.com', '12345678901', '1234567');
INSERT INTO customer VALUES ('002', 'user002', 'test.user.002@example.com', '23456789012', '2345671');
INSERT INTO customer VALUES ('003', 'user003', 'test.user.003@example.com', '34567890123', '3456712');
INSERT INTO customer VALUES ('004', 'user004', 'test.user.004@example.com', '45678901234', '4567123');
INSERT INTO customer VALUES ('005', 'user005', 'test.user.005@example.com', '56789012345', '5671234');
INSERT INTO customer VALUES ('006', 'user006', 'test.user.006@example.com', '67890123456', '6712345');
INSERT INTO customer VALUES ('007', 'user007', 'test.user.007@example.com', '78901234567', '7123456');
INSERT INTO customer VALUES ('008', 'user008', 'test.user.008@example.com', '89012345678', '1234567');
INSERT INTO customer VALUES ('009', 'user009', 'test.user.009@example.com', '90123456789', '2345671');
INSERT INTO customer VALUES ('010', 'user010', 'test.user.010@example.com', '01234567890', '3456712');



CREATE TABLE Country (
 MstCountryCD varchar(10) NOT NULL,
 MstCountryNanme varchar(20),
 UpdateDt  DECIMAL(10),
 DeleteDt DECIMAL(10)
);

ALTER TABLE Country ADD CONSTRAINT PK_Country PRIMARY KEY (MstCountryCD);



CREATE TABLE Province (
 ProvCode varchar(10) NOT NULL,
 MstCountryCD varchar(10) NOT NULL,
 ProvName varchar(20) NOT NULL
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
  ('Lào Cai','15481275','5492'),
  ('New South Wales','8564KR','5492'),
  ('Junín','61142161','5492'),
  ('Guerrero','8851','5492'),
  ('Lima','89075','5492'),
  ('Oost-Vlaanderen','A8V1B5','5492'),
  ('West-Vlaanderen','24514','5492'),
  ('Bremen','14261','5492'),
  ('Saskatchewan','47264868','5492'),
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
  ('New South Wales','1273212','3489');

