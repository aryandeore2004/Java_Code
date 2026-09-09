# Binary Search — Complete Notes

## 1. Binary Search

Binary Search is used to search for an element in a **sorted array**.

Instead of checking every element one by one, we repeatedly divide the search area into half.

### Example

```text
arr = [10, 20, 30, 40, 50, 60, 70]
target = 50
```

Start:

```text
low = 0
high = 6
mid = 3
arr[mid] = 40
```

Since `40 < 50`, search the right side.

```text
low = mid + 1
```

Then:

```text
mid = 5
arr[mid] = 60
```

Since `60 > 50`, search the left side.

Eventually:

```text
arr[4] = 50
```

Target found at index `4`.

### Code

```java
public static int binarySearch(int[] arr, int target) {

    int low = 0;
    int high = arr.length - 1;

    while(low <= high) {

        int mid = low + (high - low) / 2;

        if(arr[mid] == target)
            return mid;

        else if(arr[mid] < target)
            low = mid + 1;

        else
            high = mid - 1;
    }

    return -1;
}
```

### Three Important Conditions

```java
arr[mid] == target
```

Target found.

```java
arr[mid] < target
```

Search right:

```java
low = mid + 1;
```

```java
arr[mid] > target
```

Search left:

```java
high = mid - 1;
```

### Complexity

```text
Time  : O(log n)
Space : O(1)
```

---

# 2. Why `low + (high-low)/2`?

You may see:

```java
mid = (low + high) / 2;
```

Better practice:

```java
mid = low + (high - low) / 2;
```

The second form avoids integer overflow when `low` and `high` are very large.

---

# 3. Binary Search Requirements

Binary Search normally requires the array to be sorted.

Works:

```text
[1, 3, 5, 7, 9]
```

Normal binary search does not work correctly on:

```text
[7, 2, 9, 1, 5]
```

---

# 4. First and Last Occurrence

Suppose:

```text
arr = [1, 2, 2, 2, 2, 3, 4]
target = 2
```

Target occurs at:

```text
1 2 3 4
```

We want:

```text
First occurrence = 1
Last occurrence  = 4
```

Normal Binary Search can find any occurrence.

For first and last occurrence, we continue searching after finding the target.

---

## First Occurrence

When:

```java
arr[mid] == target
```

Save the answer:

```java
ans = mid;
```

Then move left:

```java
high = mid - 1;
```

Why?

There may be another occurrence before `mid`.

### Code

```java
public static int firstOccurrence(int[] arr, int target) {

    int low = 0;
    int high = arr.length - 1;
    int ans = -1;

    while(low <= high) {

        int mid = low + (high - low) / 2;

        if(arr[mid] == target) {
            ans = mid;
            high = mid - 1;
        }
        else if(arr[mid] < target) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    return ans;
}
```

---

## Last Occurrence

When:

```java
arr[mid] == target
```

Save the answer:

```java
ans = mid;
```

Then move right:

```java
low = mid + 1;
```

Why?

There may be another occurrence after `mid`.

### Code

```java
public static int lastOccurrence(int[] arr, int target) {

    int low = 0;
    int high = arr.length - 1;
    int ans = -1;

    while(low <= high) {

        int mid = low + (high - low) / 2;

        if(arr[mid] == target) {
            ans = mid;
            low = mid + 1;
        }
        else if(arr[mid] < target) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    return ans;
}
```

---

# 5. Count Occurrences

Once first and last occurrences are known:

```text
count = last - first + 1
```

Example:

```text
first = 1
last = 4

count = 4 - 1 + 1
      = 4
```

So `2` appears 4 times.

---

# 6. Lower Bound

## Definition

Lower Bound means:

> Find the **first index where `arr[i] >= target`**.

The important condition is:

```text
>=
```

### Example

```text
arr = [1, 2, 4, 4, 6, 8]
target = 4
```

The first element `>= 4` is at index `2`.

