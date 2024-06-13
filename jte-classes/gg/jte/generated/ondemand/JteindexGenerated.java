package gg.jte.generated.ondemand;
import org.example.hexlet.model.Course;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,15,15,15,16,16,16,17,17,18,18,18,19,19,19,20,20,24,24,24,1,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Course course, Long id) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\"\n          content=\"width=device-width, initial-scale=1.0\">\n    <title>Hello Hexlet!</title>\n</head>\n<body>\n<div>\n    <main>\n        ");
		if (course == null) {
			jteOutput.writeContent("\n            <h1>Course with id: ");
			jteOutput.setContext("h1", null);
			jteOutput.writeUserContent(id);
			jteOutput.writeContent(" is not found</h1>\n        ");
		} else {
			jteOutput.writeContent("\n            <h1>");
			jteOutput.setContext("h1", null);
			jteOutput.writeUserContent(course.name());
			jteOutput.writeContent("</h1>\n            <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(course.description());
			jteOutput.writeContent("</p>\n        ");
		}
		jteOutput.writeContent("\n    </main>\n</div>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Course course = (Course)params.get("course");
		Long id = (Long)params.get("id");
		render(jteOutput, jteHtmlInterceptor, course, id);
	}
}
