package gg.jte.generated.ondemand.cars;
import org.example.hexlet.dto.cars.CarsPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "cars/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,4,4,6,6,7,7,8,8,9,9,9,9,9,9,9,9,9,10,10,11,11,12,12,12,12,12,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CarsPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, null, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    ");
				if (!page.cars().isEmpty()) {
					jteOutput.writeContent("\n        ");
					for (var car : page.cars()) {
						jteOutput.writeContent("\n            <p><span style=\"font-style: italic\">");
						jteOutput.setContext("span", null);
						jteOutput.writeUserContent(car.getId());
						jteOutput.writeContent("</span> ");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(car.getMake());
						jteOutput.writeContent(" ");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(car.getModel());
						jteOutput.writeContent("</p>\n        ");
					}
					jteOutput.writeContent("\n    ");
				}
				jteOutput.writeContent("\n");
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CarsPage page = (CarsPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
