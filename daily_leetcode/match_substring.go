package dailyleetcode

import "strings"

func StringMatching(words []string) []string {

	var subStr []string
	seen := make(map[string]bool)

	for i := 0; i < len(words); i++ {
		for j := 0; j < len(words); j++ {
			if strings.Contains(words[j], words[i]) && i != j {
				if !seen[words[i]] {
					subStr = append(subStr, words[i])
					seen[words[i]] = true
				}

				break
			}
		}

	}
	return subStr
}
