--liquibase formatted sql

--changeset AlOch:1025

insert into customers (name, surname, age, phone_number) values ("Alexey", "Ivanov", 25, 2021111111);
insert into customers (name, surname, age, phone_number) values ("Ivan", "Stepanov", 30, 2022222222);
insert into customers (name, surname, age, phone_number) values ("Alena", "Och", 36, 2023333333);
insert into customers (name, surname, age, phone_number) values ("Nataly", "Alekseeva", 23, 2024444444);
insert into customers (name, surname, age, phone_number) values ("Stepan", "Voichik", 33, 2025555555);

insert into orders (date, customer_id, product_name, amount) values ('2021-02-15' , 1, "chocolate", 5);
insert into orders (date, customer_id, product_name, amount) values ('2021-02-15' , 1, "zephir", 3);
insert into orders (date, customer_id, product_name, amount) values ('2021-02-16' , 2, "marshmellow", 8);
insert into orders (date, customer_id, product_name, amount) values ('2021-02-17' , 3, "dryfruit", 2);
insert into orders (date, customer_id, product_name, amount) values ('2021-02-18' , 4, "candy", 11);
insert into orders (date, customer_id, product_name, amount) values ('2021-02-19' , 5, "pastila", 6);
