# Bit Manipulation Tricks and Techniques

## Swapping Two Numbers Without a Third Variable

- A = A ^ B
- B = A ^ B
- A = A ^ B

## Checking if the i-th Bit is Set

- (1 << i) & num   → set if result ≠ 0
- (num >> i) & 1   → set if result ≠ 0

## Setting the i-th Bit

- num | (1 << i)

## Clearing the i-th Bit
- num & ~(1 << i)

## Toggling the i-th Bit

- num ^ (1 << i)


## One's Complement

The one's complement of a binary number is obtained by flipping all the bits.

Example: The one's complement of 13 (binary 1101):

    - Binary of 13     : 0000 1101 
    - One's Complement : 1111 0010 

## Two's Complement

The two's complement is obtained by taking the one's complement of a number and adding 1.

Example: The two's complement of 13 (binary 1101):

    - One's Complement : 1111 0010
    - Add 1            : 1111 0011