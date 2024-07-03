@import org.example.hexlet.model.Car

@param Car car

@template.layout.page(show = @`
    @if(car != null)
        <p>${car.getMake()}</p>
        <p>${car.getModel()}</p>
    @else
        <p>car with given id doesn't exist</p>
    @endif
`)