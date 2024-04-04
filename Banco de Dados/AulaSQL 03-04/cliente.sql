USE loja;
INSERT INTO cliente(codigoCliente, nome, logradouro, numero, bairro, cep, UF, CNPJ, IE) VALUES
(01, 'Flavio Souza', 'Rua Oscar Freire', 32, 'Pinheiros', 5409011, 'SP', 87646985000105, 15),
(02, 'Augusto Lima', 'Avenida Paulista', 55, 'Bairro Bela Vista', 01310930, 'SP', 55646985000105, 5),
(03, 'Paulo de Souza', 'Rua Oscar Freire', 77, 'Pinheiros', 5409011, 'SP', 98446985000105, 8),
(04, 'Marcelo Soares', 'Rua Antonio de Matos', 110, 'Vila das Belezas', 03952120, 'SP', 11646985000105, 11),
(05, 'Vitor do Carmo', 'Avenida Luiz Gushiken', 22, 'Chácara Santana', 05831315, 'SP', 7746985000105, 18);

SELECT * FROM cliente;
