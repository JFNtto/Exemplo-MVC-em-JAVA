
# Projeto utilizando o padrão mvc em JAVA




## O que é o padrão MVC (Model-View-Controller)

Ele é um padrão de projeto para a construção de arquiteturas de software no qual divide o programa em 3 camadas:

| Camada | Descrição|
|-------------|-------------|
| Model| Representa os dados da aplicação e a lógica de negócio.É nele que os dados serão manipulados, faz a <br>interação com o banco de dados ou alguma outra forma de armazenamento |
| View | Essa é a interface gráfica, ela é responsável por exibir a parte visual dos dados<br> e repassar ações para o controller |
| Controller | Atua como intermediário entre o Model e a View. Recebe as entradas do usuário<br> a partir da View, processa essas entradas (interagindo com o Model)<br> e atualiza a View com os resultados |


<br><br>


Neste exemplo, estamos cadastrando, excluindo e exibindo jogos e consoles (para simular um sistema de loja de jogos).

Na parte do **Model**, teremos as listas e as classes que irão salvar os itens cadastrados, simulando um banco de dados.

Na **View**, teremos todas as telas que fazem parte do programa.

E no **Controller**, teremos todas as funções que fazem o intermediário entre a View e o Model.

<br><br>

Caso deseje abrir o código no seu computador, verifique a versão do java. O programa foi feito com  a versão 22 do jdk
