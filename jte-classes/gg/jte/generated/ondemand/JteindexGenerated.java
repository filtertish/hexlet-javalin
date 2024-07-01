package gg.jte.generated.ondemand;
import org.example.hexlet.model.Course;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,6,6,9,9,11,11,13,13,15,15,16,16,16,17,17,17,18,18,19,19,19,20,20,22,22,25,25,25,25,25,1,2,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Course course, Long id, Boolean visited, String authorized) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, null, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div>\n        ");
				if (!visited) {
					jteOutput.writeContent("\n            <h1><span style=\"color: #FF00FF\">Cookie</span> message - will be shown only once</h1>\n        ");
				}
				jteOutput.writeContent("\n        <main>\n            ");
				if (course != null) {
					jteOutput.writeContent("\n                <h1>");
					jteOutput.setContext("h1", null);
					jteOutput.writeUserContent(course.name());
					jteOutput.writeContent("</h1>\n                <p>");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(course.description());
					jteOutput.writeContent("</p>\n            ");
				} else if (id != null) {
					jteOutput.writeContent("\n                <h1>Course with id: ");
					jteOutput.setContext("h1", null);
					jteOutput.writeUserContent(id);
					jteOutput.writeContent(" is not found</h1>\n            ");
				} else {
					jteOutput.writeContent("\n                <h1>Try this app!</h1>\n            ");
				}
				jteOutput.writeContent("\n        </main>\n    </div>\n");
			}
		}, authorized);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Course course = (Course)params.get("course");
		Long id = (Long)params.get("id");
		Boolean visited = (Boolean)params.get("visited");
		String authorized = (String)params.get("authorized");
		render(jteOutput, jteHtmlInterceptor, course, id, visited, authorized);
	}
}
