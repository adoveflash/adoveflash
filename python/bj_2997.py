"""
BOJ 2997 - 네 번째 수

가장 작은 수를 a라 하면 두번째, 세번째로 큰 수가 될수 있는 경우의 수는 두가지 밖에 없다
a + 2d, a + 3d 이거나 a + d, a + 2d인 경우이다.
어떠한 경우에도 두 수를 빼면 공차가 나오게 되고 이를 통해 출력을 조정해주면 된다.

"""

nums = list(map(int, input().split()))

nums.sort()

d = nums[2] - nums[1]

print(nums[0] + 3*d if nums[0] + d == nums[1] else nums[0] + d)