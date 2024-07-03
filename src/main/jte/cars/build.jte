@import org.example.hexlet.NamedRoutes

@template.layout.page(index = @`
    <form action="${NamedRoutes.carsRoot()}" method="post">
        <label>
            make
            <input type="text" name="make">
        </label>
        <label>
            model
            <input type="text" name="model">
        </label>
        <button>add</button>
    </form>
`)