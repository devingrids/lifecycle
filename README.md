Ciclo de vida das Atividades

![Ciclo de Vida Android](https://hermes.dio.me/articles/cover/b00c57de-0695-4690-a35c-3dcc2bb1e68e.jpg)

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

4) onPause()
O sistema invoca esse callback quando a activity sai de foco. Quando a activity perde o foco, ela entra em um estado de "Pausado"
uma activity no estado "Pausado" pode continuar atualizando a IU se o usuario estiver esperando por isso.
Exemplos de uma dessas atividades incluem a exibição da tela de um mapa de navegação ou de um player de mídia sendo reproduzido. 
Mesmo que essas atividades percam o foco, o usuário espera que a IU continue sendo atualizada. 
Não use onPause() para salvar dados do app ou do usuário, fazer chamada de rede ou executar transaçoes de banco de dados. 

5) onStop()
O sistema chama onStop() quando a activity não está mais visível para o usuário. Isso pode acontecer porque a atividade está sendo destruída,
uma nova atividade está sendo iniciada ou uma atividade existente está entrando em um estado "Retomado" e está cobrindo a atividade interrompida.
Em todos esses casos, a atividade interrompida não fica mais visível.

6) onDestroy()
O sistema invoca esse callback antes de uma atividade ser destruída.
Esse é o último callback que a atividade recebe. onDestroy() normalmente é implementado para garantir que todos os recursos de uma atividade
sejam liberados quando ela (ou o processo que a contém) for destruída.
   

