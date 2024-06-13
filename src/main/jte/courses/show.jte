@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page

<html lang="en">
<head>
    <title>Hexlet</title>
</head>
<body>
<h1>${page.getHeader()}</h1>
@if(page.getCourses().isEmpty())
    <p>No courses yet</p>
@else
    @for(var course : page.getCourses())
        <div><h2><a href="/courses/${course.id()}"></a>${course.name()}</h2></div>
        <p>${course.description()}</p>
    @endfor
@endif
</body>
</html>