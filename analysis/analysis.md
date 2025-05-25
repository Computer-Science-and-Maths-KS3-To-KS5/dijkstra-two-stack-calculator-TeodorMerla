# Infix Scientific Calculator
## Analysis
### Problem Overview
Evaluating arithmetic expressions with nested parentheses and multiple operations is non-trivial without operator precedence rules. The Dijkstra two-stack algorithm solves this by separating operators and operands into two stacks, processing the expression left to right. 

### Scope
- Input must be a **fully parenthesised** arithmetic expression.
- Operations supported: `+`, '-', '*', '/', '~'.
- Output is a float