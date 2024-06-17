@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page

@template.layout.page(
show = @`
    <h1>${page.getHeader()}</h1>
    @if(page.getCourses().isEmpty())
        <p>No courses yet</p>
    @else
        @for(var course : page.getCourses())
            <div><a href="/courses/${course.id()}"><h2>${course.name()}</h2></a></div>
            <p>${course.description()}</p>
        @endfor
    @endif
`
)