package gg.jte.generated.ondemand.cars;
import org.example.hexlet.model.Car;
public final class JteshowGenerated {
	public static final String JTE_NAME = "cars/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,4,4,4,4,5,5,6,6,6,7,7,7,8,8,10,10,11,11,11,11,11,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Car car) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    ");
				if (car != null) {
					jteOutput.writeContent("\n        <p>");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(car.getMake());
					jteOutput.writeContent("</p>\n        <p>");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(car.getModel());
					jteOutput.writeContent("</p>\n    ");
				} else {
					jteOutput.writeContent("\n        <p>car with given id doesn't exist</p>\n    ");
				}
				jteOutput.writeContent("\n");
			}
		}, null, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Car car = (Car)params.get("car");
		render(jteOutput, jteHtmlInterceptor, car);
	}
}
