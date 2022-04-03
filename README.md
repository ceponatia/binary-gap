# binary-gap

Calculates binary gap of an input integer by converting it to a string using Integer.toString(N, 2) where N is the integer passed to the function and 2 denotes the integer will be converted to a string representation using only digits 0 and 1 (binary). (does this make any sense? Lol)

The first 1 encountered by the function will set "started" to true, meaning we now start counting 0's. Every 0 encountered after started is true increments the counter variable. When (if) a second 1 is encountered, the variable maxCount is assigned the current value of counter and the function ends, returning maxCount.

As I am relatively new to programming, this function was greatly inspired by Dave Kirkwood (https://github.com/davekirkwood/).
