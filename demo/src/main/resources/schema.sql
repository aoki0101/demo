CREATE TABLE IF NOT EXISTS item (
  id bigint NOT NULL AUTO_INCREMENT,
  name varchar(255),
  price real,
  vendor varchar(255),
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS login_user (
  id bigint NOT NULL AUTO_INCREMENT,
  userid varchar(255),
  password varchar(255),
  PRIMARY KEY (id)
);



