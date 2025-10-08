# DamasSemDamas

A simplified checkers game developed in Java, where you can play locally against another player, save games, and create custom boards.

---

## 🕹️ Game Rules

1. Each player takes **turns**, starting with the **white pieces**.  
2. If a piece can capture another, it **must do so**, but only **one piece at a time** (no chain captures).  
3. **There are no kings**: when a piece reaches the end of the board, **it cannot move further**.  
4. The player with the most pieces at the end **wins**.  
5. A **draw** can occur if both players have the same number of pieces.  
6. The game also includes:
   - A button for **random moves**
   - Option to **save and load games** as text files
   - Creation of **boards of different sizes** for custom matches

---

## 💾 Saves and Custom Boards

- Games can be saved in **text files** and loaded later to continue playing.  
- You can create **boards of different dimensions**, allowing matches tailored to the player’s preference.

---

## ⚠️ Important Notes

- The game **can only be run through an IDE** (like Eclipse or VS Code).  
- You must **open the project folder directly as a workspace** so that all resources (images, libraries, and code) work correctly.  
- The game **cannot be run from an independent `.jar`** or by double-clicking outside the IDE.

---

## 📂 Project Structure

- `src/` → Java source code  
- `bin/` → Compiled classes  
- `resources/` → Board and piece images  
- `saves/` → Text files with saved games (optional)

---

## 🎮 How to Play

1. Open the project in your IDE, ensuring you are **directly in the project folder**.  
2. Run the `View.java` class (main class).  
3. Choose the board size or use the default board.  
4. Take turns playing, following the rules described above.  
5. Use the buttons to:
   - Make random moves  
   - Save the game to a text file  
   - Load a previously saved game  

---

Have fun, and may the best player win!
