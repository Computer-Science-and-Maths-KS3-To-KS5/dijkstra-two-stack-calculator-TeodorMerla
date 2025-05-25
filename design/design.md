# Infix Scientific Calculator
## Design
### Overview
The calculator uses the Dijkstra Two-Stack Algorithm to evaluate fully parenthesised infix expressions. It processes elements from left to right using two stacks: one for operands (numbers) and one for operators. When a right parenthesis is encountered, an operation is performed by popping the necessary operands and operator, computing the result, and pushing it back to the operand stack.

### User Interface
- Text-based CLI.
- User enters a single expression on one line.
- Output is printed to the console.
- Errors are printed with a clear message.

### Supported Operators
| Symbol| Operation|
|------:|:---------|
|+	|Addition|	
|-	|Subtraction|
|*	|Multiplication|
|/	|Division|
|^	|Exponentiation|
|~	|Unary Minus|

### Pseudocode
```
for each token in the expression:
    if token is "(":
        ignore
    else if token is an operator:
        push onto operator stack
    else if token is a number:
        push onto operand stack
    else if token is ")":
        pop operator
        if operator is binary:
            pop two operands
            apply operation
            push result
        else if operator is unary:
            pop one operand
            apply operation
            push result
```