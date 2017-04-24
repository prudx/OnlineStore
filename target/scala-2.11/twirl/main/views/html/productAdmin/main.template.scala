
package views.html.productAdmin

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

    <!-- Bootstrap Core CSS -->
    <link href=""""),_display_(/*17.18*/routes/*17.24*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*17.74*/("""" rel="stylesheet">

    <!-- Custom CSS -->
    <link href=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*20.74*/("""" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<style>
#topleft """),format.raw/*33.10*/("""{"""),format.raw/*33.11*/("""
"""),format.raw/*34.1*/("""font-family: 'Robot', Arial;
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/("""
"""),format.raw/*36.1*/("""</style>
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
                <a class="navbar-brand" href=""""),_display_(/*48.48*/routes/*48.54*/.AdminProductCtrl.listProducts(0)),format.raw/*48.87*/("""" id="topleft">Mr. Robot</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
					<!-- Login/ logout Link - check if user logged in -->
                    <li>
						"""),_display_(/*55.8*/if(user != null)/*55.24*/ {_display_(Seq[Any](format.raw/*55.26*/("""
						  """),format.raw/*56.9*/("""<a href=""""),_display_(/*56.19*/controllers/*56.30*/.security.routes.LoginCtrl.logout()),format.raw/*56.65*/("""">Logout """),_display_(/*56.75*/user/*56.79*/.getName),format.raw/*56.87*/("""</a>
						""")))}/*57.9*/else/*57.14*/{_display_(Seq[Any](format.raw/*57.15*/("""
                      	  """),format.raw/*58.26*/("""<a href=""""),_display_(/*58.36*/controllers/*58.47*/.security.routes.LoginCtrl.login()),format.raw/*58.81*/("""">Login</a>
						""")))}),format.raw/*59.8*/("""
                    """),format.raw/*60.21*/("""</li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">
			<div class="row">

				<div class="col-md-12">
						<p class="lead">Products Catalogue</p>
				<div>
			</div>

			<!-- Start Content -->
			"""),_display_(/*78.5*/content),format.raw/*78.12*/("""
			"""),format.raw/*79.4*/("""<!-- End Content -->

    </div>
    <!-- /.container -->

    <div class="container">

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Products Catalogue Footer</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src=""""),_display_(/*101.19*/routes/*101.25*/.Assets.versioned("javascripts/jquery.js")),format.raw/*101.67*/(""""></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*104.19*/routes/*104.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*104.74*/(""""></script>

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
                  DATE: Mon Apr 24 20:39:46 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/app/views/productAdmin/main.scala.html
                  HASH: 3c11429a37fed3dd15d269ba5ab3bd3017ce09bc
                  MATRIX: 779->1|929->56|957->58|1294->368|1320->373|1406->432|1421->438|1492->488|1581->550|1596->556|1667->606|2136->1047|2165->1048|2193->1049|2249->1078|2277->1079|2305->1080|3009->1757|3024->1763|3078->1796|3454->2146|3479->2162|3519->2164|3555->2173|3592->2183|3612->2194|3668->2229|3705->2239|3718->2243|3747->2251|3777->2264|3790->2269|3829->2270|3883->2296|3920->2306|3940->2317|3995->2351|4044->2370|4093->2391|4461->2733|4489->2740|4520->2744|4950->3146|4966->3152|5030->3194|5128->3264|5144->3270|5215->3319
                  LINES: 27->1|32->1|34->3|45->14|45->14|48->17|48->17|48->17|51->20|51->20|51->20|64->33|64->33|65->34|66->35|66->35|67->36|79->48|79->48|79->48|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|91->60|109->78|109->78|110->79|132->101|132->101|132->101|135->104|135->104|135->104
                  -- GENERATED --
              */
          