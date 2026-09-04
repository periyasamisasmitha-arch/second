def add(a, b):
    return a + b


def subtract(a, b):
    return a - b


def multiply(a, b):
    return a * b


def divide(a, b):
    if b == 0:
        raise ZeroDivisionError("Cannot divide by zero.")
    return a / b


def calculator():
    print("Simple Calculator")
    print("Operations: +, -, *, /")

    while True:
        try:
            num1 = float(input("Enter the first number: "))
            operator = input("Enter an operator (+, -, *, /): ")
            num2 = float(input("Enter the second number: "))

            if operator == "+":
                result = add(num1, num2)
            elif operator == "-":
                result = subtract(num1, num2)
            elif operator == "*":
                result = multiply(num1, num2)
            elif operator == "/":
                result = divide(num1, num2)
            else:
                print("Invalid operator. Please use +, -, *, or /.")
                continue

            print(f"Result: {result}")

        except ValueError:
            print("Please enter valid numbers.")
        except ZeroDivisionError as e:
            print(e)

        again = input("Do you want to calculate again? (y/n): ").strip().lower()
        if again != "y":
            print("Goodbye!")
            break


if __name__ == "__main__":
    calculator()
