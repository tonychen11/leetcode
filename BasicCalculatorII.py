class Solution:
    def calculate(self, s: str) -> int:
        digit = 0
        sign = '+'
        runningSum = 0
        prev = 0
        size = len(s)

        for idx, char in enumerate(s):
            if char.isdigit():
                digit = digit * 10 + int(char)
            if char in '+-*/' or idx == size - 1:
                if sign == '+':
                    runningSum += prev
                    prev = digit
                elif sign == '-':
                    runningSum += prev
                    prev = -digit
                elif sign == '*':
                    prev = prev * digit
                elif sign == '/':
                    prev = int(prev / digit)
                sign = char
                digit = 0

        return runningSum + prev
