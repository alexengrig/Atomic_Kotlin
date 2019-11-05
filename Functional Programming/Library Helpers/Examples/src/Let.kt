// LibraryHelpers/Let.kt
package libraryhelpers

fun showGreetingWindow2(
  windowById: Map<String, Window>
) {
  windowById["greeting"]?.let {
    showWindow(it)
  }
}

fun main(args: Array<String>) {
  showGreetingWindow2(mapOf(
    "greeting" to Window("greeting")))
  println("no Window:")
  showGreetingWindow2(mapOf())
}
/* Output:
Showing greeting window...
Window(id=greeting, x=0, y=0, w=200, h=100)
no Window:
*/