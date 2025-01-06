package basicmath

import "fmt"

func ReverseNum(x int) int {

	rev := 0
	for x != 0 {
		pop := x % 10
		x /= 10
		if rev > 214748364 || (rev == 214748364 && pop > 7) {
			return 0
		}
		if rev < -214748364 || (rev == -214748364 && pop < -8) {
			return 0
		}
		rev = rev*10 + pop
	}
	return rev

}

func ReverseNumTwo(n int) {
	if n != 0 {
		remainder := n
		fmt.Println(remainder)
	}
}
