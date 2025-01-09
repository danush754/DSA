package basicmath

func IsPalindrome(x int) bool {

	if x >= 0 {

		var reversedNum = 0
		var orignalval = x
		for x > 0 {
			a := x % 10
			x = x / 10
			reversedNum = (reversedNum * 10) + a
		}

		if orignalval^reversedNum == 0 {
			return true
		}

	}

	return false
}
