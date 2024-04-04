USE loja;

INSERT INTO pedidos(codigoPedidos, dataPedido, dataEntrega, codigoVendedor, codigoCliente) VALUES
(01, NOW(), '20240404', 01, 01),
(02, NOW(), '20240404', 02, 02),
(03, NOW(), '20240404', 03, 03),
(04, NOW(), '20240404', 04, 04),
(05, NOW(), '20240404', 05, 05);

SELECT * FROM pedidos;