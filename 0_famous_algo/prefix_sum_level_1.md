# Prefix Sum — Level 1: Basic Prefix Sum

## 1. Running Sum

### Question

Given an array, create an array where each element is the sum of all previous elements including itself.

### Example

```text
Input:  [1, 2, 3, 4]
Output: [1, 3, 6, 10]
```

### Logic

```java
sum += arr[i];
arr[i] = sum;
```

### Code

```java
public static int[] runningSum(int[] arr) {
    int sum = 0;

    for(int i = 0; i < arr.length; i++) {
        sum += arr[i];
        arr[i] = sum;
    }

    return arr;
}
```

### Dry Run

```text
arr = [1, 2, 3, 4]

i=0 → sum=1  → [1,2,3,4]
i=1 → sum=3  → [1,3,3,4]
i=2 → sum=6  → [1,3,6,4]
i=3 → sum=10 → [1,3,6,10]
```

**Time:** `O(n)`  
**Space:** `O(1)` if modifying the original array.

---

# 2. Prefix Sum Array

This is the basic Prefix Sum concept.

### Question

Create a separate prefix array.

### Example

```text
Input:  [2, 3, 5, 1, 4]
Output: [2, 5, 10, 11, 15]
```

### Logic

```java
prefix[i] = prefix[i-1] + arr[i];
```

### Code

```java
public static int[] prefixSum(int[] arr) {
    int[] prefix = new int[arr.length];

    prefix[0] = arr[0];

    for(int i = 1; i < arr.length; i++) {
        prefix[i] = prefix[i-1] + arr[i];
    }

    return prefix;
}
```

### Dry Run

```text
arr    = [2, 3, 5, 1, 4]
prefix = [2, 5, 10, 11, 15]
```

**Time:** `O(n)`  
**Space:** `O(n)`

---

# 3. Range Sum Query

Now we use the prefix array to find the sum between two indexes.

### Question

```text
arr = [2, 3, 5, 1, 4]

l = 1
r = 3
```

Find:

```text
3 + 5 + 1 = 9
```

Prefix:

```text
[2, 5, 10, 11, 15]
```

### Formula

```text
sum(l,r) = prefix[r] - prefix[l-1]
```

Therefore:

```text
prefix[3] - prefix[0]
= 11 - 2
= 9
```

### Code

```java
public static int rangeSum(int[] prefix, int l, int r) {

    if(l == 0)
        return prefix[r];

    return prefix[r] - prefix[l-1];
}
```

**Time per query:** `O(1)`  
**Prefix creation:** `O(n)`

> Prefix Sum makes a range-sum query `O(1)` after the prefix array is created.

---

# 4. Equilibrium Index

### Question

Find an index where:

```text
Left Sum == Right Sum
```

The current element is excluded from both sides.

### Example

```text
arr = [2, 3, -1, 8, 4]
```

At index `3`:

```text
Left  = 2 + 3 - 1 = 4
Right = 4
```

Answer:

```text
3
```

### Prefix

```text
[2, 5, 4, 12, 16]
```

### Logic

```java
left = prefix[i-1];
right = prefix[n-1] - prefix[i];
```

### Code

```java
public static int equilibrium(int[] arr) {
    int n = arr.length;

    int[] prefix = new int[n];
    prefix[0] = arr[0];

    for(int i = 1; i < n; i++)
        prefix[i] = prefix[i-1] + arr[i];

    for(int i = 0; i < n; i++) {

        int left = (i == 0) ? 0 : prefix[i-1];
        int right = prefix[n-1] - prefix[i];

        if(left == right)
            return i;
    }

    return -1;
}
```

**Time:** `O(n)`  
**Space:** `O(n)`

---

# 5. Pivot Index

Pivot Index is almost the same as Equilibrium Index.

### Question

Find the index where:

```text
sum of elements to left
=
sum of elements to right
```

The current element is excluded.

### Example

```text
Input:  [1, 7, 3, 6, 5, 6]
Output: 3
```

At index `3`:

