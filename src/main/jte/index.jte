@import org.example.hexlet.model.Course
@param Course course
@param Long id

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <title>Hello Hexlet!</title>
</head>
<body>
<div>
    <main>
        @if(course == null)
            <h1>Course with id: ${id} is not found</h1>
        @else
            <h1>${course.name()}</h1>
            <p>${course.description()}</p>
        @endif
    </main>
</div>
</body>
</html>