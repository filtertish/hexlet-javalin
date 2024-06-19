package gg.jte.generated.ondemand.users;
import org.example.hexlet.repository.UsersRepository;
public final class JteusersGenerated {
	public static final String JTE_NAME = "users/users.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,15,15,15,17,17,18,18,20,20,20,21,21,21,23,23,24,24,26,26,26,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersRepository usersRepository) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>Users list</title>\n</head>\n<body>\n<header>\n    <a href=\"/\">main</a>\n    <a href=\"/users/build\">add user</a>\n</header>\n");
		if (usersRepository.getUsers().isEmpty()) {
			jteOutput.writeContent("\n    <p>No users found</p>\n");
		} else {
			jteOutput.writeContent("\n    ");
			for (var user : usersRepository.getUsers()) {
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
		UsersRepository usersRepository = (UsersRepository)params.get("usersRepository");
		render(jteOutput, jteHtmlInterceptor, usersRepository);
	}
}
