class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        sz=len(nums)
        i=0
        while i < sz:
            if sz==i+1:
                return nums[i];
            elif nums[i]==nums[i+1]:
                i+=2
            elif nums[i]!=nums[i+1]:
                return nums[i]