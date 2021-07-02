# ProjetoODS12
# Model Categoria
# 1.	Atributos
ID – Será a primary key gerada automaticamente.
Resíduo – Tipos de resíduos que iremos ter em nosso sistema.
Cadastro Resíduo – Cadastro de novos resíduos que não estão previamente no sistema.
Usuário – O tipo de usuário que ira interagir com a aplicação.
# 2.	Motivo
Dentro das limitações de quantidade de atributos impostos na Table Categoria, decidimos optar por estes descritos acima pois reservamos ela somente para informações ‘’ estáticas ‘’ e que não sofrem variação, neste caso como exemplo, um Resíduo do tipo Plástico, sempre será do tipo Plástico, usaremos esta informação para identificar a qual lixo estamos falando.
Caso surja um novo tipo de Resíduo que não esta inserido na DB previamente, poderemos cadastra-lo, alocando com um ID automático e seu campo de descrição, no caso, o novo  tipo de resíduo, por exemplo: Cadastro – Resíduo Hospitalar.
E na opção de usuário deixamos reservado na Table Categoria pois irá ter mais de um tipo, exemplo, Usuário Residencial, Catador de Lixo, ONGS, Empresas.
