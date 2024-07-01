@import org.example.hexlet.model.Course
@param Course course
@param Long id
@param Boolean visited
@param String authorized

@template.layout.page(
index = @`
    <div>
        @if(!visited)
            <h1><span style="color: #FF00FF">Cookie</span> message - will be shown only once</h1>
        @endif
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
`,
    authorized = authorized
)