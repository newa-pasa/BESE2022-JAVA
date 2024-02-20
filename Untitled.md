table 


total_marks {
	name
	total
}

Concurrency issue ---> Lost update problem 

| sub | name | marks |  |
| ---- | ---- | ---- | ---- |
| maths | rajan | 70 |  |
| DS | rajan | 90 | reads 150 as total--- wait for release  |
| C | rajan | 80 | reads 70 as total |

| name | total |
| --- | --- |
| rajan | 240 |
