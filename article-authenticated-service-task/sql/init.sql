CREATE TABLE users(
  id serial primary key,
  username varchar(50)  NOT NULL,
  password varchar(500) NOT NULL
);


CREATE TABLE roles(
  id serial primary key,
  user_id int not null,
  name varchar(50)  NOT NULL
);


CREATE TABLE articles(
  id serial primary key,
  title varchar(50)  NOT NULL,
  text varchar  NOT NULL
);

INSERT INTO users
(id, username, "password")
VALUES(nextval('users_id_seq'::regclass), 'admin', '$2a$10$fSWiP7g0Ri0zz7ZiRCs0y.2JgMXvg3P2YdfRGFwJN/qUGdDv8Vb62');

-- password stored in Bcrypt
