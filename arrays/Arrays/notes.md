# Two Sum

**Topic:** Arrays / HashMap
**Difficulty:** Easy
**Time spent:** ~10 min
**Time complexity:** O(n)
**Space complexity:** O(n)

## Approach

One-pass hash map. For each number, check if its complement (target - num) is
already in the map before inserting the current number. Avoids the O(n^2)
brute-force nested loop.

## What I missed / would do differently

(fill in after you solve it — e.g. "first tried nested loops, didn't think of
storing complements until I got stuck")

## Pattern to remember

Hash map trades space for time when you need to check "have I seen X before"
in O(1) instead of scanning. Comes up constantly (pairs, duplicates, frequency counts).
