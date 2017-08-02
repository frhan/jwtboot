create table users (
id bigint not null auto_increment,
first_name VARCHAR(50),
last_name VARCHAR(50),
enabled TINYINT(1) DEFAULT 1,
email VARCHAR(50),
password VARCHAR(50) NOT NULL,
user_name VARCHAR(50) NOT NULL,
primary key (id));
