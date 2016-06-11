# Java265.HomeWork1

* Problem 1: Greatest common divisor. Let a > b be any two positive integers. Write a program which determines the greatest common divisor of a and b by using [Euclidean Algorithm](https://en.wikipedia.org/wiki/Euclidean_algorithm#Implementations).

* Problem 2: π estimated by Monte Carlo. Let n be the number of simulation paths. The algorithm is as follows:

    Set n = 1e5.
    Declare m = 0 and i = 0.
    Use Math.random() to generate x and y.
    If x ^ 2 + y ^ 2 < 1, then m = m + 1.
    Set i = i + 1.
    Repeat (3) until i > n.
    Print 4 * m / n.

![Monte-Carlo](https://upload.wikimedia.org/wikipedia/commons/b/ba/Monte-Carlo01.gif)

If you are not familiar with Monte Carlo simulation, you can refer to [Calculating π using Monte Carlo Simulation](https://www.youtube.com/watch?v=UGqUUjoOdFY).

* Problem 3: Bisection method for root finding. Write a program which uses a bisection method to determine a root of the specific function within [a, b]. The input is as follows: f(x), a, b, eps. The output is the root. For example, consider f(x) = x ^ 3 - x - 2 with the initial search interval [0, 2] and eps = 1e-9. The root is about 1.5214.

![Bisection Method](https://upload.wikimedia.org/wikipedia/commons/8/8c/Bisection_method.svg)