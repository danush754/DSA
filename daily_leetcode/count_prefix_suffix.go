package dailyleetcode

func CountPrefixSuffixPairs(words []string) int64 {
	count := 0

	for i := 0; i < len(words); i++ {
		for j := 0; j < i; j++ {
			isPrefixAndSuffix := findIsSuffixandPrefix(words[i], words[j])
			if isPrefixAndSuffix {
				count += 1

			}

		}

	}

	return int64(count)

}

func findIsSuffixandPrefix(str, substr string) bool {

	if len(str) < len(substr) {
		return false
	}

	sliceLen := len(substr)

	if str[:sliceLen] == substr && str[len(str)-sliceLen:] == substr {
		return true
	}

	return false
}
