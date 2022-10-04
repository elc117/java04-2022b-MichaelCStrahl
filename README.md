### Discução do código

1. Você consegue identificar alguma redundância nos códigos (dentro de uma mesma classe ou em classes diferentes)?

    Identifiquei que poderia existir uma classe pai `People.class` a fim de extrair atributos e métodos em comum entre as classes `Student.class` e `Professor.class`.

2. O que aconteceria se fosse necessário armazenar outros atributos sobre estudantes e professores? (por exemplo, CPF, data de nascimento, telefone, etc?)

    Nesse caso, sem utilizar o encapsulamento seria necessário criar os atributos e métodos em ambas classes separadamente.

3. O que aconteceria na classe `Laboratory` se tivéssemos outras categorias de membros além de estudantes e professores (técnicos, administradores, etc.)?

    No modelo atual, seria necessário implementar novas classes, com novos atributos e métodos específicos para criar a lista de objetos dentro da classe `Laboratory.class`. É necessário também criar novos atributos do tipo lista para cada usuário, assim como ajustar os métodos para implementar os novos objetos.