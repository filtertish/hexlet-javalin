package gg.jte.generated.ondemand.users;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "users/build.jte";
	public static final int[] JTE_LINE_INFO = {30,30,30,30,30,30,30,30,30,30,30};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>Add user</title>\n</head>\n<body>\n<header>\n    <a href=\"/users\">users</a>\n</header>\n<form action=\"/users\" method=\"post\">\n    <label>\n        Username:\n        <input type=\"text\" name=\"username\" required>\n    </label>\n    <label>\n        Email:\n        <input type=\"text\" name=\"email\" required>\n    </label>\n    <label>\n        Password:\n        <input type=\"text\" name=\"password\" required>\n    </label>\n    <label>\n        Password again:\n        <input type=\"text\" name=\"password-again\" required>\n    </label>\n    <button>Add user</button>\n</form>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
