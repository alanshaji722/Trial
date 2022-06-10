#!/bin/bash

echo "Enter radius of circle: "
read r
area=$(echo "3.14*$r*$r" | bc)
circ=$(echo "2*3.14*$r" | bc)
echo "Area of Circle = "$area
echo "Circumference of Circle = "$circ
