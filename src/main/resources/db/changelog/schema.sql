CREATE TABLE  CUSTOMERS (
        id int PRIMARY KEY auto_increment,
        name VARCHAR(15) NOT NULL,
        surname VARCHAR(15) NOT NULL,
        age int check (age > 0) DEFAULT 0,
        phone_number int
);

CREATE TABLE  ORDERS (
        id int PRIMARY KEY auto_increment,
        date date,
        customer_id int,
        product_name VARCHAR(15),
        amount int,
        FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(id)
);