```text
Left:
1 + 7 + 3 = 11

Right:
5 + 6 = 11
```

Therefore:

```text
Answer = 3
```

### Prefix Sum

```text
[1, 8, 11, 17, 22, 28]
```

At `i = 3`:

```text
left = prefix[2]
     = 11

right = prefix[5] - prefix[3]
      = 28 - 17
      = 11
```

### Code

```java
public static int pivotIndex(int[] arr) {
    int n = arr.length;

    int[] prefix = new int[n];
    prefix[0] = arr[0];

    for(int i = 1; i < n; i++)
        prefix[i] = prefix[i-1] + arr[i];

    for(int i = 0; i < n; i++) {

        int left = (i == 0) ? 0 : prefix[i-1];
        int right = prefix[n-1] - prefix[i];

        if(left == right)
            return i;
    }

    return -1;
}
```

---

# Important Prefix Sum Formulas

## 1. Build Prefix

```java
prefix[i] = prefix[i-1] + arr[i];
```

## 2. Range Sum

```text
sum(l, r) = prefix[r] - prefix[l-1]
```

For `l = 0`:

```text
sum(0, r) = prefix[r]
```

## 3. Left Sum

```text
left = prefix[i-1]
```

For `i = 0`:

```text
left = 0
```

## 4. Right Sum

```text
right = totalSum - prefix[i]
```

---

# Level 1 Summary

```text
Running Sum
     ↓
Prefix Sum Array
     ↓
Range Sum Query
     ↓
Equilibrium Index
     ↓
Pivot Index
```

## Learning Order

1. Running Sum
2. Prefix Sum Array
3. Range Sum Query
4. Equilibrium Index
5. Pivot Index

After these, move to:

```text
Prefix Sum + HashMap
        ↓
Subarray Sum Equals K
        ↓
Longest Subarray Sum K
        ↓
Zero Sum Subarray
        ↓
Count Subarrays with Sum K
```


---

# Level 2 — Prefix Sum + Subarrays

> **Note:** Some Level 2 and Level 3 problems are duplicates. Learn the pattern instead of memorizing separate codes.

## 6. Longest Subarray with Sum K ⭐

### Question

Find the **length of the longest subarray** whose sum is `K`.

### Example

```text
Input:
arr = [10, 5, 2, 7, 1, 9]
K = 15

Output:
4
```

Because:

```text
[5, 2, 7, 1] = 15
```

### Key Idea

Use:

```text
Prefix Sum + HashMap
```

If:

```text
currentSum - K
```

was seen before, we found a subarray with sum `K`.

### Code

```java
public static int longestSubarray(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int sum = 0;
    int maxLen = 0;

    for(int i = 0; i < arr.length; i++) {
        sum += arr[i];

        if(sum == k)
            maxLen = i + 1;

        if(map.containsKey(sum - k))
            maxLen = Math.max(maxLen, i - map.get(sum - k));

        if(!map.containsKey(sum))
            map.put(sum, i);
    }

    return maxLen;
}
```

**Time:** `O(n)`  
**Space:** `O(n)`

---

# 7. Zero Sum Subarray

### Question

Check whether an array contains a subarray whose sum is `0`.

### Example

```text
Input:
[4, 2, -3, 1, 6]

Output:
true
```

Because:

```text
[2, -3, 1] = 0
```

### Key Idea

If the **same prefix sum occurs twice**, the elements between them have sum `0`.

### Code

```java
public static boolean zeroSum(int[] arr) {
    HashSet<Integer> set = new HashSet<>();

    int sum = 0;

    for(int x : arr) {
        sum += x;

        if(sum == 0 || set.contains(sum))
            return true;

        set.add(sum);
    }

    return false;
}
```

**Time:** `O(n)`  
**Space:** `O(n)`

---

# 8. Count Subarrays with Sum K

### Question

Count how many subarrays have sum equal to `K`.

### Example

```text
Input:
arr = [1, 2, 3]
K = 3

Output:
2
```

Subarrays:

