# arrays and hashing

- [arrays and hashing](#arrays-and-hashing)
  - [contains duplicate](#contains-duplicate)
  - [valid anagram](#valid-anagram)
  - [two sum](#two-sum)
  - [group anagrams](#group-anagrams)

## contains duplicate 
- easy
<details>
<summary>check if the array contains any duplicate elements</summary>

### description
Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

### examples
example 1:
input: nums = [1,2,3,1]
output: true

example 2:
input: nums = [1,2,3,4]
output: false

example 3:
input: nums = [1,1,1,3,3,4,3,2,4,2]
output: true

### solution
[solution](./src/main/java/dev/nj/solutions/ContainsDuplicate.java)
<br/>
[test](./src/test/java/dev/nj/solutions/ContainsDuplicateTests.java)

</details>

<hr/>

## valid anagram
- easy
<details>
<summary>check if 2nd string is anagram of 1st string</summary>

### description
Given two strings `s` and `t`, return `true` *if* `t` *is an anagram of* `s`, *and* `false` *otherwise*

### examples
example 1:
input: s = "anargram", t = "nagaram"
output: true

example 2:
input: s = "rat", t = "car"
output: false

### contraints
- `1 <= s.length, t.length <= 5 * 10^4`
- `s` and `t` consist of lowercase English letters.

### solution
[solution](./src/main/java/dev/nj/solutions/ValidAnagram.java)
<br/>
[test](./src/test/java/dev/nj/solutions/ValidAnagramTests.java)

</details>

<hr/>

## two sum
- easy
<details>
<summary>return indices of two numbers sum up to target</summary>

### description
Given an array of integers `nums` and an integer `target`, return *indices of the two numbers such that they add up to* *`target`*.

You may assume that each input would have **_exactly_ one solution**, and you may not use the same element twice.

You can return the answer in any order.

### examples
example 1:
input: nums = [2,7,11,15], target = 9
output: [0,1]
explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

example 2:
input: nums = [3,2,4], target = 6
output: [1,2]

example 3:
input: nums = [3,3], target = 6
output: [0,1]

### constraints
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9` 
- **Only one valid answer exists**

### solution
[solution](./src/main/java/dev/nj/solutions/TwoSum.java)
<br/>
[test](./src/test/java/dev/nj/solutions/TwoSumTests.java)

</details>

<hr/>

## group anagrams
<details>
<summary>group anagrams together</summary>

### description
Given an array of strings `strs`, group the anagrams together. You can return the answer in **any order**.

## examples
example 1:
input: strs = ["eat","tea","tan","ate","nat","bat"]
output: [["bat"],["nat","tan"],["ate","eat","tea"]]

explanation:
- There is no string in strs that can be rearranged to form "bat".
- The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
- The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

example 2:
input: strs = [""]
output: [[""]]

example 3:
input: strs = ["a"]
output: [["a"]]

### constraints
- `1 <= strs.length <= 10^4` 
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of lowercase English letters.

### solution
[solution](./src/main/java/dev/nj/solutions/GroupAnagram.java)
<br/>
[test](./src/test/java/dev/nj/solutions/GroupAnagramTests.java)

</details>

<hr/>

[<<](../README.md)
<!--
:%s/\(Sample \(Input\|Output\) \d:\)\n\(.*\)/```\r\r**\1**\r```\3/gc

## 
<details>
<summary></summary>

### description

## examples

### solution
[solution](./src/main/java/dev/nj/solutions/)
<br/>
[test](./src/test/java/dev/nj/solutions/)

### constraints
- 

</details>

<hr/>

-->
