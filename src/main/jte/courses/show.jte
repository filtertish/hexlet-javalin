@import org.example.hexlet.NamedRoutes
@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page
@param Boolean flash

@template.layout.page(
show = @`
    @if(flash)
        <h1 style="color: #FF00FF">I am a flash message</h1>
    @endif
    <h1>${page.getHeader()}</h1>
    @if(page.getCourses().isEmpty())
        <p>No courses yet</p>
    @else
        <form action="${NamedRoutes.coursesRoot()}" method="get">
            <label for="course-input">Course name</label>
            <input type="text" required name="term" id="course-input" value="${page.getTerm()}">
            <button>Enter</button>
        </form>
        @for(var course : page.getCourses())
            <div><a href="/courses/${course.id()}"><h2>${course.name()}</h2></a></div>
            <p>${course.description()}</p>
        @endfor
    @endif
    <form action="${NamedRoutes.coursesRoot()}" method="post">
        <button>Test flash message</button>
    </form>
    <br>
`
)