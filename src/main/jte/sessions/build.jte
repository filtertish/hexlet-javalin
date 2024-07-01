@import org.example.hexlet.NamedRoutes

@template.layout.page(index = @`
    <form action="${NamedRoutes.sessionsRoot()}" method="post">
        <label>
            username
            <input type="text" name="username">
        </label>
        <label>
            password
            <input type="text" name="password">
        </label>
        <button>register</button>
    </form>
`)