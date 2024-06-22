package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
import org.example.hexlet.NamedRoutes;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,15,15,15,15,15,15,15,15,15,15,16,16,16,16,16,16,16,16,16,19,19,19,20,20,20,26,26,26,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content show, Content index) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>My site</title>\n</head>\n<body>\n<header>\n    <a href=\"/\">main page</a>\n    <a");
		var __jte_html_attribute_0 = NamedRoutes.coursesRoot();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">courses page</a>\n    <a");
		var __jte_html_attribute_1 = NamedRoutes.usersRoute();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">users page</a>\n</header>\n<main>\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(show);
		jteOutput.writeContent("\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(index);
		jteOutput.writeContent("\n</main>\n<footer>\n    <a href=\"https://github.com/filtertish/hexlet-javalin\" style=\"font-style: italic\">github</a>\n</footer>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content show = (Content)params.getOrDefault("show", null);
		Content index = (Content)params.getOrDefault("index", null);
		render(jteOutput, jteHtmlInterceptor, show, index);
	}
}
