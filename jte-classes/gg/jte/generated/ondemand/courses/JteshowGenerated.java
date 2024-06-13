package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursePage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,8,8,8,8,9,9,11,11,12,12,13,13,13,13,13,13,13,14,14,14,15,15,16,16,18,18,18,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page) {
		jteOutput.writeContent("\n<html lang=\"en\">\n<head>\n    <title>Hexlet</title>\n</head>\n<body>\n<h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(page.getHeader());
		jteOutput.writeContent("</h1>\n");
		if (page.getCourses().isEmpty()) {
			jteOutput.writeContent("\n    <p>No courses yet</p>\n");
		} else {
			jteOutput.writeContent("\n    ");
			for (var course : page.getCourses()) {
				jteOutput.writeContent("\n        <div><h2><a href=\"/courses/");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(course.id());
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\"></a>");
				jteOutput.setContext("h2", null);
				jteOutput.writeUserContent(course.name());
				jteOutput.writeContent("</h2></div>\n        <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(course.description());
				jteOutput.writeContent("</p>\n    ");
			}
			jteOutput.writeContent("\n");
		}
		jteOutput.writeContent("\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
