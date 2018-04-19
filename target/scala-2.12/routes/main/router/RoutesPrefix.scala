
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Downloads/Project3-my_new_branch/conf/routes
// @DATE:Thu Apr 19 13:28:20 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
