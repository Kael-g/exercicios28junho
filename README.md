## Exemplos SOLID
### (S)ingle Responsability
Classes **Pessoa** e **Telefone**, onde pessoa pode usar telefone para fazer uma ligação.
### (O)pen-Closed
Classe **Torneira** enche um objeto que implementa a interface **Recipiente**. Todo recipiente deve calcular sua capacidade em Litros.
### (L)iskov Substitution
Classes **Cachorro** e **Gato** são extensões de **Pet**. É possível usar os métodos de Pet para Cachorro e Gato, mesmo que estes tenham sido alterados nas classes filhas.
### (I)nterface Segregation
Interfaces **Acelerador** e **Portas** são implementadas na classe **Carro**, porém na classe **Moto** apenas Acelerador é implementada.
### (D)ependency Inversion
Classe **LivrariaOnline** tem como atributo um objeto da classe **Livro** que implementa a interface **Envio**.
