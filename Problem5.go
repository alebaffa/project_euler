package main

import "fmt"

func main() {
	result := 2
	for i:=2;i<=10;i++{
		if (i % (i-1)) == 0 {
			result = result*i
			fmt.Println("i: ", result)
		}
	}
	fmt.Println("result: ", result)
}