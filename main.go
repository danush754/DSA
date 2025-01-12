package main

import (
	"fmt"

	basicmath "github.com/danush754/DSA/basic_math"
	dailyleetcode "github.com/danush754/DSA/daily_leetcode"
)

func main() {

	fmt.Println("isPalindropme", basicmath.IsPalindrome(121))
	fmt.Println("isSubset", dailyleetcode.WordSubsets([]string{"amazon", "apple", "facebook", "google", "leetcode"}, []string{"e", "o"}))

	fmt.Println("isssSubset", dailyleetcode.WordSubsets([]string{"amazon", "apple", "facebook", "google", "leetcode"}, []string{"e", "oo"}))

}
