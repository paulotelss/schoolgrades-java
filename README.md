## Descrição do Projeto
Este projeto será um Conversor de Notas dos 4 Bimestres, onde o usuário poderá inserir suas notas para cada bimestre, e o programa calculará a média final. Com base na média, o programa determinará se o usuário foi aprovado ou reprovado, considerando a média de aprovação como 7,0. O sistema também converterá cada nota numérica em uma escala de A a F.

## Funcionalidades
- `Entrada de Notas`: O usuário insere as notas de cada um dos 4 bimestres.
- `Conversão para Escala A-F`: O programa converte cada nota numérica para uma letra na escala de A-F.
- `Cálculo da Média`: o programa calcula a média aritmética das notas inseridas.
- `Verificação de Aprovação`: Com base na média calculada, o programa informa se o usuáro foi aprovado ou reprovado.

## Estrutura de Arquivos 

`Main.java`
- Controla o fluxo do programa, coleta as notas do usuário, e utiliza as outras classes para processar e exibir o resultado final.

`GradeCalculator.java`
- Contém a lógica para converter as notas numéricas para a escala A-F e calcula a média final.

`ApprovalChecker.java`
- Verifica se a média final é suficiente para a aprovação e retorna o resultado.

## Lógica Básica

**Conversão de Notas (A-F):**
- A: 9.0 - 10.0
- B: 8.0 - 8.9
- C: 7.0 - 7.9
- D: 5.0 - 6.9
- F: abaixo de 5.0

**Cálculo da Média:**
- Média = (Nota1 + Nota2 + Nota3 + Nota4) / 4

**Verificação de Aprovação:**
- Se a média for >= 7.0, o usuário é aprovado. Caso contrário, reprovado.

## Exemplo de Saída
O programa pode solicitar ao usuário as notas dos 4 bimestres:

```java
Digite a nota do 1º bimestre: 8.5
Digite a nota do 2º bimestre: 7.0
Digite a nota do 3º bimestre: 6.5
Digite a nota do 4º bimestre: 9.0
```
E o resultado poderia ser:

```java
Notas Convertidas: B, C, D, A
Média Final: 7.75
Status: Aprovado
```

**Estrutura básica para desenvolver o código de maneira organizada e síncrono**

- `Execução Sequencial`: O código executa todas as operações de forma sequencial. As entradas do usuário são coletadas, os cálculos são realizados, e os resultados são exibidos em uma ordem específica e linear.
- `Sem Concorrência`: Não há uso de threads, tarefas assíncronas, ou qualquer outra forma de concorrência. O código não realiza múltiplas operações simultaneamente.

**Organização**

- `Responsabilidades Separadas`: O código é dividido em três classes, cada uma com uma responsabilidade clara: `Main` para o controle do fluxo do programa, `GradeCalculator` para cálculos e conversão de notas, e `ApprovalChecker` para verificar a aprovação.
- `Modularidade e Clareza`: Cada classe tem métodos específicos que realizam tarefas bem definidas, facilitando a leitura.  Isso também permite que você altere ou adicione funcionalidades com impacto mínimo em outras partes do código.

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=65&section=footer"/>
