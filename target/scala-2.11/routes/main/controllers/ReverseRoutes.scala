
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/OnlineStore/Enda clone/playlab_shoppingwithsearch/conf/routes
// @DATE:Mon Apr 24 15:57:07 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:22
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def addOne(itemId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + implicitly[PathBindable[Long]].unbind("itemId", itemId))
    }
  
    // @LINE:23
    def addToBasket(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:28
    def viewOrder(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:27
    def placeOrder(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:25
    def removeOne(itemId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + implicitly[PathBindable[Long]].unbind("itemId", itemId))
    }
  
    // @LINE:22
    def showBasket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:26
    def emptyBasket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }

  // @LINE:31
  class ReverseAdminProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def addProductSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addProductSubmit")
    }
  
    // @LINE:33
    def listProducts(cat:Long): Call = {
    
      (cat: @unchecked) match {
      
        // @LINE:33
        case (cat) if cat == 0 =>
          implicit val _rrc = new ReverseRouteContext(Map(("cat", 0)))
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listProducts")
      
        // @LINE:34
        case (cat)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listProducts/" + implicitly[PathBindable[Long]].unbind("cat", cat))
      
      }
    
    }
  
    // @LINE:42
    def deleteProduct(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/delProduct/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:39
    def updateProduct(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateProduct/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:36
    def addProduct(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addProduct")
    }
  
    // @LINE:40
    def updateProductSubmit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateProductSubmit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:31
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin")
    }
  
  }

  // @LINE:46
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def signupSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signupSubmit")
    }
  
    // @LINE:17
    def signup(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:7
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def listProducts(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listProducts" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }


}
