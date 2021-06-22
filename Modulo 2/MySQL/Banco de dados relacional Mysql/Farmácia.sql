
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	 id_categoria int auto_increment,
	 produto varchar (55),
     receita boolean,
     pagamento varchar (55) ,
     
      PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto(
       id_produto int auto_increment,
       nome varchar(55),
       preco varchar (55),
       validade date,
       estoque varchar (55),
       entrega varchar (55),
       fk_categoria int,
       
       PRIMARY KEY (id_produto),
       FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (produto,receita,pagamento) VALUES
("Remédio", true, true),
("Remédio", true, false),
("Cosmético", false, true),
("Cosmético",false, false),
("Infantil", false, false);

INSERT INTO tb_produto (nome, preco, validade,estoque,entrega, fk_categoria) VALUES
("Dipirona", 5, 20221110, true , false, 2),
("Loratadina", 10, 20250312, true , false, 3),
("Sabonete", 10, 20210523, false , false, 4),
("Fralda", 40, 20250830, false , false, 5),
("Lenço demaquilante",18,20260817,false,true,3);


SELECT * FROM tb_produto where preco > 50;
SELECT * FROM tb_produto where preco <= 3 or preco <= 60;
SELECT * FROM tb_produto where tb_produto.nome like "%b%";

SELECT*FROM tb_produto
INNER JOIN tb_categoria on tb_categoria.id_categoria = tb_produto.fk_categoria;

SELECT * FROM tb_produto where nome = "Sabonete";

UPDATE tb_produto set preco = 40 where id_produto = 55;

SELECT * FROM db_farmacia_do_bem

