package dailyleetcode

import (
	"math"
)

func MinOperations(boxes string) []int {

	minimumArr := make([]int, len(boxes))

	for i := 0; i < len(boxes); i++ {
		moves := 0
		for position, character := range boxes {
			if character == '1' {
				moves += int(math.Abs(float64(position) - float64(i)))

			}

		}

		minimumArr[i] = moves

	}

	return minimumArr
}
