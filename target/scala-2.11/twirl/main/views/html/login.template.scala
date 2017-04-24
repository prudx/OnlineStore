
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("", user)/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
"""),format.raw/*4.1*/("""<div class="col-xs-4">
  <h3>Sign in</h3>
	<!-- Display login errors if they exist -->
	"""),_display_(/*7.3*/if(form.hasGlobalErrors)/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""
		  """),format.raw/*8.5*/("""<p class="alert alert-warning">
		      """),_display_(/*9.10*/form/*9.14*/.globalError.message),format.raw/*9.34*/("""
		  """),format.raw/*10.5*/("""</p>
	""")))}),format.raw/*11.3*/("""
    """),_display_(/*12.6*/if(flash.containsKey("error"))/*12.36*/ {_display_(Seq[Any](format.raw/*12.38*/("""
		  """),format.raw/*13.5*/("""<div class="alert alert-warning">
		      """),_display_(/*14.10*/flash/*14.15*/.get("loginRequired")),format.raw/*14.36*/("""
		  """),format.raw/*15.5*/("""</div>
	""")))}),format.raw/*16.3*/("""
	"""),format.raw/*17.2*/("""<!-- The login form -->
	"""),_display_(/*18.3*/helper/*18.9*/.form(action = controllers.security.routes.LoginCtrl.loginSubmit())/*18.76*/ {_display_(Seq[Any](format.raw/*18.78*/("""

    """),format.raw/*20.5*/("""<div class="form-group">
        <input type="text" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*21.99*/form("email")/*21.112*/.value),format.raw/*21.118*/("""">
    </div>
    <div class="form-group">
        <input type="password" name="password" class="form-control input-xs" placeholder="Password">
    </div>

		<!-- Add a submit button -->
		<div class="form-group">
		    <input type="submit" value="Sign In" class="btn btn-primary">
		</div>
		""")))}),format.raw/*31.4*/("""
"""),format.raw/*32.1*/("""</div>
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(form:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(form,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (form,user) => apply(form,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 17:59:01 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/OnlineStore/app/views/login.scala.html
                  HASH: a570e631424725a458153d7352c9ec1b92738465
                  MATRIX: 781->1|933->58|961->61|983->75|1022->77|1049->78|1163->167|1195->191|1234->193|1265->198|1332->239|1344->243|1384->263|1416->268|1453->275|1485->281|1524->311|1564->313|1596->318|1666->361|1680->366|1722->387|1754->392|1793->401|1822->403|1874->429|1888->435|1964->502|2004->504|2037->510|2187->633|2210->646|2238->652|2562->946|2590->947|2628->955
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|48->17|49->18|49->18|49->18|49->18|51->20|52->21|52->21|52->21|62->31|63->32|64->33
                  -- GENERATED --
              */
          