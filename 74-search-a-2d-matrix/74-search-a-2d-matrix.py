class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        a = -1
        lo = 0
        # List = matrix
        hi = len(matrix) - 1;
        while lo <= hi:
            mid = (lo+hi)//2
            print(mid)
            if matrix[mid][0] <= target and matrix[mid][len(matrix[0])-1] >= target:
                a = mid
                break
            elif matrix[mid][0] < target:
                lo = mid+1
            else:
                hi = mid-1
                
        if a == -1:
            return False
        else:
            lo = 0
            hi = len(matrix[0])-1
            while lo <= hi:
                mid = (lo+hi)//2
                if matrix[a][mid] == target:
                    return True
                elif matrix[a][mid] < target:
                    lo = mid+1
                else:
                    hi = mid-1
            return False