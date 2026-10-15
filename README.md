# Biomechanics Calculator

A Java-based scientific calculator for introductory biomechanics and material mechanics, developed as part of my computer science and biomedical engineering portfolio.

## Features

- Calculate mechanical stress (Pa)
- Calculate engineering strain
- Calculate Young's modulus (Pa)
- Calculate force (N)
- Convert pressure between Pa, kPa, and MPa
- Interactive command-line menu with basic input validation

## Technologies

- Java
- Object-oriented programming fundamentals
- Methods, loops, switch statements, Scanner, and exception handling

## Formulas

| Quantity | Formula |
|---|---|
| Stress | Stress = Force / Area |
| Strain | Strain = Change in Length / Original Length |
| Young's modulus | E = Stress / Strain |
| Force | Force = Stress × Area |

## Getting Started

Requires a Java Development Kit (JDK).

Compile:

```bash
javac src/BiomechanicsCalculator.java
```

Run:

```bash
java -cp src BiomechanicsCalculator
```

## Example

Input:
- Force = 100 N
- Area = 0.002 m²

Output:
- Stress = 50,000 Pa (50 kPa)

## Scientific Limitations

This program uses simplified engineering mechanics equations. Young's modulus is calculated as a stress-to-strain ratio and does not model the nonlinear or viscoelastic behavior of biological tissues.

## Author

**Momin Taimoor**  
DePauw University — Pre-Engineering  
[LinkedIn](https://www.linkedin.com/in/momin-taimoor-387260427/)

## Project Status

Version 1.0 — Command-line calculator.
