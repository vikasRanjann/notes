# Data Structures and Algorithms

## Agenda
* Introduction to course
* Introduction to Data Structures
* Time and Space complexity
* Searching Algorithms
	* Linear Search
	* Binary Search
* Recursion

## GitLab Repository
* https://gitlab.com/sunbeam-modular/dsa-05

## Time complexity
* Factorial -- O(n)
	```python
	res = 1
	for i in range(1,n+1):
		res = res * i
	print("Factorial : ", res)
	```

## Linear Search
* Q & A: How to return all found element indices in search?
	```Java
	List<Integer> linearSearch(int[] arr, int key) {
		List<Integer> list = new ArrayList<>();
		for(i=0; i<arr.length; i++) {
			if(key == arr[i])
				list.add(i);
		}
		return list;
	}
	```

