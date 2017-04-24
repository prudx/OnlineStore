
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
                    <a class="navbar-brand" href=""""),_display_(/*50.52*/routes/*50.58*/.ProductCtrl.listProducts(0)),format.raw/*50.86*/("""">Computer Store</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="#">About</a>
                        </li>
                        <li>
                            <a href="#">Services</a>
                        </li>
                        <li>
                            <a href="#">Contact</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*65.39*/controllers/*65.50*/.routes.ProductCtrl.signup()),format.raw/*65.78*/("""">Signup</a>
                        </li>
                                            <!-- Login/ logout Link - check if user logged in -->
                        <li>
                            """),_display_(/*69.30*/if(user != null)/*69.46*/ {_display_(Seq[Any](format.raw/*69.48*/("""
                                """),format.raw/*70.33*/("""<a href=""""),_display_(/*70.43*/controllers/*70.54*/.security.routes.LoginCtrl.logout()),format.raw/*70.89*/("""">Logout """),_display_(/*70.99*/user/*70.103*/.getName()),format.raw/*70.113*/("""</a>
                            """)))}/*71.31*/else/*71.36*/{_display_(Seq[Any](format.raw/*71.37*/("""
                                """),format.raw/*72.33*/("""<a href=""""),_display_(/*72.43*/controllers/*72.54*/.security.routes.LoginCtrl.login()),format.raw/*72.88*/("""">Login</a>
                            """)))}),format.raw/*73.30*/("""
                        """),format.raw/*74.25*/("""</li>
                        <li>
                            <a href=""""),_display_(/*76.39*/routes/*76.45*/.ShoppingCtrl.showBasket()),format.raw/*76.71*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
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
                    <p class="lead">"""),_display_(/*91.38*/title),format.raw/*91.43*/("""</p>
                <div>
            </div>

            <!-- Start Content -->
            """),_display_(/*96.14*/content),format.raw/*96.21*/("""
            """),format.raw/*97.13*/("""<!-- End Content -->

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
                        <p>Products Catalogue Footer</p>
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
                  DATE: Mon Apr 24 16:05:55 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/Enda clone/playlab_shoppingwithsearch/app/views/main.scala.html
                  HASH: 560cd3151d470bab4780b845aaeb4b0719d94f56
                  MATRIX: 766->1|916->56|944->58|1281->368|1307->373|1911->950|1926->956|1997->1006|3244->2226|3259->2232|3308->2260|4001->2926|4021->2937|4070->2965|4296->3164|4321->3180|4361->3182|4422->3215|4459->3225|4479->3236|4535->3271|4572->3281|4586->3285|4618->3295|4671->3330|4684->3335|4723->3336|4784->3369|4821->3379|4841->3390|4896->3424|4968->3465|5021->3490|5121->3563|5136->3569|5183->3595|5666->4051|5692->4056|5814->4151|5842->4158|5883->4171
                  LINES: 27->1|32->1|34->3|45->14|45->14|56->25|56->25|56->25|81->50|81->50|81->50|96->65|96->65|96->65|100->69|100->69|100->69|101->70|101->70|101->70|101->70|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|103->72|104->73|105->74|107->76|107->76|107->76|122->91|122->91|127->96|127->96|128->97
                  -- GENERATED --
              */
          