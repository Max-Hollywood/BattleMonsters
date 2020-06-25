# BattleMonsters
(work in progress)
Battle Monsters!  An open source battle-ship game with a twist.
Different levels of AI - some are easy, some are brutal.
Different sized levels - some are small, some are huge.
Different shaped enemies - no longer just a straight line.
Different rules - enemies might move (hard setting), weapons might have different effects (more than one space).

Most of this has already been implemented in an assignment, so I have to rebuild it so I don't copyright infringe myself.
Original implementation is command-line console, but we wanted to do a GUI and have some graphics.  That's the goal, so you can play either if you want.

--------------

> UDPDATE 2019-04-16

## Language
- Java
- C++
- Node.JS & Electron (?)

## TODO
- Decide on language (Java is probably best)
- MVC for either command-line or GUI
- Networking (server - client)

## WISHLIST
- AI (determined by "Difficulty" setting)
  - Unskilled (completely random moves, will use cannon and tomohawk)
  - Focused (will randomly move until it hits something, then make moves around that area until it there are no more hits, and continues to be random, uses all weapons available and sometimes strategically)
  - Hunter (same as Focused, but throws in a random move here and there to test the waters - remembers all hits so it can pick and choose where to attack, will use weapons strategically eg. if an enemy _should_ be somewhere, it will pick a weapon that increases the chance of finding them)
- Leaderboard
  - Your score (win or lose) increases with each game
  - Your score automatically unlocks weapons for you to use
- Weapons
  - Cannon (1 x 1)
  - Tomahawk (3 x 3) (unlockable)
  - Laser (1 x 5 directional) (unlockable)
  - Firestorm (entire board, random chance for each cell - depends on board size/difficulty/ships remaining, maybe a 25% of the board gets hit?) (unlockable)
- Difficulty
  - Normal (enemies only have the cannon)
  - Challenging (enemies have cannon, tomohawk, laser)
  - Monstrous (enemies have all weapons, enemy monsters can move and change shape - so even a successful hit might mean nothing as the monster could move away - moving monsters is made obvious by indicators on the X and Y coordinates of the display, so if you see << or >> on the column or row number, then you know something moved somewhere in that area)
- Networking
  - I've only done a bit of Java networking...  So that'll be a challenge for C++ or Node.JS.
- Multiple players
  - That'd be interesting.
- Portability
  - Play on any device?
  - Matchmaking?

## Notes
Yes, the most exciting part is watching AI players blast each other.
Hopefully with a GUI, some graphics can be introduced (we wanted to do that in the original project, but had no time, and were disuaded to do so as well as the focus was on the I/O system and 2d arrays).
The original project was mid 2017, and I've wanted to rebuild it since.

--------------

> UPDATE 2020-06-18

## Decisions made
Starting development after making some choices on initial implementation.

Instead of doing any actual planning, jumping straight into creating file structure.

- Java
- MVC
- Console based
- Dependency injection

--------------

> UPDATE 2020-06-19

## Graphical options
UI options are either CLI or GUI.  CLI is obvious and easy, but what about GUI?
- pre-made Java library?
    - LITIengine?  (pure Java)
    - A full and complex library with a lot of third party?
- something simple and made myself (and probably very ugly)

## Game difficulty
Game difficulty should be more abstract and encompassing of how generally difficult it would be to actually play the game.  It should not influence the aspects of the game as I've previously mentioned.
- Setting the AI _behaviour_ determines its **behaviour** (more human-like behaviour)
- Setting the AI _difficulty_ determines **its available weapons** (more powerful weapons)
- Setting the _board size_ determines **overall difficulty** (space between monsters)
- Setting the AI _able to move_ determines the **overall difficulty** (the monsters can move to places you have already fired on)

--------------

> UPDATE 2020-06-23

To increase difficulty, a Monster creator should be able to procedurally generate a random monster to keep the shapes unpredictable.

> UPDATE 2020-06-25

Add obstacles - the game board has randomly placed and random shaped obstacles - rocks, debris, buildings, whatever - that limit where a player can place their monsters, but also means that an attacker gets a false positive when they hit that location.

Rewrite the readme.md to have revision and ideas history at the bottom, and update the current project at the top (I've been neglecting that).

Don't forget that the game requires two sides of the board.  Player 1 sees their monsters on a board, and sees where they are trying to hit the opponent.  For Human vs. Human or AI vs AI the visible board can change to show that Player's board.  Also for Human vs Human the initial placement of the monsters can be hidden so that no one sees their own monsters after they are placed, to help with Hotseat play.

## Bugs/Fix
Add bugs as they are found.  Strike them out `~~`~~bug~~`~~` when they are expected to be fixed.  Delete them when they are confirmed to be fixed in the next version.

### Core

### User interface

### Monsters

### Players

### Weapons

### AI Brains

### Other
- ~~make the 2d array setting and getting (x or y first) consistent~~

