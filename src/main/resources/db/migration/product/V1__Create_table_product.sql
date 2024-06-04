CREATE TABLE product (
  id int8 PRIMARY KEY NOT NULL DEFAULT nextval('mysequence'),
  name VARCHAR (50) UNIQUE NOT NULL,
  description VARCHAR (256) NOT NULL
);