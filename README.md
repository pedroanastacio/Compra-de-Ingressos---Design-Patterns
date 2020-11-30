# Compra-de-Ingressos---Design-Patterns

O projeto está situado em um contexto fictício de compra de ingresso em site de Sócio Torcedor de um clube de futebol.
Os padrões de projeto escolhidos para a solução do problema foram: Composite, Proxy e Chain of Responsability.

* **Método Proxy**: Usado na função login do site, assim que fizer o login é checado se aquele usuário é torcedor comum ou sócio. Sendo a primeira opção, é gerada uma propaganda mostrando as vantagens de ser sócio com link direcionado para o cadastro;

* **Método Composite**: Usado na funçao de cadastro para Sócio, é gerado diferentes tipos de plano(simples e compostos) em que o usuário poderá escolher quais opções deseja comprar.

* **Método Chain of Responsability**: Usado na função compra de ingresso, de acordo com a categoria de sócio torcedor o usuario pertence, é liberado os produtos em diferentes ordens.


**Alunos**:
* caio.cesar209@gmail.com => Caio César da Rocha Anastácio
* pedro.anastacio013@gmail.com => Pedro Henrique da Rocha Anastácio
