CREATE TABLE product (id number not null primary key , name varchar , quantity number, price number , categoryId number foreign key category(id));
CREATE TABLE category (id number, name varchar );

INSERT INTO product (id, name, quantity, price, categoryId) VALUES (1, 'Kindle',124, 75.54,1);
INSERT INTO product (id, name, quantity, price, categoryId) VALUES (2, 'Boxa',35, 130.00,1);
INSERT INTO product (id, name, quantity, price, categoryId) VALUES (3, 'Hanorac',12, 315.12,2);
INSERT INTO product (id, name, quantity, price, categoryId) VALUES (4, 'Janta',20, 200,3);
INSERT INTO product (id, name, quantity, price, categoryId) VALUES (5, 'Far',8, 240.50,3);


INSERT INTO category (id, name) VALUES (1, 'Device-uri');
INSERT INTO category (id, name) VALUES (2, 'Imbracaminte');
INSERT INTO category (id, name) VALUES (3, 'Auto');