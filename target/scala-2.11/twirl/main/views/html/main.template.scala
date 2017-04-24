
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

    <title>Product Catalogue - """),_display_(/*14.33*/title),format.raw/*14.38*/("""</title>
    
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
    <header class="top" role="header">
        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*55.52*/routes/*55.58*/.ProductCtrl.index()),format.raw/*55.78*/("""" id="topleft">Computer Store</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href=""""),_display_(/*61.39*/routes/*61.45*/.ProductCtrl.about()),format.raw/*61.65*/("""">About</a>
                        </li>
                        <li>
                            <a href="#">Services</a>
                        </li>
                        <li>
                            <a href="#">Contact</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*70.39*/routes/*70.45*/.ProductCtrl.listProducts(0)),format.raw/*70.73*/("""">Products</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*73.39*/controllers/*73.50*/.routes.ProductCtrl.signup()),format.raw/*73.78*/("""">Signup</a>
                        </li>
                                            <!-- Login/ logout Link - check if user logged in -->
                        <li>
                            """),_display_(/*77.30*/if(user != null)/*77.46*/ {_display_(Seq[Any](format.raw/*77.48*/("""
                                """),format.raw/*78.33*/("""<a href=""""),_display_(/*78.43*/controllers/*78.54*/.security.routes.LoginCtrl.logout()),format.raw/*78.89*/("""">Logout """),_display_(/*78.99*/user/*78.103*/.getName()),format.raw/*78.113*/("""</a>
                            """)))}/*79.31*/else/*79.36*/{_display_(Seq[Any](format.raw/*79.37*/("""
                                """),format.raw/*80.33*/("""<a href=""""),_display_(/*80.43*/controllers/*80.54*/.security.routes.LoginCtrl.login()),format.raw/*80.88*/("""">Login</a>
                            """)))}),format.raw/*81.30*/("""
                        """),format.raw/*82.25*/("""</li>
                        <li>
                            <a href=""""),_display_(/*84.39*/routes/*84.45*/.ShoppingCtrl.showBasket()),format.raw/*84.71*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>
    </header>

    <!-- Page Content -->
    <div class="middle">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="lead">"""),_display_(/*99.38*/title),format.raw/*99.43*/("""</p>
                <div>
            </div>

            <!-- Start Content -->
            """),_display_(/*104.14*/content),format.raw/*104.21*/("""
            """),format.raw/*105.13*/("""<!-- End Content -->

        </div>
        <!-- /.container -->
    </div>

    <!-- Footer -->
    <div class="bottom">
        <div class="container">
            <hr>
            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <p>Mr.Robot computing</p>
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
                  DATE: Mon Apr 24 17:55:19 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/OnlineStore/app/views/main.scala.html
                  HASH: 71b2df70d77564eaf92c4a054139820c9ef50a7e
                  MATRIX: 766->1|916->56|944->58|1281->368|1307->373|1911->950|1926->956|1997->1006|2467->1448|2496->1449|2524->1450|2580->1479|2608->1480|2636->1481|3467->2285|3482->2291|3523->2311|3897->2658|3912->2664|3953->2684|4312->3016|4327->3022|4376->3050|4515->3162|4535->3173|4584->3201|4810->3400|4835->3416|4875->3418|4936->3451|4973->3461|4993->3472|5049->3507|5086->3517|5100->3521|5132->3531|5185->3566|5198->3571|5237->3572|5298->3605|5335->3615|5355->3626|5410->3660|5482->3701|5535->3726|5635->3799|5650->3805|5697->3831|6180->4287|6206->4292|6329->4387|6358->4394|6400->4407
                  LINES: 27->1|32->1|34->3|45->14|45->14|56->25|56->25|56->25|69->38|69->38|70->39|71->40|71->40|72->41|86->55|86->55|86->55|92->61|92->61|92->61|101->70|101->70|101->70|104->73|104->73|104->73|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|113->82|115->84|115->84|115->84|130->99|130->99|135->104|135->104|136->105
                  -- GENERATED --
              */
          