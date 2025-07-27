CREATE DATABASE IF NOT EXISTS employees;
USE employees;

CREATE TABLE IF NOT EXISTS employee (
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE
);

INSERT INTO employee (id, name, department, salary) VALUES
('E001', 'John Doe', 'HR', 55000),
('E002', 'Jane Smith', 'Finance', 62000),
('E003', 'Alice Johnson', 'Engineering', 75000),
('E004', 'Bob Brown', 'Sales', 58000);