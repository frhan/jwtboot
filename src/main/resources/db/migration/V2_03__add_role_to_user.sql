ALTER TABLE users
ADD COLUMN role_id bigint;

ALTER TABLE users
ADD FOREIGN KEY (role_id) REFERENCES user_roles(id);