
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object basket_Scope0 {
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

class basket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models.products._

Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("", customer)/*9.20*/ {_display_(Seq[Any](format.raw/*9.22*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*35.18*/if(customer.getBasket() != null)/*35.50*/ {_display_(Seq[Any](format.raw/*35.52*/("""
                    """),format.raw/*36.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*37.22*/for(i <- customer.getBasket().getBasketItems()) yield /*37.69*/ {_display_(Seq[Any](format.raw/*37.71*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getProduct.getName),format.raw/*39.50*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getDescription()),format.raw/*40.59*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getPrice))),format.raw/*41.64*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getItemTotal))),format.raw/*42.68*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getQuantity()),format.raw/*43.45*/("""</td>
                        <td><a href=""""),_display_(/*44.39*/routes/*44.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*44.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*45.39*/routes/*45.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*45.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*47.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*48.16*/("""
			"""),format.raw/*49.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*53.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*53.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*59.31*/routes/*59.37*/.ShoppingCtrl.emptyBasket()),format.raw/*59.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*65.31*/routes/*65.37*/.ShoppingCtrl.placeOrder()),format.raw/*65.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*75.24*/("""{"""),format.raw/*75.25*/("""
		"""),format.raw/*76.3*/("""return confirm('Are you sure?');
	"""),format.raw/*77.2*/("""}"""),format.raw/*77.3*/("""
"""),format.raw/*78.1*/("""</script>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


}

/**/
object basket extends basket_Scope0.basket
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 17:59:01 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineStore/OnlineStore/app/views/basket.scala.html
                  HASH: 6895c3f1c50d26c969ce0e0f9ca282367f72e137
                  MATRIX: 762->1|998->34|1026->149|1053->150|1124->196|1150->214|1189->216|1219->219|1292->266|1333->298|1373->300|1406->306|1477->350|1491->355|1527->370|1560->376|1600->386|1632->391|1986->718|2027->750|2067->752|2116->773|2226->856|2289->903|2329->905|2378->926|2439->960|2449->961|2489->980|2551->1015|2561->1016|2610->1044|2679->1086|2727->1113|2796->1155|2848->1186|2910->1221|2920->1222|2955->1236|3026->1280|3041->1286|3094->1318|3223->1420|3238->1426|3288->1455|3429->1565|3500->1605|3531->1609|3708->1759|3780->1809|3987->1989|4002->1995|4050->2022|4372->2317|4387->2323|4434->2349|4761->2648|4790->2649|4820->2652|4881->2686|4909->2687|4937->2688
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|42->12|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|65->35|65->35|65->35|66->36|67->37|67->37|67->37|68->38|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|77->47|78->48|79->49|83->53|83->53|89->59|89->59|89->59|95->65|95->65|95->65|105->75|105->75|106->76|107->77|107->77|108->78
                  -- GENERATED --
              */
          