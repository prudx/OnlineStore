
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

     object about_Scope1 {
import models.products.Category
import models.products.Product
import models.users.User

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.api.Environment,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.41*/("""
"""),_display_(/*5.2*/main("", user)/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""
    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-46249700-1']);
  _gaq.push(['_trackPageview']);

  (function() """),format.raw/*13.15*/("""{"""),format.raw/*13.16*/("""
    """),format.raw/*14.5*/("""var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  """),format.raw/*17.3*/("""}"""),format.raw/*17.4*/(""")();

</script>

    <div class="row">
	<div class="page-contents">
        <!-- About us ---->
        <div class="jumbotron about" id="0">
            <div class="container center">
                <div class="row">
                    <div class="col-sm-5">
                        <h1>About Us</h1>
                        <p>Inspired by a software engineer for a father whilst my brother and I grew up in the mid 70's. Spending time together on our fathers computer during our teenage years quickly revealed our passion for electronics and software. We decided to become partners after we both graduated from MIT with degrees in computer software engineering.</p> 
                        <p>We opened our first store in our hometown, Brooklyn NY, in 1984. So many people came to our store in the years following, building long lasting friendships with ourselves and our small staff team. We were always putting the customer first making sure to provide the best possible prices for our trusting customers and that is what the <a id="topleft">MR.ROBOT</a> brand is built upon</p>
                    </div>
                    <div class="clearfix visible-xs"></div>
                    <div class="col-sm-7 col-sm-push-1 col-xs-12">
                        <img src=""""),_display_(/*34.36*/routes/*34.42*/.Assets.versioned("images/oldmac.jpg")),format.raw/*34.80*/("""" class="img-responsive" id="oldmac">
                    </div>
                    <div class="breathingroom visible-xs"></div>
                </div>
            </div>
        </div>
        <!-- content ---->

    </div>
""")))}),format.raw/*43.2*/("""
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
object about extends about_Scope0.about_Scope1.about
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 20:59:49 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/app/views/about.scala.html
                  HASH: d82796f691b97916e591f9fd8505f4840544a36e
                  MATRIX: 880->92|1014->131|1041->133|1063->147|1102->149|1133->154|1355->348|1384->349|1416->354|1738->649|1766->650|3067->1924|3082->1930|3141->1968|3398->2195
                  LINES: 32->4|37->4|38->5|38->5|38->5|39->6|46->13|46->13|47->14|50->17|50->17|67->34|67->34|67->34|76->43
                  -- GENERATED --
              */
          