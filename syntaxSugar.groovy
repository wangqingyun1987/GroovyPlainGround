#!Syntax Sugar Collections

/* syntax sugars for Integer */
def sum = 0; 1.upto(10) { entry -> sum += entry }; printn "sum of 1 to 10 is $sum"

/* syntax sugar for list */
["A", "B", "C"].each { entry -> print entry; print " " }; print "\n"

/* handy method for printing with line break */
void printn(String text) {
	print "$text\n"
}
