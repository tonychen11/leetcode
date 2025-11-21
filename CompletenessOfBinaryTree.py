class Solution:
    def isCompleteTree(self, root: Optional[TreeNode]) -> bool:
        deq = deque()
        deq.append([root, 0])
        level = 1 #4
      
        while len(deq) > 0:
            num = 0
            size = len(deq)
            levelIndex = 0

            for i in range(size):
                curr = deq.popleft()        

                if curr[1] != i:
                    return False                                 

                if curr[0].left:
                    deq.append([curr[0].left, levelIndex])
                if curr[0].right:
                    deq.append([curr[0].right, levelIndex + 1])
                
                levelIndex += 2
                num += 1

            if level != num and len(deq) != 0:
                return False

            level *= 2

        return True
