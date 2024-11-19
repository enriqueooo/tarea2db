CREATE TABLE IF NOT EXISTS customer(
    id SERIAL,
    full_name VARCHAR (255) NOT NULL,
    address VARCHAR(255),
    age INT,
    email VARCHAR(255),
    PRIMARY KEY (id)
);