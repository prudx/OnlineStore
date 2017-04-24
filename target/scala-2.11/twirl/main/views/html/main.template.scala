
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>"""),_display_(/*14.13*/title),format.raw/*14.18*/("""</title>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
    integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
    integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
    <!-- Custom CSS -->
    <link href=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*25.74*/("""" rel="stylesheet"> 

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<style>
#topleft """),format.raw/*38.10*/("""{"""),format.raw/*38.11*/("""
"""),format.raw/*39.1*/("""font-family: 'Robot', Arial;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""
"""),format.raw/*41.1*/("""</style>
    <!-- Site header and navigation -->
    
        <!-- Navigation -->
        <div class="container">
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*56.52*/routes/*56.58*/.ProductCtrl.index()),format.raw/*56.78*/("""" id="topleft">Mr. Robot</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href=""""),_display_(/*62.39*/routes/*62.45*/.ProductCtrl.about()),format.raw/*62.65*/("""">About</a>
                        </li>
                        <li>
                            <a href="#">Contact</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*68.39*/routes/*68.45*/.ProductCtrl.listProducts(0)),format.raw/*68.73*/("""">Products</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*71.39*/controllers/*71.50*/.routes.ProductCtrl.signup()),format.raw/*71.78*/("""">Signup</a>
                        </li>
                                            <!-- Login/ logout Link - check if user logged in -->
                        <li>
                            """),_display_(/*75.30*/if(user != null)/*75.46*/ {_display_(Seq[Any](format.raw/*75.48*/("""
                                """),format.raw/*76.33*/("""<a href=""""),_display_(/*76.43*/controllers/*76.54*/.security.routes.LoginCtrl.logout()),format.raw/*76.89*/("""">Logout """),_display_(/*76.99*/user/*76.103*/.getName()),format.raw/*76.113*/("""</a>
                            """)))}/*77.31*/else/*77.36*/{_display_(Seq[Any](format.raw/*77.37*/("""
                                """),format.raw/*78.33*/("""<a href=""""),_display_(/*78.43*/controllers/*78.54*/.security.routes.LoginCtrl.login()),format.raw/*78.88*/("""">Login</a>
                            """)))}),format.raw/*79.30*/("""
                        """),format.raw/*80.25*/("""</li>
                        <li>
                            <a href=""""),_display_(/*82.39*/routes/*82.45*/.ShoppingCtrl.showBasket()),format.raw/*82.71*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            <!-- /.container -->
        </nav>
        </div>


    <!-- Page Content -->

            <!-- Start Content -->
            """),_display_(/*95.14*/content),format.raw/*95.21*/("""
            """),format.raw/*96.13*/("""<!-- End Content -->


        <!-- /.container -->
    </div>

    <!-- Footer -->
    <div class="bottom">
        <div class="container">
            <hr>
            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <p>Mr. Robot® computers</p>
                    </div>
                </div>
            </footer>
        </div>
    <!-- /.container -->
    </div>

    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 20:23:34 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/app/views/main.scala.html
                  HASH: 2d28701c81e2dba52dc576bd68f2d8eb3ca75165
                  MATRIX: 766->1|916->56|944->58|1261->348|1287->353|1891->930|1906->936|1977->986|2447->1428|2476->1429|2504->1430|2560->1459|2588->1460|2616->1461|3422->2240|3437->2246|3478->2266|3847->2608|3862->2614|3903->2634|4150->2854|4165->2860|4214->2888|4353->3000|4373->3011|4422->3039|4648->3238|4673->3254|4713->3256|4774->3289|4811->3299|4831->3310|4887->3345|4924->3355|4938->3359|4970->3369|5023->3404|5036->3409|5075->3410|5136->3443|5173->3453|5193->3464|5248->3498|5320->3539|5373->3564|5473->3637|5488->3643|5535->3669|5886->3993|5914->4000|5955->4013
                  LINES: 27->1|32->1|34->3|45->14|45->14|56->25|56->25|56->25|69->38|69->38|70->39|71->40|71->40|72->41|87->56|87->56|87->56|93->62|93->62|93->62|99->68|99->68|99->68|102->71|102->71|102->71|106->75|106->75|106->75|107->76|107->76|107->76|107->76|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|109->78|110->79|111->80|113->82|113->82|113->82|126->95|126->95|127->96
                  -- GENERATED --
              */
          