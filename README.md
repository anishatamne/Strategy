# Duck Simulation using Strategy Pattern

## Overview
This Java application simulates the behavior of different types of ducks using interfaces for swimming and flying behaviors. It applies the Strategy Pattern to allow dynamic behavior changes, including floating, swimming, drowning, flying, and non-flying.

## Features
- Implements the **Strategy Pattern** for flexible duck behaviors.
- Includes multiple duck types:
  - **Mallard Duck**
  - **Redhead Duck**
  - **Rubber Duck**
  - **Decoy Duck**
- Uses behavior interfaces for modular design:
  - **FlyBehavior** (Defines flying strategies)
  - **QuackBehavior** (Defines quacking strategies)
  - **SwimBehavior** (Defines swimming strategies)
- Leverages modern Java features, including enhanced switch statements.
- Developed with **IntelliJ IDEA** for a smooth coding experience.

## Project Structure
```
Strategy/
│── src/
│   ├── Main.java
│   ├── Duck.java
│   ├── behaviors/
│   │   ├── FlyBehavior.java
│   │   ├── FlyWithWings.java
│   │   ├── NoFly.java
│   │   ├── QuackBehavior.java
│   │   ├── Quack.java
│   │   ├── Squeak.java
│   │   ├── MuteQuack.java
│   │   ├── SwimBehavior.java
│   │   ├── Swim.java
│   │   ├── Float.java
│   │   ├── Drown.java
│   ├── ducks/
│   │   ├── MallardDuck.java
│   │   ├── RedheadDuck.java
│   │   ├── RubberDuck.java
│   │   ├── DecoyDuck.java
│── README.md
│── .gitignore
```

### File Descriptions
- **Main.java**: Runs the duck simulation, allowing users to select duck types and observe their behaviors.
- **Duck.java**: Abstract class defining common attributes and behavior interfaces for ducks.
- **FlyBehavior.java**: Interface for flying behavior.
  - **FlyWithWings.java**: Represents ducks that fly with wings.
  - **NoFly.java**: Represents ducks that cannot fly.
- **QuackBehavior.java**: Interface for quacking behavior.
  - **Quack.java**: Ducks that quack normally.
  - **Squeak.java**: Ducks that squeak.
  - **MuteQuack.java**: Ducks that remain silent.
- **SwimBehavior.java**: Interface for swimming behavior.
  - **Swim.java**: Ducks that swim actively.
  - **Float.java**: Ducks that float on water.
  - **Drown.java**: Ducks that drown.
- **MallardDuck.java, RedheadDuck.java, RubberDuck.java, DecoyDuck.java**: Implementations of different duck types with assigned behaviors.

## Technologies Used
- **Java** (Object-Oriented Programming, Interfaces, and Polymorphism)
- **IntelliJ IDEA** (Recommended for development)

## How to Run
### Clone the Repository
```sh
git clone https://github.com/Ameya2137/Strategy.git
cd Strategy
```

### Open in IntelliJ IDEA
1. Open **IntelliJ IDEA** and select **Open Project**.
2. Navigate to the **Strategy** folder and open it.
3. Ensure the project SDK is set to Java (JDK 17 or later):
   - Go to **File → Project Structure → Project** and confirm the SDK version.
4. Mark the `src` folder as the Sources Root:
   - Right-click on `src` → **Mark Directory as → Sources Root**.

### Run the Application
1. Open **Main.java**.
2. Click the **Run button** in IntelliJ.

## License
This project is for educational and demonstration purposes.

