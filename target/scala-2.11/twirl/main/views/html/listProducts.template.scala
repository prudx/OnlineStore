
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listProducts_Scope0 {
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

     object listProducts_Scope1 {
import models.products.Category
import models.products.Product
import models.users.User

class listProducts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[Category],List[Product],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], catId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.123*/("""


"""),format.raw/*7.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*8.2*/main("", user)/*8.16*/ {_display_(Seq[Any](format.raw/*8.18*/("""

	"""),format.raw/*10.2*/("""<style>
		form """),format.raw/*11.8*/("""{"""),format.raw/*11.9*/("""
			"""),format.raw/*12.4*/("""margin-bottom: 1em;
		"""),format.raw/*13.3*/("""}"""),format.raw/*13.4*/("""
	"""),format.raw/*14.2*/("""</style>

	<div class="row">

	  <div class="col-md-3">
	<div class="list-group">
			<!-- Start of For loop - For each c in categories add a link -->
			<a href=""""),_display_(/*21.14*/routes/*21.20*/.ProductCtrl.listProducts(0, filter)),format.raw/*21.56*/("""" class="list-group-item">All categories</a>
			"""),_display_(/*22.5*/for(c <- categories) yield /*22.25*/ {_display_(Seq[Any](format.raw/*22.27*/("""
		"""),format.raw/*23.3*/("""<a href=""""),_display_(/*23.13*/routes/*23.19*/.ProductCtrl.listProducts(c.getId, filter)),format.raw/*23.61*/("""" class="list-group-item">"""),_display_(/*23.88*/c/*23.89*/.getName),format.raw/*23.97*/("""</a>
			""")))}),format.raw/*24.5*/("""
	"""),format.raw/*25.2*/("""</div>
	  </div>

		<div class="col-md-9">
			"""),_display_(/*29.5*/if(flash.containsKey("success"))/*29.37*/ {_display_(Seq[Any](format.raw/*29.39*/("""
				  """),format.raw/*30.7*/("""<div class="alert alert-success">
					  """),_display_(/*31.9*/flash/*31.14*/.get("success")),format.raw/*31.29*/("""
				  """),format.raw/*32.7*/("""</div>
			""")))}),format.raw/*33.5*/("""

			"""),format.raw/*35.4*/("""<!-- Search Form -->
			<div id="actions">
			 <form action=""""),_display_(/*37.20*/routes/*37.26*/.ProductCtrl.listProducts(catId)),format.raw/*37.58*/("""" method="GET">
				<input type="search" id="searchbox" name="filter" value=""""),_display_(/*38.63*/filter),format.raw/*38.69*/("""" placeholder="Filter by product name...">
				<input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
			 </form>
			</div>

			<table class="table table-bordered table-hover table-condensed">
				<thead>
				<!-- The header row-->
				<tr>
					<th></th>
					<th>Name</th>
					<th>Description</th>
					<th>Stock</th>
					<th>Price</th>
					<th>Buy</th>
				</tr>
				</thead>
				<tbody>
					<!-- Start of For loop - For each p in products add a row -->
					"""),_display_(/*57.7*/for(p <- products) yield /*57.25*/ {_display_(Seq[Any](format.raw/*57.27*/("""
					"""),format.raw/*58.6*/("""<tr>
						<!-- Display each product field value in a column -->
						"""),_display_(/*60.8*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*60.96*/ {_display_(Seq[Any](format.raw/*60.98*/("""
							"""),format.raw/*61.8*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*61.63*/(p.getId)),format.raw/*61.72*/(""".jpg"/></td>
						""")))}/*62.9*/else/*62.14*/{_display_(Seq[Any](format.raw/*62.15*/("""
							"""),format.raw/*63.8*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
						""")))}),format.raw/*64.8*/("""
						"""),format.raw/*65.7*/("""<td>"""),_display_(/*65.12*/p/*65.13*/.getName),format.raw/*65.21*/("""</td>
						<td>"""),_display_(/*66.12*/p/*66.13*/.getDescription),format.raw/*66.28*/("""</td>
						<td>"""),_display_(/*67.12*/p/*67.13*/.getStock),format.raw/*67.22*/("""</td>
						<td>&euro; """),_display_(/*68.19*/("%.2f".format(p.getPrice))),format.raw/*68.46*/("""</td>
						<td><a href=""""),_display_(/*69.21*/routes/*69.27*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*69.61*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
					</tr>
					""")))}),format.raw/*71.7*/(""" """),format.raw/*71.8*/("""<!-- End of For loop -->

				</tbody>
			</table>
		</div>
	</div>
""")))}))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],catId:Long,filter:String,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,catId,filter,user)

  def f:((play.api.Environment,List[Category],List[Product],Long,String,User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,catId,filter,user) => apply(env,categories,products,catId,filter,user)

  def ref: this.type = this

}


}
}

/**/
object listProducts extends listProducts_Scope0.listProducts_Scope1.listProducts
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 17:59:01 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/OnlineStore/app/views/listProducts.scala.html
                  HASH: b0b0692b9c0dac6e7614b0506daa81590f06e174
                  MATRIX: 942->92|1159->213|1188->216|1259->262|1281->276|1320->278|1350->281|1392->296|1420->297|1451->301|1500->323|1528->324|1557->326|1747->489|1762->495|1819->531|1894->580|1930->600|1970->602|2000->605|2037->615|2052->621|2115->663|2169->690|2179->691|2208->699|2247->708|2276->710|2349->757|2390->789|2430->791|2464->798|2532->840|2546->845|2582->860|2616->867|2657->878|2689->883|2778->945|2793->951|2846->983|2951->1061|2978->1067|3506->1569|3540->1587|3580->1589|3613->1595|3711->1667|3808->1755|3848->1757|3883->1765|3965->1820|3995->1829|4033->1850|4046->1855|4085->1856|4120->1864|4231->1945|4265->1952|4297->1957|4307->1958|4336->1966|4380->1983|4390->1984|4426->1999|4470->2016|4480->2017|4510->2026|4561->2050|4609->2077|4662->2103|4677->2109|4732->2143|4878->2259|4906->2260
                  LINES: 32->4|37->4|40->7|41->8|41->8|41->8|43->10|44->11|44->11|45->12|46->13|46->13|47->14|54->21|54->21|54->21|55->22|55->22|55->22|56->23|56->23|56->23|56->23|56->23|56->23|56->23|57->24|58->25|62->29|62->29|62->29|63->30|64->31|64->31|64->31|65->32|66->33|68->35|70->37|70->37|70->37|71->38|71->38|90->57|90->57|90->57|91->58|93->60|93->60|93->60|94->61|94->61|94->61|95->62|95->62|95->62|96->63|97->64|98->65|98->65|98->65|98->65|99->66|99->66|99->66|100->67|100->67|100->67|101->68|101->68|102->69|102->69|102->69|104->71|104->71
                  -- GENERATED --
              */
          