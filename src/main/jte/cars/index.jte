@import org.example.hexlet.dto.cars.CarsPage

@param CarsPage page

@template.layout.page(
index = @`
    @if(!page.cars().isEmpty())
        @for(var car : page.cars())
            <p><span style="font-style: italic">${car.getId()}</span> ${car.getMake()} ${car.getModel()}</p>
        @endfor
    @endif
`
)