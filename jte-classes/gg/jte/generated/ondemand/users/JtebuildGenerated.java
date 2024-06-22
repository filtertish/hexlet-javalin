package gg.jte.generated.ondemand.users;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.dto.users.UserDto;
import org.example.hexlet.dto.users.ErrorData;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "users/build.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,15,15,15,15,15,15,15,15,15,15,17,17,17,17,17,17,17,17,17,20,20,21,21,21,21,21,21,21,21,21,22,22,24,24,28,28,29,29,29,29,29,29,29,29,29,30,30,32,32,43,43,44,44,45,45,46,46,46,47,47,48,48,49,49,52,52,52,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserDto user, ErrorData errorsDTO) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>Add user</title>\n</head>\n<body>\n<header>\n    <a");
		var __jte_html_attribute_0 = NamedRoutes.usersRoute();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">users</a>\n</header>\n<form");
		var __jte_html_attribute_1 = NamedRoutes.usersRoute();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" action=\"");
			jteOutput.setContext("form", "action");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("form", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" method=\"post\">\n    <label>\n        Username:\n        ");
		if (user != null) {
			jteOutput.writeContent("\n            <input type=\"text\" name=\"username\"");
			var __jte_html_attribute_2 = user.username();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("input", "value");
				jteOutput.writeUserContent(__jte_html_attribute_2);
				jteOutput.setContext("input", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n        ");
		} else {
			jteOutput.writeContent("\n            <input type=\"text\" name=\"username\" value=\"\">\n        ");
		}
		jteOutput.writeContent("\n    </label>\n    <label>\n        Email:\n        ");
		if (user != null) {
			jteOutput.writeContent("\n            <input type=\"text\" name=\"email\"");
			var __jte_html_attribute_3 = user.email();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("input", "value");
				jteOutput.writeUserContent(__jte_html_attribute_3);
				jteOutput.setContext("input", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n        ");
		} else {
			jteOutput.writeContent("\n            <input type=\"text\" name=\"email\" value=\"\">\n        ");
		}
		jteOutput.writeContent("\n    </label>\n    <label>\n        Password:\n        <input type=\"text\" name=\"password\" required>\n    </label>\n    <label>\n        Password again:\n        <input type=\"text\" name=\"password-again\" required>\n    </label>\n    <button>Add user</button>\n    ");
		if (errorsDTO != null) {
			jteOutput.writeContent("\n        ");
			if (!errorsDTO.errors().isEmpty()) {
				jteOutput.writeContent("\n            ");
				for (var error : errorsDTO.errors()) {
					jteOutput.writeContent("\n                <p>Error: ");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(error);
					jteOutput.writeContent("</p>\n            ");
				}
				jteOutput.writeContent("\n        ");
			}
			jteOutput.writeContent("\n    ");
		}
		jteOutput.writeContent("\n</form>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserDto user = (UserDto)params.getOrDefault("user", null);
		ErrorData errorsDTO = (ErrorData)params.getOrDefault("errorsDTO", null);
		render(jteOutput, jteHtmlInterceptor, user, errorsDTO);
	}
}
