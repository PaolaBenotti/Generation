CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	 id_categoria int auto_increment,
	 sabor varchar (55),
     borda boolean,
     entrega varchar (55) ,
     
      PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_pizza(
       id_pizza int auto_increment,
       nome varchar(55),
       acompanhamento varchar (55),
       promocao varchar (55),
       fidelidade varchar (55),
       tempo varchar (55),
	   preco int,
       fk_categoria int,
       
       PRIMARY KEY (id_pizza),
       FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (sabor, borda , entrega) VALUES
("Salgada", true, true),
("Doce", true, false),
("Salgada", false, true),
("Salgada",false, false),
("Doce", false, false);

INSERT INTO tb_pizza (nome,acompanhamento,tempo,fidelidade,promocao,fk_categoria,preco) VALUES
("Calabresa", "coca-cola", "20 min", false , false, 1,25 ),
("Frango com catupiry","Pepsi","30 min", true, true,4,30),
("Portuguesa", "sem", "40 min", false , true ,3,27),
("Sensação", "sem","30 min", true, false,2,30);

SELECT * FROM tb_pizza where preco > 45;
SELECT * FROM tb_pizza where preco <= 29 or preco <= 60;
SELECT * FROM tb_pizza where tb_pizza.nome like "%c%";

SELECT*FROM tb_pizza
INNER JOIN tb_categoria on tb_categoria.id_categoria = tb_pizza.fk_categoria;

SELECT * FROM tb_pizza where nome = "Portuguesa";

UPDATE tb_pizza set fidelidade = false where id_pizza = 8;