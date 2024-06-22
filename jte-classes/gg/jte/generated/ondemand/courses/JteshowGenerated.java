package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursePage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,5,5,6,6,6,7,7,9,9,12,12,12,12,12,12,12,12,12,15,15,16,16,16,16,16,16,16,17,17,17,18,18,19,19,20,20,20,20,20,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <h1>");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(page.getHeader());
				jteOutput.writeContent("</h1>\n    ");
				if (page.getCourses().isEmpty()) {
					jteOutput.writeContent("\n        <p>No courses yet</p>\n    ");
				} else {
					jteOutput.writeContent("\n        <form action=\"/courses\" method=\"get\">\n            <label for=\"course-input\">Course name</label>\n            <input type=\"text\" required name=\"term\" id=\"course-input\"");
					var __jte_html_attribute_0 = page.getTerm();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("input", "value");
						jteOutput.writeUserContent(__jte_html_attribute_0);
						jteOutput.setContext("input", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">\n            <button>Enter</button>\n        </form>\n        ");
					for (var course : page.getCourses()) {
						jteOutput.writeContent("\n            <div><a href=\"/courses/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(course.id());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\"><h2>");
						jteOutput.setContext("h2", null);
						jteOutput.writeUserContent(course.name());
						jteOutput.writeContent("</h2></a></div>\n            <p>");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(course.description());
						jteOutput.writeContent("</p>\n        ");
					}
					jteOutput.writeContent("\n    ");
				}
				jteOutput.writeContent("\n");
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
