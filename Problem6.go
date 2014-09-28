package main

import "fmt"

func main() {

	sumOfSquare	:= 0
	sum	:= 0

	for i := 1; i < 101; i++ {
		sumOfSquare += i*i
		sum += i
	}

	squareOfSum := sum*sum
	fmt.Println("Result: ", squareOfSum - sumOfSquare)

}