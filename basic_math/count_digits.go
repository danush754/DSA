package basicmath

import (
	"fmt"
	"strconv"
)

func CountDigits(n int) int {

	var validDivisible int

	stringValue := fmt.Sprintf("%d", n)

	for _, character := range stringValue {
		digit, _ := strconv.Atoi(string(character))
		if n%digit == 0 {
			validDivisible++
		}
	}

	return validDivisible

}
