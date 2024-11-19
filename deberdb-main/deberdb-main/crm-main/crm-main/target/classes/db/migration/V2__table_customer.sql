CREATE TABLE IF NOT EXISTS lead (
                                    id SERIAL,
                                    status VARCHAR(100) NOT NULL,
    source VARCHAR(255),
    customer_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (custome_id) REFERENCES customer (id)
    );


CREATE TABLE IF NOT EXISTS activity (
                                        id SERIAL,
                                        description VARCHAR(255) NOT NULL,
    date TIMESTAMP NOT NULL,
    customer_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY(lead_id)REFERENCES lead(id)
    );