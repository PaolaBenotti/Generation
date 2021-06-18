create database db_rh;

use db_rh;

create table tb_empresa(

    id bigint(5)  auto_increment,
    nome varchar(30) not null,
    idade(30) not null,
    endereco(30) not null,
    cargo(30) not null
    salario decimal (10,2) not null,
    setor(30) not null,
    ativo boolean
    primary key (id)
)

select * from tb_empresa;

INSERT INTO tb_empresa(nome,idade,endereco,cargo,salario,setor,ativo) VALUES ("Paulo","23","R.Sol","estagiário","1800,00","administrativo", true);
INSERT INTO tb_empresa(nome,idade,endereco,cargo,salario,setor,ativo) VALUES ("Ana","43","R.Mar","Senior","4000,00","administrativo", true);
INSERT INTO tb_empresa(nome,idade,endereco,cargo,salario,setor,ativo) VALUES ("Carlos","26","R.Rio","operador","2600,00","estoque", true);
INSERT INTO tb_empresa(nome,idade,endereco,cargo,salario,setor,ativo) VALUES ("Joana","23","R.Parana","Junior","4000,00","TI", true);
INSERT INTO tb_empresa(nome,idade,endereco,cargo,salario,setor,ativo) VALUES ("Flavia","37","R.Gato","Pleno","7000,00","Vendas", true);

select * from tb_empresa where salario < 2000;
select * from tb_empresa where salario > 2000;

update tb_empresa set nome = "Paulo", salario = 2800.00
 where id = 5;
 
 select * from tb_funcionarios;