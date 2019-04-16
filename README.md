# BattleMonsters
(work in progress)
Battle Monsters!  An open source battle-ship game with a twist.
Different levels of AI - some are easy, some are brutal.
Different sized levels - some are small, some are huge.
Different shaped enemies - no longer just a straight line.
Different rules - enemies might move (hard setting), weapons might have different effects (more than one space).

Most of this has already been implemented in an assignment, so I have to rebuild it so I don't copyright infringe myself.
Original implementation is command-line console, but we wanted to do a GUI and have some graphics.  That's the goal, so you can play either if you want.

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

