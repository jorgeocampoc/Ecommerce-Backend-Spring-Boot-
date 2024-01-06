-- default categories --
insert ignore into categories (id, name, description) values ('3cebd0ab-f2d3-4292-b551-84e048f7bc33', 'TRAVEL', 'Mochila de viaje');
insert ignore into categories (id, name, description) values ('260750d6-5998-49b1-8fc3-86f97fa8bb32', 'SPORT', 'Mochila de deporte');
insert ignore into categories (id, name, description) values ('433031dc-c04b-422a-af5b-4dc2c8de6f93', 'SCHOOL', 'Mochila de escuela');
insert ignore into categories (id, name, description) values ('1fffe7ae-d957-44d1-b5ec-ca9ae2544ff0', 'WORK', 'Mochila de trabajo');

 --default roles --
INSERT ignore INTO roles (id, name, description) values ('b07ca104-3dd1-43fd-ad81-51d3f09272aa', 'ADMIN', 'This role is ADMIN');
INSERT ignore INTO roles (id, name, description) values ('54a32a42-2f9d-4b4d-8f1d-dc0c5bce127f', 'USER', 'This role is USER');

-- products default --
insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values ('14d54fb3-b8b5-4620-9d4a-d9ae1fdcd159', 'product A', 'This is a product A', 'img URL',250,10, true,'3cebd0ab-f2d3-4292-b551-84e048f7bc33');
insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values ('a9475eb9-c358-410b-82f1-eb341a0e06f9', 'product B', 'This is a product B', 'img URL',200,5, true,'3cebd0ab-f2d3-4292-b551-84e048f7bc33');
insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values('b5fb7649-6be3-4125-b565-bf0ada846cb5', 'product C', 'This is a product C', 'img URL',150,0, false,'3cebd0ab-f2d3-4292-b551-84e048f7bc33');

insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values ('c75fc147-c32d-4ced-adfb-eaf7142ef7cd', 'product D', 'This is a product D', 'img URL',500,10, true,'260750d6-5998-49b1-8fc3-86f97fa8bb32');
insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values ('eb8ef6eb-8682-4079-b13d-52c1e8645982', 'product E', 'This is a product E', 'img URL',550,15, true,'260750d6-5998-49b1-8fc3-86f97fa8bb32');
insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values ('cb724fcc-fd87-4379-983a-93ff3ea84bc4', 'product F', 'This is a product F', 'img URL',600,20, true,'260750d6-5998-49b1-8fc3-86f97fa8bb32');

insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values('12311536-4d1d-46c7-a301-8e3f830adeba', 'product G', 'This is a product G', 'img URL',1000,20, true,'433031dc-c04b-422a-af5b-4dc2c8de6f93');
insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values('ecf6adfe-e6e8-4c68-a1d0-5a050ca49f6d', 'product H', 'This is a product H', 'img URL',750,10, true,'433031dc-c04b-422a-af5b-4dc2c8de6f93');
insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values('7c60ffab-fe33-4d8a-9ff5-8984252791e1', 'product I', 'This is a product I', 'img URL',500,0, false,'433031dc-c04b-422a-af5b-4dc2c8de6f93');

insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values('2b910da3-bb50-4ecb-9b79-e469e92e6749', 'product J', 'This is a product J', 'img URL',500,10, true,'1fffe7ae-d957-44d1-b5ec-ca9ae2544ff0');
insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values('4aa4cbf0-95c9-4a19-a721-6ffc9f235683', 'product K', 'This is a product K', 'img URL',510,20, true,'1fffe7ae-d957-44d1-b5ec-ca9ae2544ff0');
insert ignore into products (id, name, description, img_url, price, stock, state, category_id) values('d90ee746-16f4-4368-8437-0ec582ccf2c5', 'product L', 'This is a product L', 'img URL',520,30, true,'1fffe7ae-d957-44d1-b5ec-ca9ae2544ff0');


-- Default users --
-- INSERT IGNORE INTO users (id, first_name, last_name, email, ci, age,password, address, role_id) VALUES ('019f1459-2ba9-4e50-8790-b77f2dbe3edb', 'Juan', 'Perez', 'admin@gmail.com','845421',25, '12345', 'La Paz', 'b07ca104-3dd1-43fd-ad81-51d3f09272aa');
-- INSERT IGNORE INTO users (id, first_name, last_name, email, ci, age,password, address, role_id) VALUES ('7c083cd5-3919-4c23-a136-fac659b23c96', 'Ana', 'Perez', 'user@gmail.com','845488',28, '12345', 'El Alto', '54a32a42-2f9d-4b4d-8f1d-dc0c5bce127f');