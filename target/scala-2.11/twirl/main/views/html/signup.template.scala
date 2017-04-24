
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.users.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addUsersForm: Form[models.users.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Signup</title>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
    integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
    integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
    <!-- Custom CSS -->
    <link href=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*24.74*/("""" rel="stylesheet"> 

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
    <body>

<style>
#topleft """),format.raw/*37.10*/("""{"""),format.raw/*37.11*/("""
"""),format.raw/*38.1*/("""font-family: 'Robot', Arial;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
"""),format.raw/*40.1*/("""</style>
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
                    <a href=""""),_display_(/*54.31*/routes/*54.37*/.ProductCtrl.index()),format.raw/*54.57*/("""" class="navbar-brand" id="topleft">Computer Store</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                <li ><a href=""""),_display_(/*59.32*/routes/*59.38*/.ProductCtrl.listProducts(0)),format.raw/*59.66*/("""">Home</a></li>
                <li ><a href=""""),_display_(/*60.32*/controllers/*60.43*/.security.routes.LoginCtrl.login()),format.raw/*60.77*/("""">Login</a></li>
                <li><a href=""""),_display_(/*61.31*/routes/*61.37*/.ShoppingCtrl.showBasket()),format.raw/*61.63*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a></li>
      </nav>
      </header>
     <div class="middle">
        <div class="container">
            <div class="row">
                """),_display_(/*67.18*/if(flash.containsKey("success"))/*67.50*/ {_display_(Seq[Any](format.raw/*67.52*/("""
              """),format.raw/*68.15*/("""<div class="alert alert-success">
              """),_display_(/*69.16*/flash/*69.21*/.get("success")),format.raw/*69.36*/("""
              """),format.raw/*70.15*/("""</div>
          """)))}),format.raw/*71.12*/("""
                """),format.raw/*72.17*/("""<div class="col-md-12">
                    <p class="lead">Signup</p>
                <div>
            </div>

         """),_display_(/*77.11*/form(action = routes.ProductCtrl.signupSubmit(), 'class -> "form-horizontal", 'role ->"form")/*77.104*/ {_display_(Seq[Any](format.raw/*77.106*/("""

        """),_display_(/*79.10*/inputText(addUsersForm("name"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Name")),format.raw/*79.114*/("""
        """),_display_(/*80.10*/inputText(addUsersForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*80.116*/("""
        """),_display_(/*81.10*/inputText(addUsersForm("address"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Address")),format.raw/*81.120*/("""
        """),_display_(/*82.10*/inputText(addUsersForm("password"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*82.122*/("""
     
      """),format.raw/*84.7*/("""<div class="actions">
      <input type="submit" value=" Create Account " class="btn btn-primary">
       <a href="">
         <button class="btn btn-warning"> Cancel </button>
       </a>
    </div>          

    <br>
    <br>
    <div class="col-lg-12">
    <footer class="container-default">
        <div class="row">
                    <div class="col-lg-12">
                        <p>Products Catalogue Footer</p>
                    </div>
                </div>
     </footer>
    </div>
        """)))}),format.raw/*102.10*/("""
  
"""),format.raw/*104.1*/("""</div>
   
    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</body>

</html>"""))
      }
    }
  }

  def render(addUsersForm:Form[models.users.User]): play.twirl.api.HtmlFormat.Appendable = apply(addUsersForm)

  def f:((Form[models.users.User]) => play.twirl.api.HtmlFormat.Appendable) = (addUsersForm) => apply(addUsersForm)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 17:47:17 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/OnlineStore/app/views/signup.scala.html
                  HASH: 96530f75489691ec99e352f0311ddf00fc8ae16d
                  MATRIX: 764->1|913->40|941->60|1864->956|1879->962|1950->1012|2437->1471|2466->1472|2495->1474|2552->1504|2580->1505|2609->1507|3433->2304|3448->2310|3489->2330|3853->2667|3868->2673|3917->2701|3992->2749|4012->2760|4067->2794|4142->2842|4157->2848|4204->2874|4438->3081|4479->3113|4519->3115|4563->3131|4640->3181|4654->3186|4690->3201|4734->3217|4784->3236|4830->3254|4985->3382|5088->3475|5129->3477|5169->3490|5295->3594|5333->3605|5461->3711|5499->3722|5631->3832|5669->3843|5803->3955|5845->3970|6403->4496|6437->4502
                  LINES: 27->1|32->1|33->3|54->24|54->24|54->24|67->37|67->37|68->38|69->39|69->39|70->40|84->54|84->54|84->54|89->59|89->59|89->59|90->60|90->60|90->60|91->61|91->61|91->61|97->67|97->67|97->67|98->68|99->69|99->69|99->69|100->70|101->71|102->72|107->77|107->77|107->77|109->79|109->79|110->80|110->80|111->81|111->81|112->82|112->82|114->84|132->102|134->104
                  -- GENERATED --
              */
          