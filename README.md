Ciclo de vida das Atividades

Ao longo da vida util de uma atividade, ela passa por varios estados.
Uma serie de callbacks sao utilizados para lidar com transiçoes entre estados.

1) onCreate()

Esse callback é executado pelo sistema quando sua atividade é criada.
É aqui que é chamado o metodo setContentView() para definir o layout da interface do usuario na activity.

2) onStart()

Esse callback é executado quando o onCreate() termina, após o onCreate() a Activity entra no estado de iniciada e se torna visivel.  
É aqui que voce deve fazer os preparativos finais da atividade para ir para o primeiro plano e se tornar interativa com o usuario. 

Se voce realizar chamadas mais pesadas no onCreate() a tela do celular do usuario ficará preta/branca aguardando o carregamento dos metodo/dados,
somente apos o carregamento das informaçoes é que a activity se tornara visivel para o usuario. 
Um exemplo disso é se voce colocar chamadas de banco de dados por exemplo. 

3) onResume()

O sistema invoca esse callback imediatamente antes de a atividade começar a interagir com o usuario. 
A maior parte da funcionalidade de um app é implementada no onResume() 
