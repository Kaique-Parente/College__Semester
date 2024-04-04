SELECT cliente.codigoCliente,
cliente.nome,
pedidos.codigoCliente,
pedidos.dataPedido,
vendedores.codigoVendedor,
vendedores.nome
FROM cliente INNER JOIN pedidos
ON cliente.codigoCliente = pedidos.codigoCliente
INNER JOIN vendedores
ON pedidos.codigoVendedor = vendedores.codigoVendedor;