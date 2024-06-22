package gg.jte.generated.ondemand.users;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.repository.UsersRepository;
public final class JteusersGenerated {
	public static final String JTE_NAME = "users/users.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,12,12,12,12,12,12,12,12,12,12,12,12,12,14,14,16,16,17,17,19,19,19,20,20,20,22,22,23,23,25,25,25,25,25,25};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>Users list</title>\n</head>\n<body>\n<header>\n    <a href=\"/\">main</a>\n    <a");
		var __jte_html_attribute_0 = NamedRoutes.buildUsersRoot();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">add user</a>\n</header>\n");
		if (UsersRepository.getUsers().isEmpty()) {
			jteOutput.writeContent("\n    <p>No users found</p>\n");
		} else {
			jteOutput.writeContent("\n    ");
			for (var user : UsersRepository.getUsers()) {
				jteOutput.writeContent("\n        <div style=\"border: 1px solid black\">\n            <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.name());
				jteOutput.writeContent("</p>\n            <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.email());
				jteOutput.writeContent("</p>\n        </div>\n    ");
			}
			jteOutput.writeContent("\n");
		}
		jteOutput.writeContent("\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
