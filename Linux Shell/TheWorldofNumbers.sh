#!/bin/bash

read a
read b

sum=$((a + b))
diff=$((a - b))
prod=$((a * b))
if [ "$b" -ne 0 ]; then
    quot=$((a / b))
else
    quot="undefined"
fi

echo "$sum"
echo "$diff"
echo "$prod"
echo "$quot"
