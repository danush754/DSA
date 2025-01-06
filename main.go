package main

import (
	"fmt"

	basicmath "github.com/danush754/DSA/basic_math"
	dailyleetcode "github.com/danush754/DSA/daily_leetcode"
)

func main() {

	fmt.Println(basicmath.CountDigits(4456))

	fmt.Println(basicmath.ReverseNum(123))

	basicmath.ReverseNumTwo(45)

	fmt.Println("MinOps :", dailyleetcode.MinOperations("001011"))

}
