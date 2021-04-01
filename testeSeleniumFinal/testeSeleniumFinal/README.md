# Teste Selenium Accenture


## Descrição do teste
### O projeto consiste em preencher os formularios do site da Sampleapp e enviar, validando todas as ações.

Cenário: Verificar a mensagem final depois que preencher o formulario.
Dado que entro no site
E preencho o formulario da aba Enter Vehicle Data e clico em next
E preencho o formulario da aba Enter Insurant Data e clicar em next
E preencho o formulario da aba Enter Product Data e clicar em next
E preencho o formulario da aba Select Price Option e clicar em next
E preencho o formulario da aba Send Quote e clicar em next
Entao devo ver a mensagem "Sending e-mail success!"

### Tecnologias utilizadas no projeto
<b>Java:<b> Linguagem de programação para desenvolvimento da aplicação.<br>
<b>Maven:<b> Gerenciador de dependências para o Java.<br>
<b>Cucumber:<b> Framework responsável por traduzir uma linguagem humana em código Java.<br>
<b>Selenium:<b>Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento.<br>

### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Instalar Chrome driver
https://chromedriver.chromium.org/downloads
- Verificar se o JAVA_HOME está configurado em seu computador

## Como utilizar
- Clone do projeto
 ```bash
git clone https://github.com/Palinha07/estrutrura-projeto-grupo
 ```

- Entrando na pasta do projeto
 ```bash
cd estrutrura-projeto-grupo
 ```

- Configurando selenium em seu computador
Colocar o arquivo do Chrome drive descompactado dentro da pasta driver na rapiz do projeto.
<br>

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```


### Dúvidas
Qualquer dúvida, entre em contato comigo pelo email: kerodsg@gmail.com<br>
Ficarei feliz em ajudar.