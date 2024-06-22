package gg.jte.generated.ondemand.courses;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.dto.courses.CoursePage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,6,6,7,7,7,8,8,10,10,11,11,11,11,11,11,11,11,11,13,13,13,13,13,13,13,13,13,16,16,17,17,17,17,17,17,17,18,18,18,19,19,20,20,21,21,21,21,21,2,2,2,2};
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
					jteOutput.writeContent("\n        <form");
					var __jte_html_attribute_0 = NamedRoutes.coursesRoot();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
						jteOutput.writeContent(" action=\"");
						jteOutput.setContext("form", "action");
						jteOutput.writeUserContent(__jte_html_attribute_0);
						jteOutput.setContext("form", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(" method=\"get\">\n            <label for=\"course-input\">Course name</label>\n            <input type=\"text\" required name=\"term\" id=\"course-input\"");
					var __jte_html_attribute_1 = page.getTerm();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("input", "value");
						jteOutput.writeUserContent(__jte_html_attribute_1);
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
