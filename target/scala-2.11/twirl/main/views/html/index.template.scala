
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import models.products.Category
import models.products.Product
import models.users.User

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.api.Environment,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.41*/("""
"""),_display_(/*5.2*/main("", user)/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""
    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
    <!-- Introduction Row -->
    <div class="embed-responsive embed-responsive-16by9">
			    <video autoplay="" loop="" muted class="fillWidth fadeIn animated" poster="images/OldComputerAdsPoster.jpg" id="video-background">
				<source src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("videos/OldComputerAds.mp4")),format.raw/*10.71*/("""" type="video/mp4">Your browser does not support the video tag. I suggest you upgrade your browser.
			    </video>
		    </div>
    <div class="row">
        
			<div>
				<img src="http://www.returndates.com/backgrounds/mrrobot.logo.png" id="centerlogo">
			</div>
		    
		
    </div>
        

   
        <!-- /.row -->

    <!--Craig paste from your container to bottom of your code here-->
   
""")))}),format.raw/*28.2*/("""
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
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 17:55:44 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/OnlineStore/app/views/index.scala.html
                  HASH: 47e64752d83b0c5dc54c86634382e36458c264d8
                  MATRIX: 880->92|1014->131|1041->133|1063->147|1102->149|1133->154|1445->439|1460->445|1527->491|1959->893
                  LINES: 32->4|37->4|38->5|38->5|38->5|39->6|43->10|43->10|43->10|61->28
                  -- GENERATED --
              */
          