# desafio-java-poo
## Repositório criado para arquivar o diagrama uml de classes do desafio de POO (Case iPhone).

### Diagrama UML 

```mermaid
---
title: Lançamento iPhone
---
classDiagram
    class Iphone
    class ReprodutorMusical {
        <<interface>> 
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
    }
    class AparelhoTelefonico{
        <<interface>> 
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void 
    }
    class NavegadorInternet{
        <<interface>> 
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }
    class CameraFotografica{
        <<interface>>
        +tirarFoto() void
        +gravarVideo() void
        +exibirFoto() void
        +exibirVideo() void
    }
    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
    Iphone --> CameraFotografica

