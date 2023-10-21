create table categorias (
    idcategorias int primary key,
    categoria varchar(45)
);

create table fornecedores (
    idfornecedores int primary key,
    fornecedor varchar(45)
);

create table produtos (
    idprodutos int primary key,
    descriçao varchar(45),
    idcategorias int,
    idfornecedores int,
    preço decimal(8, 2),
    foreign key (idcategorias) references categorias(idcategorias),
    foreign key (idfornecedores) references fornecedores(idfornecedores)
);

create table clientes (
    idclientes int primary key,
    cliente varchar(45)
);

create table compras (
    idcompras int primary key,
    idclientes int,
    datacompra date,
    foreign key (idclientes) references clientes(idclientes)
);

create table vendas (
    idvendas int primary key,
    idclientes int,
    datavenda date,
    foreign key (idclientes) references clientes(idclientes)
);

create table itensvenda (
    idvendas int,
    idprodutos int,
    quantidade int,
    preço decimal(8, 2),
    foreign key (idvendas) references vendas(idvendas),
    foreign key (idprodutos) references produtos(idprodutos)
);
