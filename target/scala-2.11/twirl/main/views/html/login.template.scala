
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
	"""),format.raw/*4.2*/("""<div class="container">
<div class="col-xs-4">
  <h3>Sign in</h3>
	<!-- Display login errors if they exist -->
	"""),_display_(/*8.3*/if(form.hasGlobalErrors)/*8.27*/ {_display_(Seq[Any](format.raw/*8.29*/("""
		  """),format.raw/*9.5*/("""<p class="alert alert-warning">
		      """),_display_(/*10.10*/form/*10.14*/.globalError.message),format.raw/*10.34*/("""
		  """),format.raw/*11.5*/("""</p>
	""")))}),format.raw/*12.3*/("""
    """),_display_(/*13.6*/if(flash.containsKey("error"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
		  """),format.raw/*14.5*/("""<div class="alert alert-warning">
		      """),_display_(/*15.10*/flash/*15.15*/.get("loginRequired")),format.raw/*15.36*/("""
		  """),format.raw/*16.5*/("""</div>
	""")))}),format.raw/*17.3*/("""
	"""),format.raw/*18.2*/("""<!-- The login form -->
	"""),_display_(/*19.3*/helper/*19.9*/.form(action = controllers.security.routes.LoginCtrl.loginSubmit())/*19.76*/ {_display_(Seq[Any](format.raw/*19.78*/("""

    """),format.raw/*21.5*/("""<div class="form-group">
        <input type="text" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*22.99*/form("email")/*22.112*/.value),format.raw/*22.118*/("""">
    </div>
    <div class="form-group">
        <input type="password" name="password" class="form-control input-xs" placeholder="Password">
    </div>

		<!-- Add a submit button -->
		<div class="form-group">
		    <input type="submit" value="Sign In" class="btn btn-primary">
		</div>
		""")))}),format.raw/*32.4*/("""
"""),format.raw/*33.1*/("""</div>
</div>
""")))}),format.raw/*35.2*/("""
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
                  DATE: Mon Apr 24 19:58:02 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/app/views/login.scala.html
                  HASH: 22297488f6ac0a7b25503797a2e1bfdc9b6f4b19
                  MATRIX: 781->1|933->58|961->61|983->75|1022->77|1050->79|1188->192|1220->216|1259->218|1290->223|1358->264|1371->268|1412->288|1444->293|1481->300|1513->306|1552->336|1592->338|1624->343|1694->386|1708->391|1750->412|1782->417|1821->426|1850->428|1902->454|1916->460|1992->527|2032->529|2065->535|2215->658|2238->671|2266->677|2590->971|2618->972|2663->987
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|50->19|50->19|50->19|50->19|52->21|53->22|53->22|53->22|63->32|64->33|66->35
                  -- GENERATED --
              */
          