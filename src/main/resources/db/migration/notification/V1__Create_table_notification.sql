CREATE TABLE notification (
  id SERIAL PRIMARY KEY NOT NULL,
  type VARCHAR (50) UNIQUE NOT NULL
);