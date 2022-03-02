DROP TABLE IF EXISTS moneda;

CREATE TABLE moneda (
 id_moneda INT AUTO_INCREMENT PRIMARY KEY,
 descripcion VARCHAR(250) NOT NULL,
 valor_compra NUMBER,
 valor_venta NUMBER
);