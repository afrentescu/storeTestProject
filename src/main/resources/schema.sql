
CREATE TABLE Category (categoryId number, name varchar,
 PRIMARY KEY (categoryId));

CREATE TABLE Product (productId int not null,
 name varchar , quantity number,
 price number , categoryId int,
PRIMARY KEY (productId),
 FOREIGN KEY (categoryId) REFERENCES Category(categoryId));
