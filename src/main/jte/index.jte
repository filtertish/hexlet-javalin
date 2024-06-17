@import org.example.hexlet.model.Course
@param Course course
@param Long id

@template.layout.page(
index = @`
    <div>
        <main>
            @if(course != null)
                <h1>${course.name()}</h1>
                <p>${course.description()}</p>
            @elseif(id != null)
                <h1>Course with id: ${id} is not found</h1>
            @else
                <h1>Try this app!</h1>
            @endif
        </main>
    </div>
`
)