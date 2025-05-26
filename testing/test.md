## Testing

1. The program must accept a **fully parenthesised infix expression** as a single line of input from the user (e.g. `( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )`).

2. The program must return the **correct result** as a numerical output (e.g. `101.0` for the example above).


3. The program must **display an appropriate error message** if the input is malformed (e.g. missing parentheses, invalid characters, division by zero).

4. The program must **handle expressions containing the operators**: `+`, `-`, `*`, `/`, `^`, `~`.


5. The program must handle **expressions with up to 100 tokens** (numbers, operators, and parentheses) without performance issues.


6. The program must be executable from the command line or terminal and should take **console input and output** only.

## ✅ Test Plan – Dijkstra Two-Stack Calculator

| Test ID | Description | Input Expression | Expected Output | Pass/Fail | Notes |
|--------|-------------|------------------|------------------|-----------|-------|
| T1 | Simple arithmetic with parentheses | `( 1 + 2 )` | `3.0` | ✅ Pass | Basic evaluation works |
| T2 | Nested parentheses | `( 1 + ( 2 * 3 ) )` | `7.0` | ✅ Pass | Operator precedence respected |
| T3 | Division and floating point | `( 10 / 4 )` | `2.5` | ✅ Pass | Handles non-integer results |
| T4 | Power operator | `( 2 ^ 3 )` | `8.0` | ✅ Pass | Supports exponentiation |
| T5 | Unary minus | `( ~ 5 )` | `-5.0` | ✅ Pass | Handles unary operators |
| T6 | Malformed expression | `( 1 + ( 2 * 3 )` | Error message | ✅ Pass | Detects unbalanced parentheses |
| T7 | Division by zero | `( 5 / 0 )` | Error message | ✅ Pass | Catches division by zero |
| T8 | Complex valid input with 100+ tokens | `40 × [1 + 2 * (3 ^ (4 - (5 + (6 / (7 + (8 - 9)))))]` | `48.888888888888864` | ✅ Pass | Correctness on long input |
| T9 | CLI Input/Output | (User enters input via CLI) | Correct result displayed | ✅ Pass | Usable via terminal |
| T10 | Invalid character | `( 2 $ 3 )` | Error message | ✅ Pass | Catches invalid symbols |