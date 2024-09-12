# Vehicle Dependency Injection Assignment

## Overview

This project demonstrates the **dependency injection** design pattern in a vehicle system. It consists of a `Person` interacting with a `Vehicle`, which in turn relies on services like `Speakers` and `Tyres` to perform its functionalities.

## Objective

Your application should:
- Play music using one of the available `Speakers` implementations.
- Move the vehicle using one of the `Tyres` implementations.
- Provide flexibility to switch between different `Speakers` and `Tyres` implementations easily.

## Architecture

### Beans and Their Dependencies

1. **Person Bean**
   - **Dependency**: `Vehicle Bean`
   - A `Person` interacts with a `Vehicle`.

2. **Vehicle Bean**
   - **Dependency**: `VehicleServices Bean`
   - **Responsibilities**: 
     - Play music via `Speakers`.
     - Move the vehicle using `Tyres`.

3. **VehicleServices Bean**
   - **Dependencies**: 
     - `Speakers` interface
     - `Tyres` interface
   - **Responsibilities**: 
     - Serve requests from the `Vehicle` by delegating to `Speakers` and `Tyres`.

4. **Speakers Interface**
   - **Method**: `makeSound()`
   - **Implementations**:
     - `SonySpeakers Bean`
     - `BoseSpeakers Bean`

5. **Tyres Interface**
   - **Method**: `rotate()`
   - **Implementations**:
     - `BridgeStoneTyres Bean`
     - `MichelinTyres Bean`

## Implementations

### Speakers
- **SonySpeakers Bean**: Implementation of the `Speakers` interface.
- **BoseSpeakers Bean**: Another implementation of the `Speakers` interface.

### Tyres
- **BridgeStoneTyres Bean**: Implementation of the `Tyres` interface.
- **MichelinTyres Bean**: Another implementation of the `Tyres` interface.

## Requirements

1. **Play Music**: The vehicle must be able to play music using one of the `Speakers` implementations (Sony or Bose).
2. **Move Vehicle**: The vehicle must move using one of the `Tyres` implementations (BridgeStone or Michelin).
3. **Flexibility**: The application should easily switch between the implementations of both `Speakers` and `Tyres`.
