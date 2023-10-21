insert into categorias (idcategorias, categoria)
values
    (1, 'Eletrônicos'),
    (2, 'Roupas'),
    (3, 'Alimentos');

insert into fornecedores (idfornecedores, fornecedor)
values
    (1, 'Fornecedor A'),
    (2, 'Fornecedor B');

insert into produtos (idprodutos, descriçao, idcategorias, idfornecedores, preço)
values
    (1, 'Celular', 1, 1, 500.00),
    (2, 'Camiseta', 2, 2, 20.00),
    (3, 'Arroz', 3, 2, 10.00);

insert into clientes (idclientes, cliente)
values
    (1, 'Cliente 1'),
    (2, 'Cliente 2');

insert into compras (idcompras, idclientes, datacompra)
values
    (1, 1, '2023-10-01'),
    (2, 2, '2023-10-02');

insert into vendas (idvendas, idclientes, datavenda)
values
    (1, 1, '2023-10-03'),
    (2, 2, '2023-10-04');

insert into itensvenda (idvendas, idprodutos, quantidade, preço)
values
    (1, 1, 2, 500.00),
    (2, 2, 3, 20.00);