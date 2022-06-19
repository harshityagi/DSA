class Solution:
    def minimumTotal(self, t: List[List[int]]) -> int:
        dp=[0]*(len(t)+1)
        for row in t[::-1]:
            for i,n in enumerate(row):
                dp[i]=n+min(dp[i],dp[i+1])
        return dp[0]
