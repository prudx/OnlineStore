
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
                    <a class="navbar-brand">Computer Store</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                <li ><a href=""""),_display_(/*53.32*/routes/*53.38*/.ProductCtrl.listProducts(0)),format.raw/*53.66*/("""">Home</a></li>
                <li ><a href=""""),_display_(/*54.32*/controllers/*54.43*/.security.routes.LoginCtrl.login()),format.raw/*54.77*/("""">Login</a></li>
                <li><a href=""""),_display_(/*55.31*/routes/*55.37*/.ShoppingCtrl.showBasket()),format.raw/*55.63*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a></li>
      </nav>
      </header>
     <div class="middle">
        <div class="container">
            <div class="row">
                """),_display_(/*61.18*/if(flash.containsKey("success"))/*61.50*/ {_display_(Seq[Any](format.raw/*61.52*/("""
              """),format.raw/*62.15*/("""<div class="alert alert-success">
              """),_display_(/*63.16*/flash/*63.21*/.get("success")),format.raw/*63.36*/("""
              """),format.raw/*64.15*/("""</div>
          """)))}),format.raw/*65.12*/("""
                """),format.raw/*66.17*/("""<div class="col-md-12">
                    <p class="lead">Signup</p>
                <div>
            </div>

         """),_display_(/*71.11*/form(action = routes.ProductCtrl.signupSubmit(), 'class -> "form-horizontal", 'role ->"form")/*71.104*/ {_display_(Seq[Any](format.raw/*71.106*/("""

        """),_display_(/*73.10*/inputText(addUsersForm("name"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Name")),format.raw/*73.114*/("""
        """),_display_(/*74.10*/inputText(addUsersForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*74.116*/("""
        """),_display_(/*75.10*/inputText(addUsersForm("address"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Address")),format.raw/*75.120*/("""
        """),_display_(/*76.10*/inputText(addUsersForm("password"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*76.122*/("""
     
      """),format.raw/*78.7*/("""<div class="actions">
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
        """)))}),format.raw/*96.10*/("""
  
"""),format.raw/*98.1*/("""</div>
   
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
                  DATE: Mon Apr 24 16:06:25 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/Enda clone/playlab_shoppingwithsearch/app/views/signup.scala.html
                  HASH: 0d4e3075584a2fd1b88f6b10ef00017493a53d95
                  MATRIX: 764->1|913->40|941->60|1864->956|1879->962|1950->1012|3518->2553|3533->2559|3582->2587|3657->2635|3677->2646|3732->2680|3807->2728|3822->2734|3869->2760|4103->2967|4144->2999|4184->3001|4228->3017|4305->3067|4319->3072|4355->3087|4399->3103|4449->3122|4495->3140|4650->3268|4753->3361|4794->3363|4834->3376|4960->3480|4998->3491|5126->3597|5164->3608|5296->3718|5334->3729|5468->3841|5510->3856|6067->4382|6100->4388
                  LINES: 27->1|32->1|33->3|54->24|54->24|54->24|83->53|83->53|83->53|84->54|84->54|84->54|85->55|85->55|85->55|91->61|91->61|91->61|92->62|93->63|93->63|93->63|94->64|95->65|96->66|101->71|101->71|101->71|103->73|103->73|104->74|104->74|105->75|105->75|106->76|106->76|108->78|126->96|128->98
                  -- GENERATED --
              */
          