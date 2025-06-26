DROP TABLE IF EXISTS product;

CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    price INTEGER,
    creation_date TIMESTAMP
);
