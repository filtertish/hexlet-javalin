package gg.jte.generated.ondemand.courses;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.dto.courses.CoursePage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,5,5,7,7,8,8,10,10,11,11,11,12,12,14,14,15,15,15,15,15,15,15,15,15,17,17,17,17,17,17,17,17,17,20,20,21,21,21,21,21,21,21,22,22,22,23,23,24,24,25,25,25,25,25,25,25,25,25,29,29,29,29,29,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page, Boolean flash) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    ");
				if (flash) {
					jteOutput.writeContent("\n        <h1 style=\"color: #FF00FF\">I am a flash message</h1>\n    ");
				}
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
				jteOutput.writeContent("\n    <form");
				var __jte_html_attribute_2 = NamedRoutes.coursesRoot();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\n        <button>Test flash message</button>\n    </form>\n    <br>\n");
			}
		}, null, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		Boolean flash = (Boolean)params.get("flash");
		render(jteOutput, jteHtmlInterceptor, page, flash);
	}
}