```text
lowerBound = 2
```

### Example where target does not exist

```text
arr = [1, 2, 4, 6, 8]
target = 5
```

The first element `>= 5` is `6`.

```text
lowerBound = 3
```

### If no valid element exists

```text
arr = [1, 2, 4, 6, 8]
target = 10
```

No element is `>= 10`.

Return:

```text
arr.length
```

So:

```text
lowerBound = 5
```

---

## Lower Bound Code

```java
public static int lowerBound(int[] arr, int target) {

    int low = 0;
    int high = arr.length;

    while(low < high) {

        int mid = low + (high - low) / 2;

        if(arr[mid] >= target)
            high = mid;
        else
            low = mid + 1;
    }

    return low;
}
```

### Why `high = arr.length`?

Because the answer can be `arr.length` when no element satisfies the condition.

---

# 7. Lower Bound Dry Run

```text
arr = [1,2,4,4,6,8]
target = 5
```

Start:

```text
low = 0
high = 6
```

### Step 1

```text
mid = 3
arr[3] = 4
```

Check:

```text
4 >= 5 → false
```

Therefore:

```text
low = mid + 1
low = 4
```

### Step 2

```text
low = 4
high = 6

mid = 5
arr[5] = 8
```

Check:

```text
8 >= 5 → true
```

Therefore:

```text
high = mid
high = 5
```

### Step 3

```text
low = 4
high = 5

mid = 4
arr[4] = 6
```

Check:

```text
6 >= 5 → true
```

Therefore:

```text
high = 4
```

Now:

```text
low = 4
high = 4
```

Stop.

Answer:

```text
4
```

---

# 8. Upper Bound

## Definition

Upper Bound means:

> Find the **first index where `arr[i] > target`**.

Important condition:

```text
>
```

### Example

```text
arr = [1,2,4,4,6,8]
target = 4
```

The first element greater than `4` is `6`.

```text
upperBound = 4
```

---

## Upper Bound Code

```java
public static int upperBound(int[] arr, int target) {

    int low = 0;
    int high = arr.length;

    while(low < high) {

        int mid = low + (high - low) / 2;

        if(arr[mid] > target)
            high = mid;
        else
            low = mid + 1;
    }

    return low;
}
```

---

# 9. Lower Bound vs Upper Bound

Consider:

```text
arr = [1,2,4,4,4,6,8]
target = 4
```

### Lower Bound

Find first:

```text
arr[i] >= 4
```

Answer:

```text
2
```

### Upper Bound

Find first:

```text
arr[i] > 4
```

Answer:

```text
5
```

Therefore:

```text
lowerBound(4) = 2
upperBound(4) = 5
```

---

# 10. First Occurrence vs Lower Bound

For a target that exists:

```text
firstOccurrence == lowerBound
```

Example:

```text
arr = [1,2,4,4,4,6]
target = 4
```

Both return:

```text
2
```

Why?

Lower Bound asks for the first element `>= 4`.

Since `4` exists, that is the first occurrence of `4`.

---

# 11. Last Occurrence vs Upper Bound

For a target that exists:

```text
lastOccurrence = upperBound - 1
```

Example:

```text
arr = [1,2,4,4,4,6]
target = 4
```

```text
upperBound = 5
```

Therefore:

```text
lastOccurrence = 5 - 1
               = 4
```

---

# 12. Count Occurrences Using Bounds

A very useful formula:

```text
count = upperBound - lowerBound
```

Example:

```text
arr = [1,2,4,4,4,6,8]
target = 4
```

```text
lowerBound = 2
upperBound = 5
```

Therefore:

```text
count = 5 - 2
      = 3
```

So `4` appears 3 times.

---

# 13. One Example for All Concepts

Given:

```text
arr = [1,2,2,2,4,5,7]
target = 2
```

### Normal Binary Search

Can return any occurrence:

```text
2
```

### First Occurrence

```text
1
```

