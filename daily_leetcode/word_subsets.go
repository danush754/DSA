package dailyleetcode

import "math"

func WordSubsets(words1 []string, words2 []string) []string {
	maxCount := make([]int, 26) // To store the maximum frequency of each character needed

	// Calculate the maximum frequency of each character needed from words2
	for _, word := range words2 {
		count := make([]int, 26) // Frequency count for the current word in words2
		for _, ch := range word {
			count[ch-'a']++
		}
		for i := 0; i < 26; i++ {
			maxCount[i] = int(math.Max(float64(maxCount[i]), float64(count[i])))
		}
	}

	result := []string{} // To store the universal words

	// Check each word in words1
	for _, word := range words1 {
		count := make([]int, 26) // Frequency count for the current word in words1
		for _, ch := range word {
			count[ch-'a']++
		}

		// Check if this word can cover all character requirements from words2
		isUniversal := true
		for i := 0; i < 26; i++ {
			if count[i] < maxCount[i] {
				isUniversal = false
				break
			}
		}

		if isUniversal {
			result = append(result, word)
		}
	}

	return result
}
