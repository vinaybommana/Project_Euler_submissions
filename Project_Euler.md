---
title : Project Euler
author: vinay bommana
year  : 2017

---
[](tutor: zarwis)

# Problem 1 (Multiples of 3 and 5)

\begin{equation}
sum = 3 * \frac{n (n + 1)}{2} + 5 * \frac{n (n + 1)}{2} - 15 * \frac{n (n + 1)} {2}
\end{equation}

* n is the number one less than given N
* 15 is subtracted because we are adding numbers which are multiples of 3 and 5 both.

# Problem 2 (Even Fibonacci Numbers)
* The Problem statement is to calculate the sum of the even numbers in the fibonacci series.
* The approach to give the even numbers in the Fibonacci series is as follows:
* we know that Fibonacci series is as follows:
\begin{equation}
F_n = F_{n-1} + F_{n-2}
\end{equation}


\begin{equation}
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, \cdots
\end{equation}

* Thus the even numbers are repeated after two odd numbers.
* $F_{n-3}$ and $F_{n-6}$ are even Fibonacci digits in the series.
* Thus we need to transform the equation 2.1 into even Fibonacci digits.

\begin{equation}
F_n = F_{n-1} + F_{n-2}
\end{equation}

\begin{equation}
F_{n-1} = F_{n-2} + F_{n-3}
\end{equation}

\begin{equation}
F_{n-2} = F_{n-3} + F_{n-4}
\end{equation}

\begin{equation}
F_n = F_{n-2} + F_{n-3} + F_{n-3} + F_{n-4}
\end{equation}

\begin{equation}
F_n = 2F_{n-3} + F_{n-3} + F_{n-4} + F_{n-4}
\end{equation}

\begin{equation}
F_n = 3F_{n-3} + 2F_{n-4}
\end{equation}

we know that
\begin{equation}
F_{n-4} = F_{n-5} + F_{n-6}
\end{equation}

\begin{equation}
F_{n-4} - F_{n-5} = F_{n-6}
\end{equation}

By adding $F_{n-3}$ on both sides

\begin{equation}
F_{n-3} + F_{n-4} - F_{n-5} = F_{n-6} + F_{n-3}
\end{equation}

\begin{equation}
F_{n_4} + F_{n-5} + F_{n-4} - F_{n-5} = F_{n-6} + F_{n-3}
\end{equation}

\begin{equation}
2F_{n-4} = F_{n-6} + F_{n-3}
\end{equation}
* By substituting the following result in the equation of $F_n$
\begin{equation}
F_n = 3F_{n-3} + 2F_{n-4}
\end{equation}

\begin{equation}
F_n = 3F_{n-3} + F_{n-6} + F_{n-3}
\end{equation}

\begin{equation}
F_n = 4F_{n-3} + F_{n-6}
\end{equation}

* Thus we obtained $F_n$ only in terms of $F_{n-3}$ and $F_{n-6}$
* we use this result in formulating the program.
