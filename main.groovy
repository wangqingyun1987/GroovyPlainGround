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

/* helper method for printing with line break */
void printn(String text) {
	print "$text\n"
}