### Last Occurrence

```text
3
```

### Lower Bound

First element `>= 2`:

```text
1
```

### Upper Bound

First element `> 2`:

```text
4
```

Summary:

```text
Binary Search   → any index containing 2
First           → 1
Last            → 3
Lower Bound     → 1
Upper Bound     → 4
```

---

# 14. What If Target Does Not Exist?

```text
arr = [1,3,5,7,9]
target = 4
```

### Binary Search

```text
-1
```

### Lower Bound

First element `>= 4` is `5`.

```text
lowerBound = 2
```

### Upper Bound

First element `> 4` is also `5`.

```text
upperBound = 2
```

Therefore:

```text
lowerBound(4) = 2
upperBound(4) = 2
```

---

# 15. Lower Bound as an Insertion Position

Example:

```text
arr = [1,3,5,7]
target = 4
```

Lower Bound:

```text
2
```

So `4` should be inserted at index `2`:

```text
[1,3,4,5,7]
```

This is one reason Lower Bound is very useful.

---

# 16. Upper Bound Visualization

### Lower Bound

Divides the array into:

```text
< target | >= target
```

Example:

```text
[1 2 3 4 4 6 8]
        ↑
      lower
```

### Upper Bound

Divides the array into:

```text
<= target | > target
```

Example:

```text
[1 2 3 4 4 6 8]
          ↑
        upper
```

Remember:

```text
Lower → >=
Upper → >
```

---

# 17. Complexity

### Normal Binary Search

```text
Time  : O(log n)
Space : O(1)
```

### First + Last Occurrence

```text
O(log n) + O(log n)
= O(log n)
```

### Lower + Upper Bound

```text
O(log n) + O(log n)
= O(log n)
```

---

# 18. Important Cheat Sheet

## Normal Binary Search

```java
if(arr[mid] == target)
    return mid;

else if(arr[mid] < target)
    low = mid + 1;

else
    high = mid - 1;
```

## First Occurrence

```text
found → save answer → go LEFT
```

```java
ans = mid;
high = mid - 1;
```

## Last Occurrence

```text
found → save answer → go RIGHT
```

```java
ans = mid;
low = mid + 1;
```

## Lower Bound

```text
first index where arr[i] >= target
```

```java
if(arr[mid] >= target)
    high = mid;
else
    low = mid + 1;
```

## Upper Bound

```text
first index where arr[i] > target
```

```java
if(arr[mid] > target)
    high = mid;
else
    low = mid + 1;
```

## Relationships

```text
first occurrence = lower bound

last occurrence = upper bound - 1

count = upper bound - lower bound
```

---

# 19. Practice Test Cases

### Test Case 1

```text
arr = [1,2,3,4,5]
target = 3

Binary Search = 2
First = 2
Last = 2
Lower = 2
Upper = 3
```

### Test Case 2

```text
arr = [1,2,2,2,5]
target = 2

First = 1
Last = 3
Lower = 1
Upper = 4
```

### Test Case 3

```text
arr = [1,3,5,7,9]
target = 4

Binary Search = -1
Lower = 2
Upper = 2
```

### Test Case 4

```text
arr = [2,2,2,2]
target = 2

First = 0
Last = 3
Lower = 0
Upper = 4
```

### Test Case 5

```text
arr = [1,3,5,7]
target = 10

Lower = 4
Upper = 4
```

---

# 20. Learning Roadmap

Learn in this order:

```text
1. Binary Search
        ↓
2. First & Last Occurrence
        ↓
3. Lower Bound
        ↓
4. Upper Bound
        ↓
5. Count Occurrences Using Bounds
        ↓
6. Binary Search on Answer
```

After these concepts, the next major topic is **Binary Search on Answer**.

Important problems include:

- Square Root
- Koko Eating Bananas
- Capacity to Ship Packages
- Aggressive Cows
- Book Allocation
- Split Array Largest Sum
