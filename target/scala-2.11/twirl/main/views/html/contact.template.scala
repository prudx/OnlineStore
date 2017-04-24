
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
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

     object contact_Scope1 {
import models.products.Category
import models.products.Product
import models.users.User

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.api.Environment,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.41*/("""
"""),_display_(/*5.2*/main("", user)/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""
    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
    <div class="row">
	<!--    Return Policy
  ================================================== ---->
        <div class="jumbotron return" id="4">
            <div class="container center">
                <h1>Shipping &amp; Returns</h1>
                <h2>Satisfaction Assured</h2>
                <p class="breathingroom">Your satisfaction is our success. If you wish to return or exchange any item please advise us within 7 days of receipt. Items must not have been used or damaged in anyway. You will be responsible for the cost of postage/courier for returned goods unless the original item was shipped in error.</p>
                <h2>How to return an item</h2>
                <p class="breathingroom">Please re-package your item carefully so that it returns to us undamaged. You will be responsible for the package until we receive it so please make sure your item is insured and/or able to be traced. We recommend using an insured postage/courier method as we can not accept responsibility for items not shipped by ourselves.</p>
                <h2>Faulty Items</h2>
                <p class="breathingroom">Our products are designed to last and last. If your item fails to exceed your expectation please contact us at
                    INSERT EMAIL.</p>
                <h2>Returns Shipping Address</h2>
                <p>
                    <strong>Found My Animal</strong>
                    <br>630 Flushing Avenue
                    <br>6th Floor
                    <br>Brooklyn NY, 11206</p>
                <p class="breathingroom"><strong>Any item purchased from one of our retailers must be returned to that retailer.</strong></p>
                <p class="breathingroom"></p>
                <h2>Having trouble ordering online?</h2>
                <p>
                    <a href="contact.html#0">Write us a message or reach us by phone</a>!</p>
            </div>
        </div>
    </div>
""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,user)

  def f:((play.api.Environment,User) => play.twirl.api.HtmlFormat.Appendable) = (env,user) => apply(env,user)

  def ref: this.type = this

}


}
}

/**/
object contact extends contact_Scope0.contact_Scope1.contact
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 19:25:06 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/app/views/contact.scala.html
                  HASH: bda80f50eda2ab637ddb86392a854b21d9011ef8
                  MATRIX: 886->92|1020->131|1047->133|1069->147|1108->149|1139->154|3135->2120
                  LINES: 32->4|37->4|38->5|38->5|38->5|39->6|67->34
                  -- GENERATED --
              */
          