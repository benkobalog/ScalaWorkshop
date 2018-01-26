### People who might find these exercises interesting
* Should be somewhat familiar with Scala or can write "Java in Scala".
* Want to practice some functional programming.
* Are not very familiar with Scala Collections and would like to learn some useful functions

#### Topics not covered in this project
* Monads
* Scala basics
* The different data types of the Scala Collections

### How to use this project
1. Clone the repo.
2. Choose an exercise which you want to solve. 
    Each object has a run function which is not implemented (marked by _???_).
    The signature of the run functions are of course different for each Exercise.
3. Implement the run function until it passes all tests \o/.

Feel free to check out the corresponding tests as well.

Also if you find any errors let me know.

#### Rules
* Don't use **var**'s, only **val**'s are allowed.
* Prefer expressions over statements.
* Don't use loops, use recursion or collections functions like map or fold.

### Useful methods on Scala collections
I think the following methods are definitely worth knowing about,
 because they can make the code easier to write and read.
 Most of these methods are defined on most of the collections data types, 
 however not all, because some operations only make sense for sequential data types.

_If you know all of these methods well enough, probably you won't benefit much from the exercises either._

* map
* filter
* collect
* fold
* reduce
* exists
* contains
* forall
* sliding
* max, min
* maxBy, minBy
* drop, take
* partition
* span
* takeWhile, dropWhile
* head, tail, headOption
* fill
* groupBy
* reverse
* zip
* zipWithIndex

For a more comprehensive list and some visual explanations:
 https://superruzafa.github.io/visual-scala-reference/index.html#product
 
##### Some methods could be composed from other methods:
```scala
val l = List(1, -3, 5, 9, -4)
val n = 2; val p = (n: Int) => n > 3 

l.span(p)      == (l.takeWhile(p),  l.dropWhile(p))
l.partition(p) == (l.filter(p), l.filterNot(p))
l.splitAt(n)   == (l.take(n), l.drop(n))
```

### Check this out if you want to learn more Scala
https://gist.github.com/d1egoaz/2180cbbf7d373a0c5575f9a62466e5e1

### VM image
[link](https://epam-my.sharepoint.com/:u:/p/benko_balog/Ed0XH3aEv6RIu6GM5UaVAUQBI3B7LEvXxOm4Bqy72-jOZg?e=bd7Xg5)


(file://EPHUBUDW0181/Users/Benko_Balog/Documents/share/ScalaExercises.ova)

