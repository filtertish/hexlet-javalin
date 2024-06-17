package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,17,17,17,17,18,18,18,24,24,24,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content show, Content index) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>My site</title>\n</head>\n<body>\n<header>\n    <a href=\"/\">main page</a>\n    <a href=\"/courses\">courses page</a>\n</header>\n<main>\n    ");
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
