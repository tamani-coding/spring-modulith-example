CREATE TABLE notification (
  id int8 PRIMARY KEY NOT NULL DEFAULT nextval('mysequence'),
  type VARCHAR (50) UNIQUE NOT NULL
);