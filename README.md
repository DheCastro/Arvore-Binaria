# Arvore-Binaria
Projeto de REST com Spring para cálculo de nós de árvore binária

A aplicação(módulo) foi feita com Springboot e adicionalmente foi colocado o <a href="https://swagger.io/">Swagger</a>, 
implementação da especificação <a href="http://springfox.github.io/springfox/">SpringFox</a>, que permite criar documentação online de APIs REST.

Ao colocar a aplicação online, acessar o seguinte endereço: <a href="url">http://localhost:8080/swagger-ui.html</a>,
clicar em <b>aplicacao-arvore-resource</b> e em seguida em <b>GET</b>. Feito isso, uma interface abrirá e permitirá
o teste online de requisições na aplicação.

# Exemplo:

<b>Em uma árvore com nós:</b> 10 (raiz), 20, 30, 40, 35, 60, 70, 80, 90, 100

<b>A requisição:</b> <a href="url">http://localhost:8080/aplicacaoarvore/calcula/30</a> retornará como resultado o valor 475,
que é a soma dos nós de 40 a 100 (subsequentes ao nó 30).

O endpoint é: http://localhost:8080/aplicacaoarvore/calcula/{valordonodepartida} 

