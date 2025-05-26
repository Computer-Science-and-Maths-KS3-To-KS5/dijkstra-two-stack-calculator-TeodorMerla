# Evaluation of Infix Expression Calculator

## Objectives

1. Accept a **fully parenthesised infix expression** as a single line of input  
2. Return the **correct result** as a numerical output  
3. Display an **appropriate error message** for malformed input  
4. Handle expressions with the operators: `+`, `-`, `*`, `/`, `^`, `~`  
5. Handle expressions with up to **100 tokens**  
6. Be executable via **command line with console I/O only**

---

### Objective 1: Accept fully parenthesised infix expression  
**Met**  
- The program reads the full input expression using `Scanner(System.in).nextLine()`
- The `tokenise()` method validates and processes the input correctly
- Example usage: `((2+(6*3))+7)`

---

### Objective 2: Return the correct result as numerical output  
**Met**  
- Uses `Evaluator.evaluate()` to compute and return the result as a `double`
- Supports multi-digit numbers and floating-point numbers
- Output displayed in the console under the label `Result`

---

### Objective 3: Display error messages for malformed input  
**Met**  
- Bracket mismatch is handled and throws a clear `IllegalArgumentException`
- Invalid characters are caught and reported with their character
- Division by zero is explicitly handled in the `divide()` method with `ArithmeticException`

---

### Objective 4: Handle all specified operators  
**Met**  
- Fully supports `+`, `-`, `*`, `/`, `^`, and unary `~`
- Uses `Operators` helper class to handle arithmetic
- Unary operators correctly identified and executed when popped

---

### Objective 5: Handle expressions with up to 100 tokens  
**Met**  
- No fixed limit due to use of `ArrayList` and custom `Stack`
- Code performs efficiently even with large, complex expressions
- Stress test with 100+ tokens passed

---

### Objective 6: Executable via command line with console I/O  
**Met**  
- Uses `main()` method in `Menu` class for execution
- All input and output done through console prompts
- No GUI elements or external files required

---

## Summary Table

| Objective | Status |
|----------|--------|
| 1. Fully parenthesised input | Met |
| 2. Correct result | Met |
| 3. Error handling | Met |
| 4. Operator support | Met |
| 5. Token capacity | Met |
| 6. Console I/O | Met |

---

## Possible Improvements and Missing Features

1. **Support for non-parenthesised or partially parenthesised expressions**  
   - Currently, all input must be fully parenthesised, which is not user-friendly.
   - Could add a conversion from infix to postfix or support operator precedence natively.

2. **Improved number parsing (e.g. scientific notation, negative numbers like -5)**  
   - Currently, only unary `~` handles negative numbers, but `-5` is not valid syntax without brackets.
   - Could improve tokeniser to recognise negative literals.

3. **Support for variables or constants (e.g. `pi`, `e`)**  
   - Future extension could include predefined constants or simple variable storage.

4. **Better user interface or interactive loop**  
   - Currently supports a single input and output; doesn't allow multiple calculations per run.

5. **Unit testing or modular testing suite**  
   - Could implement a JUnit test suite to automate correctness and regression testing.

6. **Expression history or logging**  
   - Could store previous expressions and results for user reference or error tracing.

7. **Output formatting**  
   - Results are returned as raw `double`. Formatting to a fixed number of decimal places would improve readability.

8. **Parentheses balancing helper**  
   - Could warn the user if they're missing parentheses before evaluation, rather than just throwing an exception.

---

## Conclusion

The program meets all specified functional objectives and performs accurately and efficiently. There are several areas for improvement and feature expansion, particularly regarding user experience, input flexibility, and future extensibility.
