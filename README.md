# [DIO](https://web.dio.me/track/formacao-java-developer) - Trilha Java Básico

## Autores
- [Gabriel Santullo](https://github.com/santullo)

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Diagrama UML (Mermaid)
```mermaid
classDiagram
    NavegadorInternet <|-- Iphone 
    AparelhoTelefonico <|-- Iphone
    ReprodutorMusical <|-- Iphone

    class Iphone {
        -String nome
        -String modelo
        -String versaoOS
    }

    class ReprodutorMusical {
        +tocar() 
        +pausar()
        +selecionarMusica()
        +controlarVolume()
    }

    class AparelhoTelefonico{
        +ligar(String)
        +atender()
        +iniciarCorreioVoz()
    }
    
    class NavegadorInternet  {
        +exibirPagina(String)
        +adicionarNovaAba()
        +atualizarPagina()
    }
```

