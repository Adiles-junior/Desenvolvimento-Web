## **1 - O que é uma activity?**

Activity são componentes de qualquer aplicativo Android, e todo aplicativo tem pelo menos uma, ela é uma tela no seu aplicativo, e ela é a primeira classe que você vai criar no seu projeto, o Android inicia como uma Instância activity e ele invoca por padrão alguns métodos dessa activity que que é o ciclo de vida da nossa activity.

## **2 - Como funciona o ciclo de vida de uma activity?**

Esse ciclo é importante, porque cada ponto dele fornece uma oportunidade de colocar uma determinada ação. Pode ser uma configuração, quando uma Activity é iniciada, ou a limpeza de váriaveis e objetos, quando ela é pausada.

- OnCreate é usado para configurar a interface do usuário, usar setContentView e iniciar outras partes estáticas da atividade.
- OnStart é executado depois que a Activity é enviada para segundo plano. Isso torna o método onStart um ótimo lugar para garantir que todos os recursos necessários ainda estejam disponíveis. 
- OnResume é acionado quando a Activity se inicia e quando é reiniciada. Ele é acionado sempre que a Activity voltar para o primeiro plano, um bom lugar para fazer coisas como obter Intents e dados extras. 
- OnPause é chamado quando a atividade sai do primeiro plano. Isso pode significar que uma janela de diálogo está sendo exibida na tela ou pode significar que esta é a primeira etapa para interromper a atividade. Isso torna o onPause um local ideal para tarefas como interromper animações, salvar dados e liberar recursos do sistema. Tudo liberado neste método deve ser reconfigurado no método onResume.
- OnStop é chamado quando a Activity não está mais visível para o usuário. Isso pode ser porque ela está sendo destruída ou porque outra Activity foi reiniciada e está na frente dela. É onde são liberados todos os recursos que não são mais utilizados pelo usuário. quando destruído.
- OnDestroy é chamado quando a Activity está prestes a ser destruída. Esta é a última chamada que a atividade receberá antes de terminar.

## **3 - O que é e qual a função do Adapter e do Viewholder?**

ViewHolder é usado para manter uma referência ao ID do componente que criamos no layout. Com isso é possível ter um link para cada item da lista, e o que acontece com cada componente desse item, por exemplo, se criarmos um layout para indicar como vai ficar cada item da nossa lista. Esse layout contém um TextView e um ImageButton, pode ser referenciado pelo ID de cada componente que o TextView está associado ao ID "x" e o ImageButton está associado ao ID "y". 

Adapter é onde acontece a junção da nossa lista (que contém todos os dados que desejamos exibir no RecyclerView) com o nosso layout, ou seja, dentro do Adapter é que será montada toda a nossa lista de acordo com o modelo de layout que desenhamos e, por conta do Adapter, montar item por item. Podemos programar seus eventos, alterar seus atributos e controlar quaisquer funcionalidade de cada item (objeto) presente na tela e na nossa programação.

## **4 - O que é Retrofit e por que utilizar ao invés de criar as chamadas manualmente?**

A API Retrofit é composta pelo uso de outras APIs para garantir aquilo que ela promove de melhor, a conexão e consumo de webservices padrão RESTful. A Square utilizou padrões da API padrão Android/Java para paralelizar as requisições usando Executors, GSON para serialidade das respostas JSON recebidas e OkHttp para tratar de conectar, efetuar cache e fazer chamadas HTTP, mantida pela mesma Square.
