CREATE TABLE tb_garage (
    id BIGSERIAL PRIMARY KEY,
    car_brand VARCHAR(50) NOT NULL,
    license_plate VARCHAR(8) NOT NULL UNIQUE,
    model VARCHAR(50),
    color VARCHAR(20) NOT NULL,
    entry_date TIMESTAMP,
    exit_date TIMESTAMP,
    value DECIMAL(10, 2),
    discount DECIMAL(10, 2),
    receipt VARCHAR(255),
    client_id BIGINT,
    parking_spot_id BIGINT,
    created_date DATE,
    modification_date DATE,
    created_by VARCHAR(60),
    update_by VARCHAR(60),
    FOREIGN KEY (client_id) REFERENCES tb_client(id) ON DELETE SET NULL,
    FOREIGN KEY (parking_spot_id) REFERENCES tb_parking_spot(id) ON DELETE SET NULL
);