```text
[1, 2]
[3]
```

### Key Idea

Use:

```text
currentSum - K
```

Store the **frequency** of every prefix sum.

### Code

```java
public static int countSubarrays(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(0, 1);

    int sum = 0;
    int count = 0;

    for(int x : arr) {
        sum += x;

        count += map.getOrDefault(sum - k, 0);

        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
}
```

**Time:** `O(n)`  
**Space:** `O(n)`

---

# 9. Subarray Sum Equals K ⭐

This is essentially the **same pattern as #8**.

The famous LeetCode problem is **Subarray Sum Equals K**.

### Example

```text
Input:
nums = [1, 1, 1]
k = 2

Output:
2
```

Valid subarrays:

```text
[1,1] → indexes 0-1
[1,1] → indexes 1-2
```

### Code

```java
public static int subarraySum(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(0, 1);

    int sum = 0;
    int count = 0;

    for(int x : nums) {
        sum += x;

        count += map.getOrDefault(sum - k, 0);

        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
}
```

**#8 and #9 are essentially the same pattern.**

---

# Level 3 — Prefix Sum + HashMap

## 10. Longest Subarray with Sum K

This is **the same as #6**.

Do not learn it as a separate problem.

The important distinction is:

```text
Longest → store FIRST occurrence of prefix sum
Count   → store FREQUENCY of prefix sum
```

### Longest

```java
if(!map.containsKey(sum))
    map.put(sum, i);
```

### Count

```java
map.put(sum, map.getOrDefault(sum, 0) + 1);
```

⭐ This difference is very important.

---

# 11. Count Zero Sum Subarrays ⭐

### Question

Count the number of subarrays whose sum is `0`.

### Example

```text
arr = [1, -1, 2, -2]
```

Valid subarrays:

```text
[1,-1]
[2,-2]
[1,-1,2,-2]
```

Answer:

```text
3
```

### Code

```java
public static int countZeroSum(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(0, 1);

    int sum = 0;
    int count = 0;

    for(int x : arr) {
        sum += x;

        count += map.getOrDefault(sum, 0);

        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
}
```

**Time:** `O(n)`  
**Space:** `O(n)`

---

# 12. Binary Subarrays With Sum

This problem uses an array containing only:

```text
0 and 1
```

### Question

Count subarrays whose sum equals `goal`.

### Example

```text
nums = [1,0,1,0,1]
goal = 2

Output:
4
```

### Code

```java
public static int numSubarraysWithSum(int[] nums, int goal) {
    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(0, 1);

    int sum = 0;
    int count = 0;

    for(int x : nums) {
        sum += x;

        count += map.getOrDefault(sum - goal, 0);

        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
}
```

---

# 🧠 Most Important Prefix Sum + HashMap Pattern

Many problems use the same formula:

```text
currentPrefixSum - requiredSum
```

### For Longest Subarray

```text
prefixSum - K
```

Find it → calculate length.

### For Count Subarrays

```text
prefixSum - K
```

Find frequency → add frequency.

### For Zero Sum

```text
prefixSum
```

Find a previous same prefix sum.

---

# ⭐ What You Actually Need to Learn

Do not memorize 7 different codes. Learn these **3 patterns**:

```text
1. Prefix Sum
       ↓
   Range Sum


2. Prefix Sum + HashSet
       ↓
   Does zero-sum subarray exist?


3. Prefix Sum + HashMap
       ↓
   Longest / Count subarrays
```

## HashMap Rule

| Problem | HashMap stores |
|---|---|
| Longest Subarray Sum K | **First index** |
| Count Subarrays Sum K | **Frequency** |
| Count Zero Sum | **Frequency** |
| Binary Subarrays Sum | **Frequency** |

## Recommended Order

```text
6 → Longest Subarray Sum K
7 → Zero Sum Subarray
8 → Count Subarrays Sum K
11 → Count Zero Sum Subarrays
12 → Binary Subarrays With Sum
```

You can skip **9** and **10** as separate topics because they repeat #8 and #6.
