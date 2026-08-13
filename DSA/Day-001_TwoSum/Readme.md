# Day 001 — Two Sum

## 📌 Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers whose sum is equal to `target`.

Each input has exactly one valid solution, and the same element cannot be used twice.

---

## 💡 Approach

I used a **HashMap** to solve this problem efficiently.

Instead of checking every possible pair using nested loops, I store each number along with its index while traversing the array.

For every element `nums[i]`:

1. Calculate the required value:
   `complement = target - nums[i]`
2. Check whether the complement already exists in the HashMap.
3. If it exists, return the stored index and the current index.
4. Otherwise, store the current number and its index in the HashMap.

This allows us to find the required pair in a single traversal of the array.

---

## 🔍 Example

```text
nums = [2, 7, 11, 15]
target = 9
```

* Start with `2`
* Required value = `9 - 2 = 7`
* `7` is not in the HashMap, so store `2 → 0`
* Next value is `7`
* Required value = `9 - 7 = 2`
* `2` already exists at index `0`

Therefore:

```text
Answer = [0, 1]
```

---

## ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

The HashMap allows us to avoid checking every possible pair, reducing the time complexity from `O(n²)` to `O(n)`.

---

## 📚 What I Learned

Today I learned how a **HashMap can be used to optimize array problems** by storing previously visited elements.

The key idea I learned from this problem is:

> Instead of searching for the required value again and again, store the values that have already been visited.

This pattern can be useful in many problems involving **arrays, pairs, complements, and frequency/count lookups**.

---

## 🔗 Problem

[LeetCode — Two Sum](https://leetcode.com/problems/two-sum/)

## 💻 Solution

[View Solution.java](./Solution.java)

---

### 🏷️ Tags

`Array` `HashMap` `Two Sum` `Easy` `Java`
