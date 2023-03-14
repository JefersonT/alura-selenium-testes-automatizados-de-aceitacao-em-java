# Selenium: testes automatizados de aceitação em Java
## AULA 01. Controlando o navegador
Nesta aula, aprendemos:

- Existem diversos módulos do Selenium, dentre eles o WebDriver;
- Aprendemos como adicionar o Selenium WebDriver no projeto, como um dependendência do Maven;
- Aprendemos a adicionar o Driver do navegador em nosso projeto;
- Aprendemos a escrever um código de teste que abre uma janela do navegador e navega para uma página, utilizando a API do selenium WebDriver.

## AULA 02. Testando o login
Nesta aula, aprendemos:

- Que é possível recuperar elementos na página utilizando o método `findElement()`;
- Que é possível recuperar o código fonte da página utilizando o método `getPageSource()`;
- Que é possível recuperar o url atual do browser utilizando o método `getCurrentUrl()`;
- Que devemos utilizar o método `sendKeys()` para enviar textos para os `inputs` da página;
- Que uma das maneiras de submeter um formulário é via método `submit()`.

## AULA 03. Page Objects
Nesta aula, aprendemos:

- O que é o padrão Page Object;
- As vantagens de se utilizar o padrão Page Object;
- Como implementar o padrão Page Object com classes Java.

## AULA 04. Testes do cadastro de leilão

Nesta aula, aprendemos:

- Que o método `findElement()` devolve um objeto do tipo `WebElement`;
- Que não devemos enviar `null` pelo método `sendKeys()` ao testar campos vazios;
- Que um objeto Page Object pode devolver outro Page Object quando ocorre uma navegação entre páginas;
- Que podemos reaproveitar o objeto `WebDriver` entre diferentes objetos Page Object;
- Que podemos recuperar um elemento na página a partir de outro elemento;
- Que podemos utilizar herança, design patterns, dentre outras práticas para organizar os códigos de testes da aplicação.

## AULA 05. AJAX e boas práticas

Nesta aula, aprendemos:

- Que alguns testes podem falhar quando a aplicação utilizar códigos JavaScript, como por exemplo em chamadas AJAX;
- Que é possível configurar diferentes Timeouts na API do WebDriver;
- As boas práticas recomendadas no Guideline do Selenium WebDriver.




