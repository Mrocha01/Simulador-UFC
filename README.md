# Simulador de Lutas UFC 🥋🥊

Este é um projeto de simulação de lutas inspirado no UFC, desenvolvido em Java. O código permite agendar lutas entre dois lutadores, simular os rounds, calcular pontuações baseadas em diversos fatores (peso, altura, experiência, sorte) e determinar o vencedor, incluindo a possibilidade de um K.O!

## Funcionalidades 🚀

- **Agendamento de Lutas**: Verifica se os lutadores pertencem à mesma categoria de peso antes de aprovar a luta.
- **Simulação de Rounds**: Até 8 rounds com trocação, eventos aleatórios e golpes críticos.
- **Pontuação Baseada em Fatores**:
  - Peso.
  - Altura.
  - Experiência (número de vitórias).
  - Sorte (pontuações aleatórias).
- **Finalização Antecipada**: Golpes críticos podem levar a um K.O., encerrando a luta imediatamente.
- **Resultados Finais**:
  - Vitória por pontuação.
  - Empate.
  - Vitória por K.O.

## Pré-requisitos 🖥️

Para executar o projeto, você precisará de:
- Java JDK (versão 8 ou superior).
- IDE de sua escolha (VS Code, IntelliJ, Eclipse, etc.).

## Como Executar 🏃

1. Clone o repositório:
   ```bash
   git clone https://github.com/Mrocha01/Simulador-UFC.git
   ```

2. Abra o projeto em sua IDE.

3. Compile e execute o programa principal.

4. Siga as instruções no console para criar lutadores, agendar lutas e assistir às simulações.

## Exemplo de Uso 📜

```java
// Criação de lutadores
UecClass lutador1 = new UecClass("Anderson Silva", "Médio", 84.0, 1.88, 34);
UecClass lutador2 = new UecClass("Vitor Belfort", "Médio", 83.5, 1.85, 30);

// Configuração da luta
Luta luta = new Luta();
luta.marcarLuta(lutador1, lutador2);

// Simulação da luta
luta.lutar();
```

## Estrutura do Projeto 📂

- **Luta**: Classe principal responsável pela lógica de simulação.
- **UecClass**: Representa os lutadores, contendo atributos como nome, categoria, peso, altura e número de vitórias.
- **Random**: Utilizado para adicionar elementos aleatórios, como sorte e golpes críticos.

## Próximos Passos 📈

- Adicionar suporte a categorias adicionais.
- Implementar interface gráfica para simulações.
- Salvar resultados das lutas em arquivos.

## Contribuição 🤝

(https://www.cursoemvideo.com/curso/java-poo/) onde peguei o escopo inicial dessa ideia durante uma das aulas!

---

Feito por [Mateus Rocha](https://github.com/Mrocha01).
