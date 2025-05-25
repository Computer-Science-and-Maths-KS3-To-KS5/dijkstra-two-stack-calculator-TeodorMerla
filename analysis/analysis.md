# Infix Scientific Calculator
## Analysis
### Problem Overview
Evaluating arithmetic expressions with nested parentheses and multiple operations is non-trivial without operator precedence rules. The Dijkstra two-stack algorithm solves this by separating operators and operands into two stacks, processing the expression left to right. 

### Scope
- Input must be a **fully parenthesised** arithmetic expression.
- Operations supported: `+`, `-`, `*`, `/`, `^`, `~`.
- Output is a float

### Objectives

1. The program must accept a **fully parenthesised infix expression** as a single line of input from the user (e.g. `( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )`).
2. The program must return the **correct result** as a numerical output (e.g. `101.0` for the example above).
3. The program must **display an appropriate error message** if the input is malformed (e.g. missing parentheses, invalid characters, division by zero).
4. The program must **handle expressions containing the operators**: `+`, `-`, `*`, `/`, `^`, `~`.
5. The program must handle **expressions with up to 100 tokens** (numbers, operators, and parentheses) without performance issues.
6. The program must be executable from the command line or terminal and should take **console input and output** only.

