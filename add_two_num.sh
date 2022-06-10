#!/bin/bash

# Program name: "add_two_num.sh"
# Shell script program to add two numbers.

num1=10
num2=20
num3=30
num4=`expr $num1 - $num2 - $num3`

echo "Sum is: $num4"
