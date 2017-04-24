
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/OnlineStore/OnlineStore/conf/routes
// @DATE:Mon Apr 24 17:14:43 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  ProductCtrl_0: controllers.ProductCtrl,
  // @LINE:14
  LoginCtrl_3: controllers.security.LoginCtrl,
  // @LINE:23
  ShoppingCtrl_1: controllers.ShoppingCtrl,
  // @LINE:32
  AdminProductCtrl_2: controllers.AdminProductCtrl,
  // @LINE:47
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    ProductCtrl_0: controllers.ProductCtrl,
    // @LINE:14
    LoginCtrl_3: controllers.security.LoginCtrl,
    // @LINE:23
    ShoppingCtrl_1: controllers.ShoppingCtrl,
    // @LINE:32
    AdminProductCtrl_2: controllers.AdminProductCtrl,
    // @LINE:47
    Assets_4: controllers.Assets
  ) = this(errorHandler, ProductCtrl_0, LoginCtrl_3, ShoppingCtrl_1, AdminProductCtrl_2, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductCtrl_0, LoginCtrl_3, ShoppingCtrl_1, AdminProductCtrl_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductCtrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.ProductCtrl.about()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProducts""", """controllers.ProductCtrl.listProducts(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.loginSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginCtrl.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.ProductCtrl.signup()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signupSubmit""", """controllers.ProductCtrl.signupSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin""", """controllers.AdminProductCtrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProducts""", """controllers.AdminProductCtrl.listProducts(cat:Long = 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProducts/""" + "$" + """cat<[^/]+>""", """controllers.AdminProductCtrl.listProducts(cat:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProduct""", """controllers.AdminProductCtrl.addProduct()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProductSubmit""", """controllers.AdminProductCtrl.addProductSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_ProductCtrl_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductCtrl_index0_invoker = createInvoker(
    ProductCtrl_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "index",
      Nil,
      "GET",
      """ https://www.playframework.com/documentation/2.5.1/JavaRouting
 Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductCtrl_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_ProductCtrl_about1_invoker = createInvoker(
    ProductCtrl_0.about(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProductCtrl_listProducts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProducts")))
  )
  private[this] lazy val controllers_ProductCtrl_listProducts2_invoker = createInvoker(
    ProductCtrl_0.listProducts(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "listProducts",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """ Show a list of products - note optional parameter""",
      this.prefix + """listProducts"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_security_LoginCtrl_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_login3_invoker = createInvoker(
    LoginCtrl_3.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "login",
      Nil,
      "GET",
      """ Login form""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit4_invoker = createInvoker(
    LoginCtrl_3.loginSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_security_LoginCtrl_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginCtrl_logout5_invoker = createInvoker(
    LoginCtrl_3.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ProductCtrl_signup6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_ProductCtrl_signup6_invoker = createInvoker(
    ProductCtrl_0.signup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ProductCtrl_signupSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signupSubmit")))
  )
  private[this] lazy val controllers_ProductCtrl_signupSubmit7_invoker = createInvoker(
    ProductCtrl_0.signupSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "signupSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """signupSubmit"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ShoppingCtrl_showBasket8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket8_invoker = createInvoker(
    ShoppingCtrl_1.showBasket(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      """ Shopping""",
      this.prefix + """showBasket"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ShoppingCtrl_addToBasket9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket9_invoker = createInvoker(
    ShoppingCtrl_1.addToBasket(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ShoppingCtrl_addOne10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne10_invoker = createInvoker(
    ShoppingCtrl_1.addOne(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_invoker = createInvoker(
    ShoppingCtrl_1.removeOne(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket12_invoker = createInvoker(
    ShoppingCtrl_1.emptyBasket(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      """""",
      this.prefix + """emptyBasket"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ShoppingCtrl_placeOrder13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder13_invoker = createInvoker(
    ShoppingCtrl_1.placeOrder(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      """""",
      this.prefix + """placeOrder"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ShoppingCtrl_viewOrder14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder14_invoker = createInvoker(
    ShoppingCtrl_1.viewOrder(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_AdminProductCtrl_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin")))
  )
  private[this] lazy val controllers_AdminProductCtrl_index15_invoker = createInvoker(
    AdminProductCtrl_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "index",
      Nil,
      "GET",
      """ Product Administration""",
      this.prefix + """Admin"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_AdminProductCtrl_listProducts16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProducts")))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProducts16_invoker = createInvoker(
    AdminProductCtrl_2.listProducts(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProducts",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/listProducts"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_AdminProductCtrl_listProducts17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProducts/"), DynamicPart("cat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProducts17_invoker = createInvoker(
    AdminProductCtrl_2.listProducts(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProducts",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/listProducts/""" + "$" + """cat<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_AdminProductCtrl_addProduct18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct18_invoker = createInvoker(
    AdminProductCtrl_2.addProduct(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProduct",
      Nil,
      "GET",
      """""",
      this.prefix + """Admin/addProduct"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit19_invoker = createInvoker(
    AdminProductCtrl_2.addProductSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProductSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """Admin/addProductSubmit"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_AdminProductCtrl_updateProduct20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct20_invoker = createInvoker(
    AdminProductCtrl_2.updateProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/updateProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit21_invoker = createInvoker(
    AdminProductCtrl_2.updateProductSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct22_invoker = createInvoker(
    AdminProductCtrl_2.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Assets_versioned23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned23_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_ProductCtrl_index0_route(params) =>
      call { 
        controllers_ProductCtrl_index0_invoker.call(ProductCtrl_0.index())
      }
  
    // @LINE:8
    case controllers_ProductCtrl_about1_route(params) =>
      call { 
        controllers_ProductCtrl_about1_invoker.call(ProductCtrl_0.about())
      }
  
    // @LINE:11
    case controllers_ProductCtrl_listProducts2_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ProductCtrl_listProducts2_invoker.call(ProductCtrl_0.listProducts(cat, filter))
      }
  
    // @LINE:14
    case controllers_security_LoginCtrl_login3_route(params) =>
      call { 
        controllers_security_LoginCtrl_login3_invoker.call(LoginCtrl_3.login())
      }
  
    // @LINE:15
    case controllers_security_LoginCtrl_loginSubmit4_route(params) =>
      call { 
        controllers_security_LoginCtrl_loginSubmit4_invoker.call(LoginCtrl_3.loginSubmit())
      }
  
    // @LINE:16
    case controllers_security_LoginCtrl_logout5_route(params) =>
      call { 
        controllers_security_LoginCtrl_logout5_invoker.call(LoginCtrl_3.logout())
      }
  
    // @LINE:18
    case controllers_ProductCtrl_signup6_route(params) =>
      call { 
        controllers_ProductCtrl_signup6_invoker.call(ProductCtrl_0.signup())
      }
  
    // @LINE:19
    case controllers_ProductCtrl_signupSubmit7_route(params) =>
      call { 
        controllers_ProductCtrl_signupSubmit7_invoker.call(ProductCtrl_0.signupSubmit())
      }
  
    // @LINE:23
    case controllers_ShoppingCtrl_showBasket8_route(params) =>
      call { 
        controllers_ShoppingCtrl_showBasket8_invoker.call(ShoppingCtrl_1.showBasket())
      }
  
    // @LINE:24
    case controllers_ShoppingCtrl_addToBasket9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket9_invoker.call(ShoppingCtrl_1.addToBasket(id))
      }
  
    // @LINE:25
    case controllers_ShoppingCtrl_addOne10_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne10_invoker.call(ShoppingCtrl_1.addOne(itemId))
      }
  
    // @LINE:26
    case controllers_ShoppingCtrl_removeOne11_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne11_invoker.call(ShoppingCtrl_1.removeOne(itemId))
      }
  
    // @LINE:27
    case controllers_ShoppingCtrl_emptyBasket12_route(params) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket12_invoker.call(ShoppingCtrl_1.emptyBasket())
      }
  
    // @LINE:28
    case controllers_ShoppingCtrl_placeOrder13_route(params) =>
      call { 
        controllers_ShoppingCtrl_placeOrder13_invoker.call(ShoppingCtrl_1.placeOrder())
      }
  
    // @LINE:29
    case controllers_ShoppingCtrl_viewOrder14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder14_invoker.call(ShoppingCtrl_1.viewOrder(id))
      }
  
    // @LINE:32
    case controllers_AdminProductCtrl_index15_route(params) =>
      call { 
        controllers_AdminProductCtrl_index15_invoker.call(AdminProductCtrl_2.index())
      }
  
    // @LINE:34
    case controllers_AdminProductCtrl_listProducts16_route(params) =>
      call(Param[Long]("cat", Right(0))) { (cat) =>
        controllers_AdminProductCtrl_listProducts16_invoker.call(AdminProductCtrl_2.listProducts(cat))
      }
  
    // @LINE:35
    case controllers_AdminProductCtrl_listProducts17_route(params) =>
      call(params.fromPath[Long]("cat", None)) { (cat) =>
        controllers_AdminProductCtrl_listProducts17_invoker.call(AdminProductCtrl_2.listProducts(cat))
      }
  
    // @LINE:37
    case controllers_AdminProductCtrl_addProduct18_route(params) =>
      call { 
        controllers_AdminProductCtrl_addProduct18_invoker.call(AdminProductCtrl_2.addProduct())
      }
  
    // @LINE:38
    case controllers_AdminProductCtrl_addProductSubmit19_route(params) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit19_invoker.call(AdminProductCtrl_2.addProductSubmit())
      }
  
    // @LINE:40
    case controllers_AdminProductCtrl_updateProduct20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct20_invoker.call(AdminProductCtrl_2.updateProduct(id))
      }
  
    // @LINE:41
    case controllers_AdminProductCtrl_updateProductSubmit21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit21_invoker.call(AdminProductCtrl_2.updateProductSubmit(id))
      }
  
    // @LINE:43
    case controllers_AdminProductCtrl_deleteProduct22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct22_invoker.call(AdminProductCtrl_2.deleteProduct(id))
      }
  
    // @LINE:47
    case controllers_Assets_versioned23_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned23_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
