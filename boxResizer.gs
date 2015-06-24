#For: http://codegolf.stackexchange.com/questions/52136/draw-growing-stacks-of-boxes
5:X; "+":C; "|":L;
{C X{.1>}{"-"\1-}while;C n}:T;T
{L X{.1>}{" "\1-}while;L n}:S;{S} X 1-*T
