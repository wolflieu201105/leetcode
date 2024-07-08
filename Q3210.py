class Solution(object):
    def getEncryptedString(self, s, k):
        k = k%len(s)
        return s[k:] + s[: k]