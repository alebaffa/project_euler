package main

import (
	"fmt"
	"math"
)

func isPrime(i int) bool {
	for x := 3; x <= int(math.Sqrt(float64(i))); x += 2 {
		if i%x == 0 {
			return false
		}
		return true
	}
	return true
}

func main() {
	i := 14
	numOfPrime := 6

	for numOfPrime <= 10001 {
		if isPrime(i) {
			fmt.Println(i, " IS prime")
			if numOfPrime == 10001 {
				fmt.Println("the 10001th prime number is ", i)
				break
			}
			i += 1
			numOfPrime += 1
		}
		fmt.Println(i, " is NOT prime")
		i += 1
	}
}
