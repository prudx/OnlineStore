
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/OnlineStore/Enda clone/playlab_shoppingwithsearch/conf/routes
// @DATE:Mon Apr 24 15:57:07 IST 2017


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
