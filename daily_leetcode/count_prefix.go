package dailyleetcode

import "fmt"

func PrefixCount(words []string, pref string) int {

	var count int

	for _, word := range words {

		if len(word) >= len(pref) {
			prefLen := len(pref)
			fmt.Println("woprd", word[:prefLen], pref)
			if word[:prefLen] == pref {
				count++
			}

		}

	}

	return count

}
