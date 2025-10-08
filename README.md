# DamasSemDamas

Um jogo de damas simplificado desenvolvido em Java, onde é possível jogar localmente contra outro jogador, guardar partidas e criar tabuleiros personalizados.

---

## 🕹️ Regras do Jogo

1. Cada jogador joga **à sua vez**, começando pelas **brancas**.  
2. Se uma peça puder comer outra, **é obrigada a fazê-lo**, mas só **uma peça de cada vez** (não há capturas em cadeia).  
3. **Não existem damas**: quando uma peça chega ao final do tabuleiro, **não pode ser movida**.  
4. O jogador que terminar com mais peças **ganha**.  
5. É possível ocorrer **empate** se ambos os jogadores ficarem com o mesmo número de peças.  
6. O jogo possui também:
   - Um botão para **jogadas aleatórias**
   - Opção de **guardar e carregar partidas** em ficheiros de texto
   - Criação de **tabuleiros de vários tamanhos** para jogar partidas personalizadas

---

## 💾 Saves e Tabuleiros Personalizados

- As partidas podem ser guardadas em **ficheiros de texto** e carregadas mais tarde para continuar o jogo.  
- É possível criar **tabuleiros de diferentes dimensões**, permitindo partidas adaptadas à preferência do jogador.

---

## ⚠️ Notas importantes

- O jogo **só pode ser executado através de uma IDE** (como Eclipse ou VS Code).  
- É necessário **abrir diretamente a pasta do projeto como workspace** para que todos os recursos (imagens, bibliotecas e código) funcionem corretamente.  
- Não é possível executar o jogo através de um `.jar` independente ou duplo clique fora da IDE.

---

## 📂 Estrutura do Projeto

- `src/` → Código-fonte Java  
- `lib/` → Bibliotecas externas necessárias para o jogo  
- `bin/` → Classes compiladas  
- `recursos/` → Imagens do tabuleiro e peças  
- `saves/` → Ficheiros de texto com partidas guardadas (opcional)

---

## 🎮 Como Jogar

1. Abra o projeto na sua IDE, garantindo que está **diretamente na pasta do projeto**.  
2. Execute a classe `View.java` (classe principal).  
3. Escolha o tamanho do tabuleiro ou use o tabuleiro padrão.  
4. Jogue à sua vez, seguindo as regras descritas acima.  
5. Utilize os botões para:
   - Jogadas aleatórias  
   - Guardar a partida em ficheiro de texto  
   - Carregar uma partida previamente guardada  

---

Divirta-se e que vença o melhor jogador!
