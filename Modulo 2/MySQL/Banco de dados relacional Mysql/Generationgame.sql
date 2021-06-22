
USE db_generation_game_online;

CREATE TABLE tb_classe(
	 id_classe int auto_increment,
	 poder varchar (55),
     vida varchar (55),
     nivel int,
     
      PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagem(
       id_personagem int auto_increment,
       nome varchar(55),
       gênero varchar (55),
       pet varchar (55),
       ataque int,
       defesa int,
       fk_classe int,
       
       PRIMARY KEY (id_personagem),
       FOREIGN KEY (fk_classe) REFERENCES tb_classe (id_classe)
);

INSERT INTO tb_classe (poder, vida, nivel) VALUES
("Força", "5", 7),
("Velocidade", "2", 33),
("Tranformação","4", 21),
("Corgem","4", 42),
("Invisível", "3", 8);

INSERT INTO tb_personagem (nome, gênero, pet,ataque, defesa, fk_classe) VALUES
("Aurora", "Feminino", "lontra", 1000, 3000, 1),
("Gus", "Masculino","Águia", 3000,3000, 4),
("Jean ","Masculino", "gato" , 3000, 2000, 3),
("Lala","Feminino","Rato",1000,6000, 2),
("Philip", "Masculino","Barata",2000,3000, 1);


SELECT * FROM tb_personagem where ataque > 2000;
SELECT * FROM tb_personagem where ataque <= 1000 or ataque <= 2000;
SELECT * FROM tb_personagem where tb_personagem.nome like "%c%";

SELECT*FROM tb_personagem
INNER JOIN tb_classe on tb_classe.id_classe = tb_personagem.fk_classe;

SELECT * FROM tb_personagem where pet = "Rato";

