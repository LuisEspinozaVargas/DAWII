CREATE TABLE client (
                        unique_code VARCHAR(250) PRIMARY KEY,
                        first_name VARCHAR(100) NOT NULL,
                        last_name VARCHAR(100) NOT NULL,
                        document_type VARCHAR(50) NOT NULL,
                        document_number VARCHAR(50) NOT NULL
);

-- Inserción de dos registros
INSERT INTO client (unique_code, first_name, last_name, document_type, document_number)
VALUES ('d0eaf8f0-1b10-4a7f-b93d-f401a507db63', 'Jhan', 'Gutierrez', 'PASAPORTE', 'A12345678');

INSERT INTO client (unique_code, first_name, last_name, document_type, document_number)
VALUES ('a213d447-29fa-4d0b-b69b-b813057c3d6e', 'Jeyson', 'Flores', 'DNI', '76070690');
