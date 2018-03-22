#!~/Groovy
/*
	1): Scripts contain Groovy statements without an enclosing class declaration.
	2): Scripts can even contain method definitions outside of class definitions to better structure the code.
	3): A Groovy script is fully constructed—that is, parsed, compiled, and generated—before execution.
*/

// demo print
printn "Hello World, Groovy"

// demo create a class instance
def book = new Book(title: "Groovy in Action")
printn "${book.getTitle()}"
printn "${book.title}"

// demo method
def map = createNameAgeMap()
printn "Song's age is ${map['Song']}"
private Map createNameAgeMap() {
	def map = [
		"Tang": 1080,
		"Song": "880",
		"Ming": "660"
	]
	return map
}

// demonstrate GString
def name = 'Da Chui'
def age  = 24
def selfDesc = "My name is $name, and I am $age years old"
printn selfDesc

// demonstrate list
def nameList = ["Qin", "Han", "Jin"]
nameList[5] = "Song"
printn nameList[0]
printn nameList[5]

// demonstrate map
Map mapHans = [
	"Love": "爱",
	"Hate": "恨"
]
printn mapHans["Love"]

// demo ranges
def range = 1..100
assert range.contains(1)
printn "1..100 range size is ${range.size()}"
printn "1..100 is from ${range.from} to ${range.to}"

// demo closure
/*
        1): Closure has usually been associated with functional languages, allowing one piece of code to execute an arbitrary piece of code that has been specified elsewhere.
        2): Informally, a closure can be recognized as a list of statements within braces, like any other code block. It optionally has a list of identifiers to name the 
            parameters passed to it, with an -> marking the end of the list.
	3): The closure has access to the enclosing scope, so it can access enclosing variables.
*/
[1, 2, 3].forEach { entry -> print "$entry, " }; print "\n"
def connections = 0; 1.upto(100) { at -> connections += at - 1 }; printn "Total connection within 100 is $connections"

// demo if
def nameJack = "Jack Williams"
if (nameJack.length() > 10) {
	printn "name is too long"
} else {
	print "good name"
}

// demo while
def number = 3; while (number < 20) { number += 5 }; printn "$number"

// demo for loop
for (i in 1..10) { print "$i, " }; print "\n"
for (dyna in ["Qin", "Han", "Tang", "Song", "Ming"]) { print dyna; print " -> " }; print "\n"

// demo switch
def num = 10
switch (num) {
	case 9:  printn "9 wins";  break
	case 10: printn "10 wins"; break
	default: printn "None wins"
}

/* helper method for printing with line break */
void printn(String text) {
	print "$text\n"
}
