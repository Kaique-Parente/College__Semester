use loja;
insert into produtos(codigoProduto, nome, precoUnitario, quantidadeEstoque, statusproduto) values 
(01, 'Laranja', 5, 1000, 1),
(02, 'Arroz', 22, 200, 1),
(03, 'Feijão', 10, 120, 1),
(04, 'Esponja', 2, 0, 0),
(05, 'Oléo', 10, 250, 1);

SELECT * FROM produtos;