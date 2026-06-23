# Bit Manipulation Tricks and Techniques

## Swapping Two Numbers Without a Third Variable

- A = A ^ B
- B = A ^ B
- A = A ^ B

---

## Checking if the i-th Bit is Set

- (1 << i) & num   → set if result ≠ 0
- (num >> i) & 1   → set if result ≠ 0

## Setting the i-th Bit

- num | (1 << i)

## Clearing the i-th Bit
- num & ~(1 << i)

## Toggling the i-th Bit

- num ^ (1 << i)