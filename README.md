Processo Seletivo em Java

Este projeto simula um processo seletivo de candidatos utilizando a linguagem Java.
Ele faz a seleção de candidatos com base em pretensão salarial, tenta contato telefônico e imprime relatórios com os selecionados.

🚀 Funcionalidades

Lista candidatos pré-definidos.

Simula a pretensão salarial de cada candidato (valores entre R$ 1800,00 e R$ 2200,00).

Seleciona candidatos cujo salário pretendido é compatível com o salário base (R$ 2000,00).

Realiza até 3 tentativas de contato com cada candidato, simulando se o mesmo atende ou não.

Imprime a lista de candidatos e os selecionados para a vaga.

📂 Estrutura do Código

main

Inicia o programa com a lista de candidatos.

selecaoCandidato()

Percorre a lista de candidatos e seleciona até 5 que tenham salário compatível.

valorPretendido()

Gera de forma aleatória o salário pretendido do candidato.

analisarCandidato(double salarioPretendido)

Analisa se o candidato deve ser chamado para entrevista, contra proposta ou aguardar.

entrandoEmcontado(String candidato)

Simula as tentativas de contato com o candidato (até 3 vezes).

atender()

Função auxiliar que retorna aleatoriamente se o candidato atendeu a ligação.

imprimirSelecionados()

Exibe a lista de candidatos e seus índices.

🛠️ Tecnologias Utilizadas

Java SE (Java Standard Edition)

java.util.Random e java.util.concurrent.ThreadLocalRandom para simulações aleatórias.

▶️ Como Executar

Clone este repositório ou copie o código para sua máquina.

Compile o programa:

javac ProcessoSeletivo.java


Execute:

java ProcessoSeletivo

📖 Exemplo de Saída
O candidato MARIA solicitou este valor de salário: 1950.36
O candidato MARIA foi selecionado para a vaga
O candidato JOAO solicitou este valor de salário: 2102.12
O candidato JOAO não foi selecionado
...
CONTATO REALIZADO COM SUCESSO
CONSEGUIMOS
